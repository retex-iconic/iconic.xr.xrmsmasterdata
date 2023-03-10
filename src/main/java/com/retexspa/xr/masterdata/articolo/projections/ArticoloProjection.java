package com.retexspa.xr.masterdata.articolo.projections;

import com.retexspa.xr.masterdata.articolo.entities.ArticoloQueryEntity;
import com.retexspa.xr.masterdata.articolo.events.ArticoloCreatedEvent;
import com.retexspa.xr.masterdata.articolo.events.ArticoloStoredIndexEvent;
import com.retexspa.xr.masterdata.articolo.events.ArticoloUpdatedEvent;
import com.retexspa.xr.masterdata.articolo.repositories.ArticoloRepository;
import java.io.IOException;
import javax.persistence.EntityManager;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.eventhandling.ResetHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ProcessingGroup("articoli")
public class ArticoloProjection {

  @Autowired private EntityManager entityManager;

  @Autowired private ArticoloRepository articoloRepository;

  public ArticoloProjection(EntityManager entityManager, ArticoloRepository articoloRepository) {
    this.entityManager = entityManager;
    this.articoloRepository = articoloRepository;
  }

  @EventHandler
  public void on(ArticoloCreatedEvent event) throws IOException {
    articoloRepository.save(new ArticoloQueryEntity(event.getId(), event.getData()));
  }

  @EventHandler
  public void on(ArticoloUpdatedEvent event) throws IOException {
    ArticoloQueryEntity entity = entityManager.find(ArticoloQueryEntity.class, event.getId());
    entity.setCodice1(event.getData().getCodice());
    entity.setCodice2(event.getData().getCodice2());
    entity.setCodice3(event.getData().getCodice3());
    entity.setCodice4(event.getData().getCodice4());
    entity.setDescrizione(event.getData().getDescrizione());
    entity.setMaster(event.getData().getMaster());
    entity.setProduttore(event.getData().getProduttore());
    entity.setReparto(event.getData().getReparto());
  }

  @ResetHandler
  public void reset() {
    articoloRepository.deleteAll();
  }

  // TODO implements Replay handler (with transaction?)
}
