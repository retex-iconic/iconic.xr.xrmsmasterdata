package com.retexspa.xr.masterdata.articolo.events;

import com.retexspa.xr.masterdata.shared.BaseEvent;

public class ArticoloFornitoreIndexEvent extends BaseEvent<String> {

  public final String fornitoreId;

  public ArticoloFornitoreIndexEvent(String id, String fornitoreId) {
    super(id);
    this.fornitoreId = fornitoreId;
  }
}
