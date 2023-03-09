package com.retexspa.xr.masterdata.fornitore.services.commands;

import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import com.retexspa.xr.masterdata.fornitore.commands.FornitoreCreateCommand;
import com.retexspa.xr.masterdata.fornitore.commands.FornitoreUpdateCommand;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.stereotype.Service;

@Service
public class FornitoreCommandServiceImpl implements FornitoreCommandService {

  private final CommandGateway commandGateway;

  public FornitoreCommandServiceImpl(
      CommandGateway commandGateway,
      EventStore eventStore,
      EventSourcingRepository<FornitoreAggregate> fornitoreAggregateEventSourcingRepository) {
    this.commandGateway = commandGateway;
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
}
