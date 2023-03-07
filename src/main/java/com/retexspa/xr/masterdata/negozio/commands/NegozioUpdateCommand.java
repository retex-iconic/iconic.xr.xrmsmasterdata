package com.retexspa.xr.masterdata.negozio.commands;

import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import com.retexspa.xr.masterdata.shared.BaseCommand;

public class NegozioUpdateCommand extends BaseCommand<String> {
    
    public final NegozioDTO data;

    public NegozioUpdateCommand(String id, NegozioDTO data) {
        super(id);
        this.data = data;
    }
}
