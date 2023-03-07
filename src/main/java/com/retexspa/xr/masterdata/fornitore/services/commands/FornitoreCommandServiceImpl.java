package com.retexspa.xr.masterdata.fornitore.services.commands;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import com.retexspa.xr.masterdata.fornitore.commands.FornitoreAddArticoloCommand;
import com.retexspa.xr.masterdata.fornitore.commands.FornitoreCreateCommand;
import com.retexspa.xr.masterdata.fornitore.commands.FornitoreUpdateCommand;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreAddArticoloDTO;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;
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
public class FornitoreCommandServiceImpl implements FornitoreCommandService {

  private final CommandGateway commandGateway;
  private final EventStore eventStore;
  private UnitOfWork<?> unitOfWork;

  @Autowired
  private EventSourcingRepository<ArticoloAggregate> articoloAggregateEventSourcingRepository;

  @Autowired
  private EventSourcingRepository<FornitoreAggregate> fornitoreAggregateEventSourcingRepository;

  @Autowired
  private EventSourcingRepository<NegozioAggregate> negozioAggregateEventSourcingRepository;

  public FornitoreCommandServiceImpl(
      CommandGateway commandGateway,
      EventStore eventStore,
      EventSourcingRepository<FornitoreAggregate> fornitoreAggregateEventSourcingRepository) {
    this.commandGateway = commandGateway;
    this.eventStore = eventStore;
    this.fornitoreAggregateEventSourcingRepository = fornitoreAggregateEventSourcingRepository;
  }

  @Override
  public CompletableFuture<Object> createFornitore(FornitoreDTO fornitoreDTO) {
    CompletableFuture<Object> result =
        commandGateway.send(new FornitoreCreateCommand(UUID.randomUUID().toString(), fornitoreDTO));
    return result;
  }

  @Override
  public CompletableFuture<Object> updateFornitore(String fornitoreId, FornitoreDTO fornitoreDTO) {
    CompletableFuture<Object> result =
        commandGateway.send(new FornitoreUpdateCommand(fornitoreId, fornitoreDTO));
    return result;
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

  @Override
  public CompletableFuture<String> addedArticolo(
      String fornitoreId, FornitoreAddArticoloDTO fornitoreAddArticoloDTO) {
    return commandGateway.send(
        new FornitoreAddArticoloCommand(fornitoreId, fornitoreAddArticoloDTO.getArticoloId()));
  }

  @Override
  public ArticoloAggregate articoloIndex(String fornitoreId, String articoloId) {
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
  public NegozioAggregate storeIndex(String fornitoreId, String storeId) {
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
