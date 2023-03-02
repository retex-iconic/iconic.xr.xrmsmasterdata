package com.retexspa.xr.masterdata.fornitore.events;

import com.retexspa.xr.masterdata.shared.BaseEvent;

public class FornitoreCreatedEvent extends BaseEvent<String> {

  public final String name;

  public FornitoreCreatedEvent(String id, String name) {
    super(id);
    this.name = name;
  }
}
