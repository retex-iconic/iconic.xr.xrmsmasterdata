package com.retexspa.xr.masterdata.fornitore.commands;

import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;
import com.retexspa.xr.masterdata.shared.BaseCommand;

public class FornitoreCreateCommand extends BaseCommand<String> {

  public final FornitoreDTO data;

  public FornitoreCreateCommand(String id, FornitoreDTO data) {
    super(id);
    this.data = data;
  }

  public FornitoreDTO getData() {
    return data;
  }

  public String getId() {
    return id;
  }
}
