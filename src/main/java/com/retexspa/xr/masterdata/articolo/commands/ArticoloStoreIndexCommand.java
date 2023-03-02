package com.retexspa.xr.masterdata.articolo.commands;

import com.retexspa.xr.masterdata.shared.BaseCommand;

public class ArticoloStoreIndexCommand extends BaseCommand<String> {

  public final String storeId;

  public ArticoloStoreIndexCommand(String id, String storeId) {
    super(id);
    this.storeId = storeId;
  }
}
