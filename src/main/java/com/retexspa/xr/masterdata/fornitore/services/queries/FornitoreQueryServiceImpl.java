package com.retexspa.xr.masterdata.fornitore.services.queries;

import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import java.util.List;
import java.util.stream.Collectors;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.messaging.unitofwork.DefaultUnitOfWork;
import org.axonframework.messaging.unitofwork.UnitOfWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornitoreQueryServiceImpl implements FornitoreQueryService {

  private final EventStore eventStore;

  private UnitOfWork<?> unitOfWork;

  @Autowired
  private EventSourcingRepository<FornitoreAggregate> fornitoreAggregateEventSourcingRepository;

  public FornitoreQueryServiceImpl(
      EventStore eventStore,
      EventSourcingRepository<FornitoreAggregate> fornitoreAggregateEventSourcingRepository) {
    this.eventStore = eventStore;
    this.fornitoreAggregateEventSourcingRepository = fornitoreAggregateEventSourcingRepository;
  }

  @Override
  public List<Object> listEventsForFornitore(String fornitoreId) {
    return eventStore.readEvents(fornitoreId).asStream().collect(Collectors.toList());
  }

  @Override
  public FornitoreAggregate getFornitoreAggregate(String fornitoreId) {
    unitOfWork = DefaultUnitOfWork.startAndGet(null);
    FornitoreAggregate aggregate =
        fornitoreAggregateEventSourcingRepository
            .load(fornitoreId)
            .getWrappedAggregate()
            .getAggregateRoot();

    unitOfWork.rollback();
    return aggregate;
  }
}
