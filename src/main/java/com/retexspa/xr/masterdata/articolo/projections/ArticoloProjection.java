package com.retexspa.xr.masterdata.articolo.projections;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloAddFornitoreCommand;
import com.retexspa.xr.masterdata.articolo.entities.ArticoloQueryEntity;
import com.retexspa.xr.masterdata.articolo.events.ArticoloAddedFornitoreEvent;
import com.retexspa.xr.masterdata.articolo.events.ArticoloCreatedEvent;
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

  @Autowired
  private EntityManager entityManager;

  @Autowired
  private ArticoloRepository articoloRepository;
  
  public ArticoloProjection(EntityManager entityManager, ArticoloRepository articoloRepository) {
    this.entityManager = entityManager;
    this.articoloRepository = articoloRepository;
  }

  @EventHandler
  public void on(ArticoloCreatedEvent event) throws IOException {
    articoloRepository.save(new ArticoloQueryEntity(event.getId(), event.getData()));
  }

  @EventHandler
  public void on(ArticoloUpdatedEvent event) {
    // ArticoloQueryEntity entity = entityManager.find(ArticoloQueryEntity.class, event.getId());
    // entity.setData(event.getData());
  }

  @EventHandler
  public void on(ArticoloAddFornitoreCommand event) {
    //articoloRepository.save(new ArticoloQueryEntity(event.getId(), event.getFornitoreId()));
  }

  @ResetHandler
  public void reset() {
      articoloRepository.deleteAll();
  }

  // TODO implements Replay handler (with transaction?)
}
