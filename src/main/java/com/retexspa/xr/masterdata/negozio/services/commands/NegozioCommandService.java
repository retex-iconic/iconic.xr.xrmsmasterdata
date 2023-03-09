package com.retexspa.xr.masterdata.negozio.services.commands;

import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import java.util.concurrent.CompletableFuture;

public interface NegozioCommandService {
  public CompletableFuture<Object> createNegozio(NegozioDTO negozioDTO);

  public CompletableFuture<Object> updateNegozio(String negozioId, NegozioDTO negozioDTO);
}
