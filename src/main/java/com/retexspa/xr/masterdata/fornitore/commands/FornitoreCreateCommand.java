package com.retexspa.xr.masterdata.fornitore.commands;

import com.retexspa.xr.masterdata.shared.BaseCommand;

public class FornitoreCreateCommand extends BaseCommand<String> {
    
    public final String name;

    public FornitoreCreateCommand(String id, String name) {
        super(id);
        this.name = name;
    }
}
