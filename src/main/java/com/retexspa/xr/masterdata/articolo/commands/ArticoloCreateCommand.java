package com.retexspa.xr.masterdata.articolo.commands;

import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.retexspa.xr.masterdata.shared.BaseCommand;

public class ArticoloCreateCommand extends BaseCommand<String> {

  public final ArticoloDTO data;

  public ArticoloCreateCommand(String id, ArticoloDTO data) {
    super(id);
    this.data = data;
  }

  public ArticoloDTO getData() {
    return data;
  }

  public String getId() {
    return id;
  }
}
