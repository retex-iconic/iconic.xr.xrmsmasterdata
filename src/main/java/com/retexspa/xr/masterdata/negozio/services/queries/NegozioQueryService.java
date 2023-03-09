package com.retexspa.xr.masterdata.negozio.services.queries;

import java.util.List;
import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;

public interface NegozioQueryService {
  public List<Object> listEventsForNegozio(String negozioId);

  public NegozioAggregate getNegozioAggregate(String negozioId);

  public ArticoloAggregate articoloIndex(String negozioId, String articoloId);

  public FornitoreAggregate fornitoreIndex(String negozioId, String fornitoreId);
}
