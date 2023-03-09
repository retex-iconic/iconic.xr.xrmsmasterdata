package com.retexspa.xr.masterdata.articoloFornitore.events;

import com.retexspa.xr.masterdata.articoloFornitore.commands.dto.ArticoloFornitoreDTO;
import com.retexspa.xr.masterdata.shared.BaseEvent;

public class ArticoloFornitoreCreatedEvent extends BaseEvent<String> {

  public final ArticoloFornitoreDTO data;

  public ArticoloFornitoreCreatedEvent(String id, ArticoloFornitoreDTO data) {
    super(id);
    this.data = data;
  }

  public ArticoloFornitoreDTO getData() {
    return data;
  }

  public String getId() {
    return id;
  }
}
