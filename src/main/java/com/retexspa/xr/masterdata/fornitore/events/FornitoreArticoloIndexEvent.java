package com.retexspa.xr.masterdata.fornitore.events;

import com.retexspa.xr.masterdata.shared.BaseEvent;

public class FornitoreArticoloIndexEvent extends BaseEvent<String> {

  public final String articoloId;

  public FornitoreArticoloIndexEvent(String id, String articoloId) {
    super(id);
    this.articoloId = articoloId;
  }
}
