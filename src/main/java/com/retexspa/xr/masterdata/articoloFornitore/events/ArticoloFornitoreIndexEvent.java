package com.retexspa.xr.masterdata.articoloFornitore.events;

import com.retexspa.xr.masterdata.shared.BaseEvent;

public class ArticoloFornitoreIndexEvent extends BaseEvent<String> {

  public ArticoloFornitoreIndexEvent(String id) {
    super(id);
  }

  public String getId() {
    return id;
  }
}
