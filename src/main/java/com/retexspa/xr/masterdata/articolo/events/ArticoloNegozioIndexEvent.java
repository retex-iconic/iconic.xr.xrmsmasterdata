package com.retexspa.xr.masterdata.articolo.events;

import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloNegozioIndexDTO;
import com.retexspa.xr.masterdata.shared.BaseEvent;

public class ArticoloNegozioIndexEvent extends BaseEvent<String> {

  public final ArticoloNegozioIndexDTO data;

  public ArticoloNegozioIndexEvent(String id, ArticoloNegozioIndexDTO data) {
    super(id);
    this.data = data;

    // TODO Auto-generated constructor stub
  }

  public String getId() {
    return id;
  }

  public ArticoloNegozioIndexDTO getData() {
    return data;
  }
}
