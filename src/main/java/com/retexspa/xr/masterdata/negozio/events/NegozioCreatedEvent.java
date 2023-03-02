package com.retexspa.xr.masterdata.negozio.events;

import com.retexspa.xr.masterdata.shared.BaseEvent;

public class NegozioCreatedEvent extends BaseEvent<String> {
    
    public final String code;

    public NegozioCreatedEvent(String id, String code) {
        super(id);
        this.code = code;
    }
}
