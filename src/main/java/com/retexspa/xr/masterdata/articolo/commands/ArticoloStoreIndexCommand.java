package com.retexspa.xr.masterdata.articolo.commands;

import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloStoreIndexDTO;
import com.retexspa.xr.masterdata.shared.BaseCommand;

public class ArticoloStoreIndexCommand extends BaseCommand<String> {

  public final ArticoloStoreIndexDTO data;

  public ArticoloStoreIndexCommand(String id, ArticoloStoreIndexDTO articoloStoreIndexDTO) {
    super(id);
    this.data = articoloStoreIndexDTO;
  }
}
