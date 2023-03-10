package com.retexspa.xr.masterdata.articolo.events;

import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloStoreIndexDTO;
import com.retexspa.xr.masterdata.shared.BaseEvent;

public class ArticoloStoredIndexEvent extends BaseEvent<String> {

  public final ArticoloStoreIndexDTO data;

  public ArticoloStoredIndexEvent(String id, ArticoloStoreIndexDTO data) {
    super(id);
    this.data = data;

    // TODO Auto-generated constructor stub
  }

  public String getId() {
    return id;
  }

  public ArticoloStoreIndexDTO getData() {
    return data;
  }
}
