package com.retexspa.xr.masterdata.articolo.commands;

import com.retexspa.xr.masterdata.shared.BaseCommand;

public class ArticoloFornitoreIndexCommand extends BaseCommand<String> {

  public final String fornitoreId;

  public ArticoloFornitoreIndexCommand(String id, String fornitoreId) {
    super(id);
    this.fornitoreId = fornitoreId;
  }
}
