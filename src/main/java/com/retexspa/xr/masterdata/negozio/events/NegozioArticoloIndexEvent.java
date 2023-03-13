package com.retexspa.xr.masterdata.negozio.events;

import com.retexspa.xr.masterdata.shared.BaseEvent;

public class NegozioArticoloIndexEvent extends BaseEvent<String> {

  public final String articoloId;

  public NegozioArticoloIndexEvent(String id, String articoloId) {
    super(id);
    this.articoloId = articoloId;
  }
}
