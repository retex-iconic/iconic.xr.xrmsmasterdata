package com.retexspa.xr.masterdata.articolo.services.queries;

import java.util.List;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;

public interface ArticoloQueryService {
    // substitute aggregate con query entity
    public List<Object> listEventsForArticolo(String articoloId);

    public ArticoloAggregate getArticoloAggregate(String articoloId);
  
    public NegozioAggregate storeIndex(String articoloId, String storeId);
}
