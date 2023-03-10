package com.retexspa.xr.masterdata.negozio.services.queries;

import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.messaging.unitofwork.DefaultUnitOfWork;
import org.axonframework.messaging.unitofwork.UnitOfWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.List;
import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;

@Service
public class NegozioQueryServiceImpl implements NegozioQueryService {

    private final EventStore eventStore;
    private UnitOfWork<?> unitOfWork;

    @Autowired
    private EventSourcingRepository<NegozioAggregate> negozioAggregateEventSourcingRepository;

    @Autowired
    private EventSourcingRepository<ArticoloAggregate> articoloAggregateEventSourcingRepository;

    @Autowired
    private EventSourcingRepository<FornitoreAggregate> fornitoreAggregateEventSourcingRepository;

    public NegozioQueryServiceImpl(
            EventStore eventStore,
            EventSourcingRepository<NegozioAggregate> negozioAggregateEventSourcingRepository) {
        this.eventStore = eventStore;
        this.negozioAggregateEventSourcingRepository = negozioAggregateEventSourcingRepository;
    }

    @Override
    public List<Object> listEventsForNegozio(String negozioId) {
        return eventStore.readEvents(negozioId).asStream().collect(Collectors.toList());
    }

    @Override
    public NegozioAggregate getNegozioAggregate(String negozioId) {
        unitOfWork = DefaultUnitOfWork.startAndGet(null);
        NegozioAggregate aggregate = negozioAggregateEventSourcingRepository
                .load(negozioId)
                .getWrappedAggregate()
                .getAggregateRoot();

        unitOfWork.rollback();
        return aggregate;
    }

    @Override
    public ArticoloAggregate articoloIndex(String storeId, String articoloId) {
        unitOfWork = DefaultUnitOfWork.startAndGet(null);
        ArticoloAggregate id = articoloAggregateEventSourcingRepository
                .load(articoloId)
                .getWrappedAggregate()
                .getAggregateRoot();
        unitOfWork.rollback();
        return id;
    }

    @Override
    public FornitoreAggregate fornitoreIndex(String storeId, String fornitoreId) {
        unitOfWork = DefaultUnitOfWork.startAndGet(null);
        FornitoreAggregate id = fornitoreAggregateEventSourcingRepository
                .load(fornitoreId)
                .getWrappedAggregate()
                .getAggregateRoot();
        unitOfWork.rollback();
        return id;
    }
}
