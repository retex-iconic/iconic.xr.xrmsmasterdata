package com.retexspa.xr.masterdata.articolo.commands;

import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloNegozioIndexDTO;
import com.retexspa.xr.masterdata.shared.BaseCommand;

public class ArticoloNegozioIndexCommand extends BaseCommand<String> {

  public final ArticoloNegozioIndexDTO data;

  public ArticoloNegozioIndexCommand(String id, ArticoloNegozioIndexDTO articoloStoreIndexDTO) {
    super(id);
    this.data = articoloStoreIndexDTO;
  }
}
