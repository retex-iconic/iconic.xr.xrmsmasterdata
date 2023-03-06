package com.retexspa.xr.masterdata.negozio.projections;

import com.retexspa.xr.masterdata.negozio.events.NegozioCreatedEvent;
// import com.retexspa.xr.masterdata.negozio.repositories.NegozioRepository;
import org.axonframework.eventhandling.EventHandler;
// import org.axonframework.eventhandling.ResetHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.context.annotation.Bean;

public class NegozioProjection {

  // private NegozioRepository negozioRepository;

  @Bean
  public NegozioProjection projection() {
    return new NegozioProjection();
  }

  @EventHandler
  public void on(NegozioCreatedEvent event) {
    AggregateLifecycle.apply(new NegozioCreatedEvent(event.id, event.code));
  }

  // @ResetHandler
  // public void reset() {
  //     negozioRepository.deleteAll();
  // }

  // TODO implements Replay handler (with transaction?)

}
