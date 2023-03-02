package com.retexspa.xr.masterdata.fornitore.commands;

import com.retexspa.xr.masterdata.shared.BaseCommand;

public class FornitoreAddArticoloCommand extends BaseCommand<String> {

  public final String articoloId;

  public FornitoreAddArticoloCommand(String id, String articoloId) {
    super(id);
    this.articoloId = articoloId;
  }
}
