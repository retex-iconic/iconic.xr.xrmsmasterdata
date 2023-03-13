package com.retexspa.xr.masterdata.articoloFornitore.commands;

import com.retexspa.xr.masterdata.articoloFornitore.commands.dto.ArticoloFornitoreDTO;
import com.retexspa.xr.masterdata.shared.BaseCommand;

public class ArticoloFornitoreIndexCommand extends BaseCommand<String> {
  
  public final ArticoloFornitoreDTO data;

  public ArticoloFornitoreIndexCommand(String id, ArticoloFornitoreDTO data) {
    super(id);
    this.data = data;
  }
}
