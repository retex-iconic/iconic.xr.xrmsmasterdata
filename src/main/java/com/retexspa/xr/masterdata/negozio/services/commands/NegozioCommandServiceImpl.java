package com.retexspa.xr.masterdata.negozio.services.commands;

import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;
import com.retexspa.xr.masterdata.negozio.commands.NegozioCreateCommand;
import com.retexspa.xr.masterdata.negozio.commands.StoreArticoloIndexCommand;
import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioCreateDTO;
import com.retexspa.xr.masterdata.negozio.commands.dto.StoreArticoloIndexDTO;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.messaging.unitofwork.DefaultUnitOfWork;
import org.axonframework.messaging.unitofwork.UnitOfWork;
import org.springframework.stereotype.Service;

@Service
public class NegozioCommandServiceImpl implements NegozioCommandService {

  private final CommandGateway commandGateway;
  private final EventStore eventStore;
  private EventSourcingRepository<NegozioAggregate> negozioAggregateEventSourcingRepository;
  private UnitOfWork<?> unitOfWork;

  public NegozioCommandServiceImpl(
      CommandGateway commandGateway,
      EventStore eventStore,
      EventSourcingRepository<NegozioAggregate> negozioAggregateEventSourcingRepository) {
    this.commandGateway = commandGateway;
    this.eventStore = eventStore;
    this.negozioAggregateEventSourcingRepository = negozioAggregateEventSourcingRepository;
  }

  @Override
  public CompletableFuture<Object> createNegozio(NegozioCreateDTO negozioCreateDTO) {
    CompletableFuture<Object> result =
        commandGateway.send(
            new NegozioCreateCommand(UUID.randomUUID().toString(), negozioCreateDTO.getCode()));
    return result;
  }

  @Override
  public List<Object> listEventsForNegozio(String negozioId) {
    return eventStore.readEvents(negozioId).asStream().collect(Collectors.toList());
  }

  @Override
  public NegozioAggregate getNegozioAggregate(String negozioId) {
    unitOfWork = DefaultUnitOfWork.startAndGet(null);
    return negozioAggregateEventSourcingRepository
        .load(negozioId)
        .getWrappedAggregate()
        .getAggregateRoot();
  }

  @Override
  public CompletableFuture<String> articoloIndex(
      String negozioId, StoreArticoloIndexDTO storeArticoloIndexDTO) {
    return commandGateway.send(
        new StoreArticoloIndexCommand(negozioId + " --> ", storeArticoloIndexDTO.getArticoloId()));
  }
}
