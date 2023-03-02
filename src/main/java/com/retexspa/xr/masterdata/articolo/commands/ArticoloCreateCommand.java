package com.retexspa.xr.masterdata.articolo.commands;

import com.retexspa.xr.masterdata.shared.BaseCommand;

public class ArticoloCreateCommand extends BaseCommand<String>  {

    public final String code;

    public final String description;

    public ArticoloCreateCommand(String id, String code, String description) {
        super(id);
        this.code = code;
        this.description = description;
    }
}
