package com.retexspa.xr.masterdata.negozio.services.commands;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;
import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface NegozioCommandService {
  public CompletableFuture<Object> createNegozio(NegozioDTO negozioDTO);

  public CompletableFuture<Object> updateNegozio(String negozioId, NegozioDTO negozioDTO);

  public List<Object> listEventsForNegozio(String negozioId);

  public NegozioAggregate getNegozioAggregate(String negozioId);

  public ArticoloAggregate articoloIndex(String negozioId, String articoloId);

  public FornitoreAggregate fornitoreIndex(String negozioId, String fornitoreId);
}
