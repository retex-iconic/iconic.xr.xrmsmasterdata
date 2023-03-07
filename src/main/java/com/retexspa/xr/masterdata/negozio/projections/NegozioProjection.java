package com.retexspa.xr.masterdata.negozio.projections;

import com.retexspa.xr.masterdata.negozio.entities.NegozioQueryEntity;
import com.retexspa.xr.masterdata.negozio.events.NegozioCreatedEvent;
import com.retexspa.xr.masterdata.negozio.events.NegozioUpdatedEvent;
import com.retexspa.xr.masterdata.negozio.repositories.NegozioRepository;
import java.io.IOException;
import javax.persistence.EntityManager;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.eventhandling.ResetHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ProcessingGroup("infoinst")
public class NegozioProjection {

  @Autowired private EntityManager entityManager;

  @Autowired private NegozioRepository negozioRepository;

  public NegozioProjection(EntityManager entityManager, NegozioRepository negozioRepository) {
    this.entityManager = entityManager;
    this.negozioRepository = negozioRepository;
  }

  @EventHandler
  public void on(NegozioCreatedEvent event) throws IOException {
    negozioRepository.save(new NegozioQueryEntity(event.id, event.data));
  }

  @EventHandler
  public void on(NegozioUpdatedEvent event) {
    NegozioQueryEntity entity = entityManager.find(NegozioQueryEntity.class, event.getId());
    entity.setIdcodice(event.getData().getCode());
    entity.setParent(event.getData().getParent());
  }

  @ResetHandler
  public void reset() {
    negozioRepository.deleteAll();
  }

  // TODO implements Replay handler (with transaction?)

}
