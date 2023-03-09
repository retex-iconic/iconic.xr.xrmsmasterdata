package com.retexspa.xr.masterdata.articolo.services.queries;

import java.util.List;
import java.util.stream.Collectors;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.messaging.unitofwork.DefaultUnitOfWork;
import org.axonframework.messaging.unitofwork.UnitOfWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;

@Service
public class ArticoloQueryServiceImpl implements ArticoloQueryService {

    private final EventStore eventStore;
    UnitOfWork<?> unitOfWork;
    
    @Autowired
    private EventSourcingRepository<ArticoloAggregate> articoloAggregateEventSourcingRepository;
  
    @Autowired
    private EventSourcingRepository<NegozioAggregate> negozioAggregateEventSourcingRepository;

    public ArticoloQueryServiceImpl(EventStore eventStore, EventSourcingRepository<ArticoloAggregate> articoloAggregateEventSourcingRepository) {
        this.articoloAggregateEventSourcingRepository = articoloAggregateEventSourcingRepository;
        this.eventStore = eventStore;
    }

    @Override
    public ArticoloAggregate getArticoloAggregate(String articoloId) {
      unitOfWork = DefaultUnitOfWork.startAndGet(null);
      ArticoloAggregate aggregate =
          articoloAggregateEventSourcingRepository
              .load(articoloId)
              .getWrappedAggregate()
              .getAggregateRoot();
      unitOfWork.rollback();
      return aggregate;
    }

    @Override
    public List<Object> listEventsForArticolo(String articoloId) {
      return eventStore.readEvents(articoloId).asStream().collect(Collectors.toList());
    }

    @Override
    public NegozioAggregate storeIndex(String articoloId, String storeId) {
      unitOfWork = DefaultUnitOfWork.startAndGet(null);
      NegozioAggregate result =
          negozioAggregateEventSourcingRepository
              .load(storeId)
              .getWrappedAggregate()
              .getAggregateRoot();
      unitOfWork.rollback();
      return result;
    }
}
