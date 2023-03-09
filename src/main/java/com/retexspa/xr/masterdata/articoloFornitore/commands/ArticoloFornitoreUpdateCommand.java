package com.retexspa.xr.masterdata.articoloFornitore.commands;

import com.retexspa.xr.masterdata.articoloFornitore.commands.dto.ArticoloFornitoreDTO;
import com.retexspa.xr.masterdata.shared.BaseCommand;

public class ArticoloFornitoreUpdateCommand extends BaseCommand<String> {

  public final ArticoloFornitoreDTO data;

  public ArticoloFornitoreUpdateCommand(String id, ArticoloFornitoreDTO data) {
    super(id);
    this.data = data;
  }
}
