package com.retexspa.xr.masterdata.articoloFornitore.commands;

import com.retexspa.xr.masterdata.articoloFornitore.commands.dto.ArticoloFornitoreDTO;
import com.retexspa.xr.masterdata.shared.BaseCommand;

public class ArticoloFornitoreCreateCommand extends BaseCommand<String> {

  public final ArticoloFornitoreDTO data;

  public ArticoloFornitoreCreateCommand(String id, ArticoloFornitoreDTO data) {
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
