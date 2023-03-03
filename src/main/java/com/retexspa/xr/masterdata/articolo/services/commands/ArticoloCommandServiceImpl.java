package com.retexspa.xr.masterdata.articolo.services.commands;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloAddFornitoreCommand;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloCreateCommand;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloUpdateCommand;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloFornitoreIndexCommand;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloAddFornitoreDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloFornitoreIndexDTO;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;
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
public class ArticoloCommandServiceImpl implements ArticoloCommandService {

  private final CommandGateway commandGateway;
  private final EventStore eventStore;
  private EventSourcingRepository<ArticoloAggregate> articoloAggregateEventSourcingRepository;
  private EventSourcingRepository<NegozioAggregate> negozioAggregateEventSourcingRepository;
  private UnitOfWork<?> unitOfWork;

  public ArticoloCommandServiceImpl(
      CommandGateway commandGateway,
      EventStore eventStore,
      EventSourcingRepository<ArticoloAggregate> articoloAggregateEventSourcingRepository) {
    this.commandGateway = commandGateway;
    this.eventStore = eventStore;
    this.articoloAggregateEventSourcingRepository = articoloAggregateEventSourcingRepository;
  }

  @Override
  public ArticoloAggregate getArticoloAggregate(String articoloId) {
    unitOfWork = DefaultUnitOfWork.startAndGet(null);
    return articoloAggregateEventSourcingRepository
        .load(articoloId)
        .getWrappedAggregate()
        .getAggregateRoot();
  }

  @Override
  public List<Object> listEventsForArticolo(String articoloId) {
    return eventStore.readEvents(articoloId).asStream().collect(Collectors.toList());
  }

  @Override
  public CompletableFuture<Object> createArticolo(ArticoloDTO articoloDTO) {
    CompletableFuture<Object> result =
        commandGateway.send(new ArticoloCreateCommand(UUID.randomUUID().toString(), articoloDTO));
    return result;
  }

  @Override
  public CompletableFuture<Object> updateArticolo(String articoloId, ArticoloDTO articoloDTO) {
    CompletableFuture<Object> result =
        commandGateway.send(new ArticoloUpdateCommand(articoloId, articoloDTO));
    return result;
  }

  @Override
  public CompletableFuture<String> addedFornitore(
      String articoloId, ArticoloAddFornitoreDTO articoloAddFornitoreDTO) {
    return commandGateway.send(
        new ArticoloAddFornitoreCommand(articoloId, articoloAddFornitoreDTO.getFornitoreId()));
  }

  @Override
  public NegozioAggregate storeIndex(String articoloId) {
    unitOfWork = DefaultUnitOfWork.startAndGet(null);
    return negozioAggregateEventSourcingRepository
        .load(articoloId)
        .getWrappedAggregate()
        .getAggregateRoot();
  }

  @Override
  public CompletableFuture<String> fornitoreIndex(
      String articoloId, ArticoloFornitoreIndexDTO articoloFornitoreIndexDTO) {
    return commandGateway.send(
        new ArticoloFornitoreIndexCommand(
            articoloId + " --> ", articoloFornitoreIndexDTO.getFornitoreId()));
  }


}
