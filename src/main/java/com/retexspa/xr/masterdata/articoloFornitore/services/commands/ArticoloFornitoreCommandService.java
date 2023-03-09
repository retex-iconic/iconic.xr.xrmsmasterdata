package com.retexspa.xr.masterdata.articoloFornitore.services.commands;

import com.retexspa.xr.masterdata.articoloFornitore.commands.dto.ArticoloFornitoreDTO;
import java.util.concurrent.CompletableFuture;

public interface ArticoloFornitoreCommandService {
  public CompletableFuture<Object> createArticoloFornitore(ArticoloFornitoreDTO articoloFornitoreDTO);

  public CompletableFuture<Object> updateArticoloFornitore(String articoloFornitoreId, ArticoloFornitoreDTO articoloFornitoreDTO);
}
// TODO: Implementare paginazione del listing degli eventi
