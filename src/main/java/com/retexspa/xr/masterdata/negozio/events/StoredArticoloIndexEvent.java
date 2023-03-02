package com.retexspa.xr.masterdata.negozio.events;

import com.retexspa.xr.masterdata.shared.BaseEvent;

public class StoredArticoloIndexEvent extends BaseEvent<String> {

  public final String articoloId;

  public StoredArticoloIndexEvent(String id, String articoloId) {
    super(id);
    this.articoloId = articoloId;
  }
}
