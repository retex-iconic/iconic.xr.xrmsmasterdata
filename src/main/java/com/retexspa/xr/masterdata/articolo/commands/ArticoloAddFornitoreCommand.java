package com.retexspa.xr.masterdata.articolo.commands;

import com.retexspa.xr.masterdata.shared.BaseCommand;

public class ArticoloAddFornitoreCommand extends BaseCommand<String> {

  public final String fornitoreId;

  public ArticoloAddFornitoreCommand(String id, String fornitoreId) {
    super(id);
    this.fornitoreId = fornitoreId;
  }
}
