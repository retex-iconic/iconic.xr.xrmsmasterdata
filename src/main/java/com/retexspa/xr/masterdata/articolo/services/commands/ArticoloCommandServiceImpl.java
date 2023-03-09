package com.retexspa.xr.masterdata.articolo.services.commands;

import com.retexspa.xr.masterdata.articolo.commands.ArticoloCreateCommand;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloUpdateCommand;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

@Service
public class ArticoloCommandServiceImpl implements ArticoloCommandService {

  private final CommandGateway commandGateway;

  public ArticoloCommandServiceImpl(CommandGateway commandGateway) {
    this.commandGateway = commandGateway;
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
}
