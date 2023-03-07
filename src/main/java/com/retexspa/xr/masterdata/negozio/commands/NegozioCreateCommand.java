package com.retexspa.xr.masterdata.negozio.commands;

import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import com.retexspa.xr.masterdata.shared.BaseCommand;

public class NegozioCreateCommand extends BaseCommand<String> {

  public final NegozioDTO data;

  public NegozioCreateCommand(String id, NegozioDTO data) {
    super(id);
    this.data = data;
  }

  public NegozioDTO getData() {
    return data;
  }

  public String getId() {
    return id;
  }
}
