package com.retexspa.xr.masterdata.articolo.projections;

import org.axonframework.eventhandling.EventHandler;
//import org.axonframework.eventhandling.ResetHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.context.annotation.Bean;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloAddFornitoreCommand;
import com.retexspa.xr.masterdata.articolo.events.ArticoloAddedFornitoreEvent;
import com.retexspa.xr.masterdata.articolo.events.ArticoloCreatedEvent;
import com.retexspa.xr.masterdata.articolo.events.ArticoloUpdatedEvent;
//import com.retexspa.xr.masterdata.articolo.repositories.ArticoloRepository;

public class ArticoloProjection {

    //private ArticoloRepository articoloRepository;
    
    @Bean
    public ArticoloProjection projection() {
        return new ArticoloProjection();
    }
  
    @EventHandler
    public void on(ArticoloCreatedEvent event) {
        AggregateLifecycle.apply(new ArticoloCreatedEvent(event.id, event.data));
    }
  
    @EventHandler
    public void on(ArticoloUpdatedEvent event) {
        AggregateLifecycle.apply(new ArticoloUpdatedEvent(event.id, event.data));
    }
  
    @EventHandler
    public void on(ArticoloAddFornitoreCommand event) {
        AggregateLifecycle.apply(new ArticoloAddedFornitoreEvent(event.id, event.fornitoreId));
    }

    // @ResetHandler
    // public void reset() {
    //     articoloRepository.deleteAll();
    // }

    //TODO implements Replay handler (with transaction?)
}
