package com.retexspa.xr.masterdata.articolo.services.commands;

import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import java.util.concurrent.CompletableFuture;

public interface ArticoloCommandService {
  public CompletableFuture<Object> createArticolo(ArticoloDTO articoloDTO);

  public CompletableFuture<Object> updateArticolo(String articoloId, ArticoloDTO articoloDTO);
}
// TODO: Implementare paginazione del listing degli eventi
