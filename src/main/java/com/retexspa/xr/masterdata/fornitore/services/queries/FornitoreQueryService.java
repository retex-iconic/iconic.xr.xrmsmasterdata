package com.retexspa.xr.masterdata.fornitore.services.queries;

import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import java.util.List;

public interface FornitoreQueryService {
  public List<Object> listEventsForFornitore(String fornitoreId);

  public FornitoreAggregate getFornitoreAggregate(String fornitoreId);
}
