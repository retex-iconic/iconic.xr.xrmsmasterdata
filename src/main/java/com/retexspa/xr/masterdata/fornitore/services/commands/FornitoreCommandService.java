package com.retexspa.xr.masterdata.fornitore.services.commands;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreAddArticoloDTO;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface FornitoreCommandService {
  public CompletableFuture<Object> createFornitore(FornitoreDTO fornitoreDTO);

  public CompletableFuture<Object> updateFornitore(String fornitoreId, FornitoreDTO fornitoreDTO);

  public List<Object> listEventsForFornitore(String fornitoreId);

  public FornitoreAggregate getFornitoreAggregate(String fornitoreId);

  public CompletableFuture<String> addedArticolo(String fornitoreId, FornitoreAddArticoloDTO fornitoreAddArticoloDTO);

  public ArticoloAggregate articoloIndex(String fornitoreId, String articoloId);

  public NegozioAggregate storeIndex(String fornitoreId, String storeId);
}
