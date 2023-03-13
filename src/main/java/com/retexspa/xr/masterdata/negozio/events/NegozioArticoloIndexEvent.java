package com.retexspa.xr.masterdata.negozio.events;

import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioArticoloIndexDTO;
import com.retexspa.xr.masterdata.shared.BaseEvent;

public class NegozioArticoloIndexEvent extends BaseEvent<String> {

  public final NegozioArticoloIndexDTO data;

  public NegozioArticoloIndexEvent(String id, NegozioArticoloIndexDTO data) {
    super(id);
    this.data = data;
  }

  public String getId() {
    return id;
  }

  public NegozioArticoloIndexDTO getData() {
    return this.data;
  }
}
