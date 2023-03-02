package com.retexspa.xr.masterdata.fornitore.services.commands;

import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreAddArticoloDTO;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreArticoloIndexDTO;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreCreateDTO;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface FornitoreCommandService {
  public CompletableFuture<Object> createFornitore(FornitoreCreateDTO fornitoreCreateDTO);

  public List<Object> listEventsForFornitore(String fornitoreId);

  public FornitoreAggregate getFornitoreAggregate(String fornitoreId);

  public CompletableFuture<String> addedArticolo(
      String fornitoreId, FornitoreAddArticoloDTO fornitoreAddArticoloDTO);

  public CompletableFuture<String> articoloIndex(
      String fornitoreId, FornitoreArticoloIndexDTO fornitoreArticoloIndexDTO);
}
