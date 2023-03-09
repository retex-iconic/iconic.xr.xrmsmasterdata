package com.retexspa.xr.masterdata.articoloFornitore.events;

import com.retexspa.xr.masterdata.articoloFornitore.commands.dto.ArticoloFornitoreDTO;
import com.retexspa.xr.masterdata.shared.BaseEvent;

public class ArticoloFornitoreUpdatedEvent extends BaseEvent<String> {

  public final ArticoloFornitoreDTO data;

  public ArticoloFornitoreUpdatedEvent(String id, ArticoloFornitoreDTO data) {
    super(id);
    this.data = data;

    // TODO Auto-generated constructor stub
  }

  public ArticoloFornitoreDTO getData() {
    return data;
  }

  public String getId() {
    return id;
  }
}
