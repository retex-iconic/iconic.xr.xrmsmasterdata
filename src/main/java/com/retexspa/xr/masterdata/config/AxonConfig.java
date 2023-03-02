package com.retexspa.xr.masterdata.config;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
@Configuration
public class AxonConfig {

    @Bean
    EventSourcingRepository<ArticoloAggregate> articoliAggregateEventSourcingRepository(EventStore eventStore){
        EventSourcingRepository<ArticoloAggregate> repository = EventSourcingRepository.builder(ArticoloAggregate.class).eventStore(eventStore).build();
        return repository;
    }
}
