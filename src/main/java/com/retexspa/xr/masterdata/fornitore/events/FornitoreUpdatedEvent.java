package com.retexspa.xr.masterdata.fornitore.events;

import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;
import com.retexspa.xr.masterdata.shared.BaseEvent;

public class FornitoreUpdatedEvent extends BaseEvent<String> {
    
    public final FornitoreDTO data;

    public FornitoreUpdatedEvent(String id, FornitoreDTO data) {
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
