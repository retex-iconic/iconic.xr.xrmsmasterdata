package com.retexspa.xr.masterdata.negozio.events;

import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import com.retexspa.xr.masterdata.shared.BaseEvent;

public class NegozioCreatedEvent extends BaseEvent<String> {

  public final NegozioDTO data;

  public NegozioCreatedEvent(String id, NegozioDTO data) {
    super(id);
    this.data = data;
  }

  public NegozioDTO getData() {
    return data;
  }

  public String getId() {
    return id;
  }
}
