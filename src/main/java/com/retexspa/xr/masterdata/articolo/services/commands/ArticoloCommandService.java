package com.retexspa.xr.masterdata.articolo.services.commands;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloAddFornitoreDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloCreateDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloFornitoreIndexDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloStoreIndexDTO;

public interface ArticoloCommandService {
    public CompletableFuture<Object> createArticolo(ArticoloCreateDTO articoliCreateDTO);
    // TODO: Implentare paginazione del listing degli eventi
    public List<Object> listEventsForArticolo(String articoloId);
    public ArticoloAggregate getArticoloAggregate(String articoloId);
    public CompletableFuture<String> addedFornitore(String articoloId, ArticoloAddFornitoreDTO articoloAddFornitoreDTO);
    public CompletableFuture<String> storeIndex(String articoloId, ArticoloStoreIndexDTO articoloStoreIndexDTO);
    public CompletableFuture<String> fornitoreIndex(String articoloId, ArticoloFornitoreIndexDTO articoloFornitoreIndexDTO);
}
