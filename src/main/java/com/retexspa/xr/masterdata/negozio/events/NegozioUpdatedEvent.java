package com.retexspa.xr.masterdata.negozio.events;

import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import com.retexspa.xr.masterdata.shared.BaseEvent;

public class NegozioUpdatedEvent extends BaseEvent<String> {

  public final NegozioDTO data;

  public NegozioUpdatedEvent(String id, NegozioDTO data) {
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
