package com.retexspa.xr.masterdata.negozio.services.commands;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;
import com.retexspa.xr.masterdata.negozio.commands.NegozioCreateCommand;
import com.retexspa.xr.masterdata.negozio.commands.NegozioUpdateCommand;
import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.messaging.unitofwork.DefaultUnitOfWork;
import org.axonframework.messaging.unitofwork.UnitOfWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NegozioCommandServiceImpl implements NegozioCommandService {

  private final CommandGateway commandGateway;
  private final EventStore eventStore;
  private UnitOfWork<?> unitOfWork;

  @Autowired
  private EventSourcingRepository<NegozioAggregate> negozioAggregateEventSourcingRepository;

  @Autowired
  private EventSourcingRepository<ArticoloAggregate> articoloAggregateEventSourcingRepository;

  @Autowired
  private EventSourcingRepository<FornitoreAggregate> fornitoreAggregateEventSourcingRepository;

  public NegozioCommandServiceImpl(
      CommandGateway commandGateway,
      EventStore eventStore,
      EventSourcingRepository<NegozioAggregate> negozioAggregateEventSourcingRepository) {
    this.commandGateway = commandGateway;
    this.eventStore = eventStore;
    this.negozioAggregateEventSourcingRepository = negozioAggregateEventSourcingRepository;
  }

  @Override
  public CompletableFuture<Object> createNegozio(NegozioDTO negozioDTO) {
    CompletableFuture<Object> result =
        commandGateway.send(new NegozioCreateCommand(UUID.randomUUID().toString(), negozioDTO));
    return result;
  }

  @Override
  public List<Object> listEventsForNegozio(String negozioId) {
    return eventStore.readEvents(negozioId).asStream().collect(Collectors.toList());
  }

  @Override
  public NegozioAggregate getNegozioAggregate(String negozioId) {
    unitOfWork = DefaultUnitOfWork.startAndGet(null);
    NegozioAggregate aggregate =
        negozioAggregateEventSourcingRepository
            .load(negozioId)
            .getWrappedAggregate()
            .getAggregateRoot();

    unitOfWork.rollback();
    return aggregate;
  }

  @Override
  public CompletableFuture<Object> updateNegozio(String negozioId, NegozioDTO negozioDTO) {
    CompletableFuture<Object> result =
        commandGateway.send(new NegozioUpdateCommand(negozioId, negozioDTO));
    return result;
  }

  @Override
  public ArticoloAggregate articoloIndex(String storeId, String articoloId) {
    unitOfWork = DefaultUnitOfWork.startAndGet(null);
    ArticoloAggregate id =
        articoloAggregateEventSourcingRepository
            .load(articoloId)
            .getWrappedAggregate()
            .getAggregateRoot();
    unitOfWork.rollback();
    return id;
  }

  @Override
  public FornitoreAggregate fornitoreIndex(String storeId, String fornitoreId) {
    unitOfWork = DefaultUnitOfWork.startAndGet(null);
    FornitoreAggregate id =
        fornitoreAggregateEventSourcingRepository
            .load(fornitoreId)
            .getWrappedAggregate()
            .getAggregateRoot();
    unitOfWork.rollback();
    return id;
  }
}
