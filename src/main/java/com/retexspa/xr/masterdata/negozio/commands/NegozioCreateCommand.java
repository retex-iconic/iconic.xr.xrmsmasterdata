package com.retexspa.xr.masterdata.negozio.commands;

import com.retexspa.xr.masterdata.shared.BaseCommand;

public class NegozioCreateCommand extends BaseCommand<String> {

    public final String code;

    public NegozioCreateCommand(String id, String code) {
        super(id);
        this.code = code;
    }
}
