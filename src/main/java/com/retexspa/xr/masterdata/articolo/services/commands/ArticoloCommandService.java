package com.retexspa.xr.masterdata.articolo.services.commands;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloAddFornitoreDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ArticoloCommandService {
  public CompletableFuture<Object> createArticolo(ArticoloDTO articoloDTO);

  public CompletableFuture<Object> updateArticolo(String articoloId, ArticoloDTO articoloDTO);
  
  public List<Object> listEventsForArticolo(String articoloId);

  public ArticoloAggregate getArticoloAggregate(String articoloId);

  public CompletableFuture<String> addedFornitore(
      String articoloId, ArticoloAddFornitoreDTO articoloAddFornitoreDTO);

  public NegozioAggregate storeIndex(String articoloId, String storeId);

  public FornitoreAggregate fornitoreIndex(String articoloId, String fornitoreId);
}
// TODO: Implementare paginazione del listing degli eventi
