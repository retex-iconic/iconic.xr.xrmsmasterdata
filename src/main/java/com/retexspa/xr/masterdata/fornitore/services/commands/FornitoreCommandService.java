package com.retexspa.xr.masterdata.fornitore.services.commands;

import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;
import java.util.concurrent.CompletableFuture;

public interface FornitoreCommandService {
  public CompletableFuture<Object> createFornitore(FornitoreDTO fornitoreDTO);

  public CompletableFuture<Object> updateFornitore(String fornitoreId, FornitoreDTO fornitoreDTO);
}
