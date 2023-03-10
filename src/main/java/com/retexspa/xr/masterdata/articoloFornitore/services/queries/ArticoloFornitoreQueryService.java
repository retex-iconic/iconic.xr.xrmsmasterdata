package com.retexspa.xr.masterdata.articoloFornitore.services.queries;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.articoloFornitore.aggregates.ArticoloFornitoreAggregate;
import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import java.util.List;

public interface ArticoloFornitoreQueryService {
  public List<Object> listEventsForArticoloFornitore(String articoloFornitoreId);

  public ArticoloFornitoreAggregate getArticoloFornitoreAggregate(String articoloFornitoreId);

  public ArticoloAggregate articoloIndex(String articoloFornitoreId, String articoloId);

  public FornitoreAggregate fornitoreIndex(String articoloFornitoreId, String fornitoreId);
}
