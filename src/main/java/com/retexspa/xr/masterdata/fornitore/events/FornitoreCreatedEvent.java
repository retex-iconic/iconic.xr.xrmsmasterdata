package com.retexspa.xr.masterdata.fornitore.events;

import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;
import com.retexspa.xr.masterdata.shared.BaseEvent;

public class FornitoreCreatedEvent extends BaseEvent<String> {

  public final FornitoreDTO data;

  public FornitoreCreatedEvent(String id, FornitoreDTO data) {
    super(id);
    this.data = data;
  }

  public String getId() {
    return id;
  }

  public FornitoreDTO getdata() {
    return data;
  }
}
