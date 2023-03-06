package com.retexspa.xr.masterdata.articolo.events;

import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.retexspa.xr.masterdata.shared.BaseEvent;

public class ArticoloCreatedEvent extends BaseEvent<String> {

  public final ArticoloDTO data;

  public ArticoloCreatedEvent(String id, ArticoloDTO data) {
    super(id);
    this.data = data;

    // TODO Auto-generated constructor stub
  }

  public ArticoloDTO getData() {
    return data;
  }

  public String getId() {
    return id;
  }
}
