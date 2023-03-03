package com.retexspa.xr.masterdata.articolo.commands;

import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.retexspa.xr.masterdata.shared.BaseCommand;

public class ArticoloUpdateCommand extends BaseCommand<String> {

  public final ArticoloDTO data;

  public ArticoloUpdateCommand(String id, ArticoloDTO data) {
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
