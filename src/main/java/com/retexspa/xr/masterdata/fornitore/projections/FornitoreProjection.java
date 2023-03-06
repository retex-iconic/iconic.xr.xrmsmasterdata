package com.retexspa.xr.masterdata.fornitore.projections;

import com.retexspa.xr.masterdata.fornitore.events.FornitoreAddedArticoloEvent;
import com.retexspa.xr.masterdata.fornitore.events.FornitoreCreatedEvent;
// import com.retexspa.xr.masterdata.fornitore.repositories.FornitoreRepository;
import org.axonframework.eventhandling.EventHandler;
// import org.axonframework.eventhandling.ResetHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.context.annotation.Bean;

public class FornitoreProjection {

  // private FornitoreRepository fornitoreRepository;

  @Bean
  public FornitoreProjection projection() {
    return new FornitoreProjection();
  }

  @EventHandler
  public void on(FornitoreCreatedEvent event) {
    AggregateLifecycle.apply(new FornitoreCreatedEvent(event.id, event.name));
  }

  @EventHandler
  public void on(FornitoreAddedArticoloEvent event) {
    AggregateLifecycle.apply(new FornitoreAddedArticoloEvent(event.id, event.articoloId));
  }

  // @ResetHandler
  // public void reset() {
  //     fornitoreRepository.deleteAll();
  // }

  // TODO implements Replay handler (with transaction?)
}
