package com.retexspa.xr.masterdata.fornitore.services.commands;

import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import com.retexspa.xr.masterdata.fornitore.commands.FornitoreAddArticoloCommand;
import com.retexspa.xr.masterdata.fornitore.commands.FornitoreArticoloIndexCommand;
import com.retexspa.xr.masterdata.fornitore.commands.FornitoreCreateCommand;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreAddArticoloDTO;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreArticoloIndexDTO;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreCreateDTO;
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
public class FornitoreCommandServiceImpl implements FornitoreCommandService {

  private final CommandGateway commandGateway;
  private UnitOfWork<?> unitOfWork;
  private final EventStore eventStore;

  @Autowired
  private EventSourcingRepository<FornitoreAggregate> fornitoreAggregateEventSourcingRepository;

  public FornitoreCommandServiceImpl(
      CommandGateway commandGateway,
      EventStore eventStore,
      EventSourcingRepository<FornitoreAggregate> fornitoreAggregateEventSourcingRepository) {
    this.commandGateway = commandGateway;
    this.eventStore = eventStore;
    this.fornitoreAggregateEventSourcingRepository = fornitoreAggregateEventSourcingRepository;
  }

  @Override
  public CompletableFuture<Object> createFornitore(FornitoreCreateDTO fornitoreCreateDTO) {
    CompletableFuture<Object> result =
        commandGateway.send(
            new FornitoreCreateCommand(UUID.randomUUID().toString(), fornitoreCreateDTO.getName()));
    return result;
  }

  @Override
  public List<Object> listEventsForFornitore(String fornitoreId) {
    return eventStore.readEvents(fornitoreId).asStream().collect(Collectors.toList());
  }

  @Override
  public FornitoreAggregate getFornitoreAggregate(String fornitoreId) {
    unitOfWork = DefaultUnitOfWork.startAndGet(null);
    FornitoreAggregate aggregate = fornitoreAggregateEventSourcingRepository
        .load(fornitoreId)
        .getWrappedAggregate()
        .getAggregateRoot();

    unitOfWork.rollback();
    return aggregate;
  }

  @Override
  public CompletableFuture<String> addedArticolo(
      String fornitoreId, FornitoreAddArticoloDTO fornitoreAddArticoloDTO) {
    return commandGateway.send(
        new FornitoreAddArticoloCommand(fornitoreId, fornitoreAddArticoloDTO.getArticoloId()));
  }

  @Override
  public CompletableFuture<String> articoloIndex(
      String fornitoreId, FornitoreArticoloIndexDTO fornitoreArticoloIndexDTO) {
    return commandGateway.send(
        new FornitoreArticoloIndexCommand(fornitoreId, fornitoreArticoloIndexDTO.getArticoloId()));
  }
}
