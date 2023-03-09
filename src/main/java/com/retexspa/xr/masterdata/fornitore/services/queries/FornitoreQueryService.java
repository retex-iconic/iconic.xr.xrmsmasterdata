package com.retexspa.xr.masterdata.fornitore.services.queries;

import java.util.List;

import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;

public interface FornitoreQueryService {
    public List<Object> listEventsForFornitore(String fornitoreId);

    public FornitoreAggregate getFornitoreAggregate(String fornitoreId);
}
