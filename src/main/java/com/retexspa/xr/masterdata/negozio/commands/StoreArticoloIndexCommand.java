package com.retexspa.xr.masterdata.negozio.commands;

import com.retexspa.xr.masterdata.shared.BaseCommand;

public class StoreArticoloIndexCommand extends BaseCommand<String> {

  public final String articoloId;

  public StoreArticoloIndexCommand(String id, String articoloId) {
    super(id);
    this.articoloId = articoloId;
  }
}
