package com.retexspa.xr.masterdata.articoloFornitore.services.queries;

import java.util.List;
import java.util.stream.Collectors;

import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.messaging.unitofwork.DefaultUnitOfWork;
import org.axonframework.messaging.unitofwork.UnitOfWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.articoloFornitore.aggregates.ArticoloFornitoreAggregate;
import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;

@Service
public class ArticoloFornitoreQueryServiceImpl implements ArticoloFornitoreQueryService {

    private final EventStore eventStore;
    UnitOfWork<?> unitOfWork;
    
    @Autowired
    private EventSourcingRepository<ArticoloFornitoreAggregate> articoloFornitoreAggregateEventSourcingRepository;

    @Autowired
    private EventSourcingRepository<ArticoloAggregate> articoloAggregateEventSourcingRepository;
    
    @Autowired
    private EventSourcingRepository<FornitoreAggregate> fornitoreAggregateEventSourcingRepository;


    public ArticoloFornitoreQueryServiceImpl(
        EventStore eventStore,
        EventSourcingRepository<ArticoloFornitoreAggregate> articoloFornitoreAggregateEventSourcingRepository) {
            this.eventStore = eventStore;
            this.articoloFornitoreAggregateEventSourcingRepository = articoloFornitoreAggregateEventSourcingRepository;
    }

    @Override
    public ArticoloFornitoreAggregate getArticoloFornitoreAggregate(String articoloFornitoreId) {
    unitOfWork = DefaultUnitOfWork.startAndGet(null);
    ArticoloFornitoreAggregate aggregate =
        articoloFornitoreAggregateEventSourcingRepository
            .load(articoloFornitoreId)
            .getWrappedAggregate()
            .getAggregateRoot();

    unitOfWork.rollback();
    return aggregate;
    }

    @Override
    public List<Object> listEventsForArticoloFornitore(String articoloFornitoreId) {
    return eventStore.readEvents(articoloFornitoreId).asStream().collect(Collectors.toList());
    }

    @Override
    public ArticoloAggregate articoloIndex(String articoloFornitoreId, String articoloId) {
        unitOfWork = DefaultUnitOfWork.startAndGet(null);
        ArticoloAggregate result =
            articoloAggregateEventSourcingRepository
                .load(articoloId)
                .getWrappedAggregate()
                .getAggregateRoot();
        unitOfWork.rollback();
        return result;
    }

    @Override
    public FornitoreAggregate fornitoreIndex(String articoloFornitoreId, String fornitoreId) {
        unitOfWork = DefaultUnitOfWork.startAndGet(null);
        FornitoreAggregate result =
            fornitoreAggregateEventSourcingRepository
                .load(fornitoreId)
                .getWrappedAggregate()
                .getAggregateRoot();
        unitOfWork.rollback();
        return result;
    }
}
