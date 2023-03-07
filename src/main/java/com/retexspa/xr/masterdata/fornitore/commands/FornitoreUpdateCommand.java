package com.retexspa.xr.masterdata.fornitore.commands;

import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;
import com.retexspa.xr.masterdata.shared.BaseCommand;

public class FornitoreUpdateCommand extends BaseCommand<String> {

  public final FornitoreDTO data;

  public FornitoreUpdateCommand(String id, FornitoreDTO data) {
    super(id);
    this.data = data;
  }
}
