package com.retexspa.xr.masterdata.negozio.commands;

import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioArticoloIndexDTO;
import com.retexspa.xr.masterdata.shared.BaseCommand;
import java.util.ArrayList;
import java.util.List;

public class NegozioArticoloIndexCommand extends BaseCommand<String> {

  public final NegozioArticoloIndexDTO data;

  public NegozioArticoloIndexCommand(String id, NegozioArticoloIndexDTO negozioArticoloIndexDTO) {
    super(id);
    this.data = negozioArticoloIndexDTO;
  }
}
