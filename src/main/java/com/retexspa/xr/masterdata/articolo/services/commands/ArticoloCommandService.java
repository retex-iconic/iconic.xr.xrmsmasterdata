package com.retexspa.xr.masterdata.articolo.services.commands;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloAddFornitoreDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloFornitoreIndexDTO;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;

public interface ArticoloCommandService {
    public CompletableFuture<Object> createArticolo(ArticoloDTO articoloDTO);
    // TODO: Implentare paginazione del listing degli eventi
    public List<Object> listEventsForArticolo(String articoloId);
    public ArticoloAggregate getArticoloAggregate(String articoloId);
    public CompletableFuture<String> addedFornitore(String articoloId, ArticoloAddFornitoreDTO articoloAddFornitoreDTO);
    public NegozioAggregate storeIndex(String articoloId);
    public CompletableFuture<String> fornitoreIndex(String articoloId, ArticoloFornitoreIndexDTO articoloFornitoreIndexDTO);
}
