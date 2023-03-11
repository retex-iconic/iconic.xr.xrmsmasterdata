package com.retexspa.xr.masterdata.articoloFornitore.services.commands;

import com.retexspa.xr.masterdata.articoloFornitore.commands.ArticoloFornitoreCreateCommand;
import com.retexspa.xr.masterdata.articoloFornitore.commands.ArticoloFornitoreUpdateCommand;
import com.retexspa.xr.masterdata.articoloFornitore.commands.dto.ArticoloFornitoreDTO;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

@Service
public class ArticoloFornitoreCommandServiceImpl implements ArticoloFornitoreCommandService {

  private final CommandGateway commandGateway;

  public ArticoloFornitoreCommandServiceImpl(CommandGateway commandGateway) {
    this.commandGateway = commandGateway;
  }

  @Override
  public CompletableFuture<Object> createArticoloFornitore(
      ArticoloFornitoreDTO articoloFornitoreDTO) {
    CompletableFuture<Object> result =
        commandGateway.send(
            new ArticoloFornitoreCreateCommand(UUID.randomUUID().toString(), articoloFornitoreDTO));
    return result;
  }

  @Override
  public CompletableFuture<Object> updateArticoloFornitore(
      String articoloFornitoreId, ArticoloFornitoreDTO articoloFornitoreDTO) {
    CompletableFuture<Object> result =
        commandGateway.send(
            new ArticoloFornitoreUpdateCommand(articoloFornitoreId, articoloFornitoreDTO));
    return result;
  }
}
