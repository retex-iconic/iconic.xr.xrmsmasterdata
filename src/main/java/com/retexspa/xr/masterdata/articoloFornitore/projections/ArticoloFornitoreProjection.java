package com.retexspa.xr.masterdata.articoloFornitore.projections;

import com.retexspa.xr.masterdata.articoloFornitore.entities.ArticoloFornitoreQueryEntity;
import com.retexspa.xr.masterdata.articoloFornitore.events.ArticoloFornitoreCreatedEvent;
import com.retexspa.xr.masterdata.articoloFornitore.events.ArticoloFornitoreIndexEvent;
import com.retexspa.xr.masterdata.articoloFornitore.events.ArticoloFornitoreUpdatedEvent;
import com.retexspa.xr.masterdata.articoloFornitore.repositories.ArticoloFornitoreRepository;
import java.io.IOException;
import javax.persistence.EntityManager;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.eventhandling.ResetHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ProcessingGroup("articoliFornitori")
public class ArticoloFornitoreProjection {

  @Autowired private EntityManager entityManager;

  @Autowired private ArticoloFornitoreRepository articoloFornitoreRepository;

  public ArticoloFornitoreProjection(EntityManager entityManager, ArticoloFornitoreRepository articoloFornitoreRepository) {
    this.entityManager = entityManager;
    this.articoloFornitoreRepository = articoloFornitoreRepository;
  }

  @EventHandler
  public void on(ArticoloFornitoreCreatedEvent event) throws IOException {
    articoloFornitoreRepository.save(new ArticoloFornitoreQueryEntity(event.getId(), event.getData()));
  }

  @EventHandler
  public void on(ArticoloFornitoreUpdatedEvent event) throws IOException {
    ArticoloFornitoreQueryEntity entity = entityManager.find(ArticoloFornitoreQueryEntity.class, event.getId());
    entity.setFornitore(event.getData().getFornitore());
    entity.setArticolo(event.getData().getArticolo());
    entity.setCostoCartone(event.getData().getCostoCartone());
    entity.setPezziPerCartone(event.getData().getPezziPerCartone());
    entity.setLottoRiordino(event.getData().getLottoRiordino());
    entity.setNote(event.getData().getNote());
    entity.setMaster(event.getData().getMaster());
  }

  @EventHandler
  public void on(ArticoloFornitoreIndexEvent event) throws IOException {
    ArticoloFornitoreQueryEntity entity = entityManager.find(ArticoloFornitoreQueryEntity.class, event.getId());
    entity.setId(event.getId());
  }

  @ResetHandler
  public void reset() {
    articoloFornitoreRepository.deleteAll();
  }

  // TODO implements Replay handler (with transaction?)
}
