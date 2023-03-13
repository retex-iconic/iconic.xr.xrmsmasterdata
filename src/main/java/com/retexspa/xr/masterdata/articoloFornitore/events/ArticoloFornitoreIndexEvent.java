package com.retexspa.xr.masterdata.articoloFornitore.events;

import com.retexspa.xr.masterdata.articoloFornitore.commands.dto.ArticoloFornitoreDTO;
import com.retexspa.xr.masterdata.shared.BaseEvent;

public class ArticoloFornitoreIndexEvent extends BaseEvent<String> {

  public final ArticoloFornitoreDTO data;

  public ArticoloFornitoreIndexEvent(String id, ArticoloFornitoreDTO data) {
    super(id);
    this.data = data;
  }

  public String getId() {
    return id;
  }

  public ArticoloFornitoreDTO getData() {
    return this.data;
  }
}
