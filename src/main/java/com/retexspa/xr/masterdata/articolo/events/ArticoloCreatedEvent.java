package com.retexspa.xr.masterdata.articolo.events;

import com.retexspa.xr.masterdata.shared.BaseEvent;

public class ArticoloCreatedEvent extends BaseEvent<String>{

    public final String code;

    public final String description;

    public ArticoloCreatedEvent(String id, String code, String description) {
        super(id);
        this.code = code;
        this.description = description;
        
        //TODO Auto-generated constructor stub
    }
}
