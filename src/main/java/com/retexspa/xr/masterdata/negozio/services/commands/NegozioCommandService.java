package com.retexspa.xr.masterdata.negozio.services.commands;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;
import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioCreateDTO;
import com.retexspa.xr.masterdata.negozio.commands.dto.StoreArticoloIndexDTO;

public interface NegozioCommandService {
    public CompletableFuture<Object> createNegozio(NegozioCreateDTO negozioCreateDTO);
    public List<Object> listEventsForNegozio(String negozioId);
    public NegozioAggregate getNegozioAggregate(String negozioId);
    public CompletableFuture<String> articoloIndex(String negozioId, StoreArticoloIndexDTO storeArticoloIndexDTO);
}
