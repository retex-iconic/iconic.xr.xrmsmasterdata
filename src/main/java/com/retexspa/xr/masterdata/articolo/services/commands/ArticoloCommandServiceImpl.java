package com.retexspa.xr.masterdata.articolo.services.commands;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloAddFornitoreCommand;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloCreateCommand;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloUpdateCommand;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloAddFornitoreDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticoloCommandServiceImpl implements ArticoloCommandService {

  private final CommandGateway commandGateway;
  private final EventStore eventStore;
  UnitOfWork<?> unitOfWork;

  @Autowired
  private EventSourcingRepository<ArticoloAggregate> articoloAggregateEventSourcingRepository;

  @Autowired
  private EventSourcingRepository<FornitoreAggregate> fornitoreAggregateEventSourcingRepository;

  @Autowired
  private EventSourcingRepository<NegozioAggregate> negozioAggregateEventSourcingRepository;

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

  @Override
  public FornitoreAggregate fornitoreIndex(String articoloId, String fornitoreId) {
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
