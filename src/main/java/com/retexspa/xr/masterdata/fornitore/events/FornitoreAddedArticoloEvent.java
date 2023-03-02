package com.retexspa.xr.masterdata.fornitore.events;

import com.retexspa.xr.masterdata.shared.BaseEvent;

public class FornitoreAddedArticoloEvent extends BaseEvent<String> {
    
    public final String articoloId;

    public FornitoreAddedArticoloEvent(String id, String articoloId) {
        super(id);
        this.articoloId = articoloId;
    }
}
