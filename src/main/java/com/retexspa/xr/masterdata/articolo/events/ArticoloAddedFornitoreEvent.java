package com.retexspa.xr.masterdata.articolo.events;

import com.retexspa.xr.masterdata.shared.BaseEvent;

public class ArticoloAddedFornitoreEvent extends BaseEvent<String> {

  public final String fornitoreId;

  public ArticoloAddedFornitoreEvent(String id, String fornitoreId) {
    super(id);
    this.fornitoreId = fornitoreId;
  }
}
