package com.retexspa.xr.masterdata.fornitore.projections;

import com.retexspa.xr.masterdata.fornitore.entities.FornitoreQueryEntity;
import com.retexspa.xr.masterdata.fornitore.events.FornitoreAddedArticoloEvent;
import com.retexspa.xr.masterdata.fornitore.events.FornitoreCreatedEvent;
import com.retexspa.xr.masterdata.fornitore.events.FornitoreUpdatedEvent;
import com.retexspa.xr.masterdata.fornitore.repositories.FornitoreRepository;
import javax.persistence.EntityManager;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.eventhandling.ResetHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ProcessingGroup("fornit")
public class FornitoreProjection {

  @Autowired private EntityManager entityManager;

  @Autowired private FornitoreRepository fornitoreRepository;

  public FornitoreProjection(EntityManager entityManager, FornitoreRepository fornitoreRepository) {
    this.entityManager = entityManager;
    this.fornitoreRepository = fornitoreRepository;
  }

  @EventHandler
  public void on(FornitoreCreatedEvent event) {
    fornitoreRepository.save(new FornitoreQueryEntity(event.getId(), event.getdata()));
  }

  @EventHandler
  public void on(FornitoreUpdatedEvent event) {
    FornitoreQueryEntity entity = entityManager.find(FornitoreQueryEntity.class, event.getId());
    entity.setFornom(event.getData().getName());
    entity.setParent(event.getData().getParent());
  }

  @EventHandler
  public void on(FornitoreAddedArticoloEvent event) {
    //
  }

  @ResetHandler
  public void reset() {
    fornitoreRepository.deleteAll();
  }

  // TODO implements Replay handler (with transaction?)
}
