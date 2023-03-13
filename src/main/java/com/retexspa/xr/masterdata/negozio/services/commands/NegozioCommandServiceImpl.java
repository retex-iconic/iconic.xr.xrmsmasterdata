package com.retexspa.xr.masterdata.negozio.services.commands;

import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;
import com.retexspa.xr.masterdata.negozio.commands.NegozioCreateCommand;
import com.retexspa.xr.masterdata.negozio.commands.NegozioUpdateCommand;
import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.stereotype.Service;

@Service
public class NegozioCommandServiceImpl implements NegozioCommandService {

  private final CommandGateway commandGateway;

  public NegozioCommandServiceImpl(
      CommandGateway commandGateway,
      EventStore eventStore,
      EventSourcingRepository<NegozioAggregate> negozioAggregateEventSourcingRepository) {
    this.commandGateway = commandGateway;
  }

  @Override
  public CompletableFuture<Object> createNegozio(NegozioDTO negozioDTO) {
    CompletableFuture<Object> result =
        commandGateway.send(new NegozioCreateCommand(UUID.randomUUID().toString(), negozioDTO));
    return result;
  }

  @Override
  public CompletableFuture<Object> updateNegozio(String negozioId, NegozioDTO negozioDTO) {
    CompletableFuture<Object> result =
        commandGateway.send(new NegozioUpdateCommand(negozioId, negozioDTO));
    return result;
  }

  
}
