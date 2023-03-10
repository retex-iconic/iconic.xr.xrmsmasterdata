package com.retexspa.xr.masterdata.config;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.articoloFornitore.aggregates.ArticoloFornitoreAggregate;
import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {

  @Bean
  EventSourcingRepository<ArticoloAggregate> articoliAggregateEventSourcingRepository(EventStore eventStore) {
    EventSourcingRepository<ArticoloAggregate> repository =
        EventSourcingRepository.builder(ArticoloAggregate.class).eventStore(eventStore).build();
    return repository;
  }

  @Bean
  EventSourcingRepository<ArticoloFornitoreAggregate> articoliFornitoriAggregateEventSourcingRepository(EventStore eventStore) {
    EventSourcingRepository<ArticoloFornitoreAggregate> repository =
    EventSourcingRepository.builder(ArticoloFornitoreAggregate.class).eventStore(eventStore).build();
    return repository;
  }

  @Bean
  EventSourcingRepository<FornitoreAggregate> fornitoriAggregateEventSourcingRepository(EventStore eventStore) {
    EventSourcingRepository<FornitoreAggregate> repository =
    EventSourcingRepository.builder(FornitoreAggregate.class).eventStore(eventStore).build();
    return repository;
  }

  @Bean
  EventSourcingRepository<NegozioAggregate> negoziAggregateEventSourcingRepository(EventStore eventStore) {
    EventSourcingRepository<NegozioAggregate> repository =
    EventSourcingRepository.builder(NegozioAggregate.class).eventStore(eventStore).build();
    return repository;
  }
}
