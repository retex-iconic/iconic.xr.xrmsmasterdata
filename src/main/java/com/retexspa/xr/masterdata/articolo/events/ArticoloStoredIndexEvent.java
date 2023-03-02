package com.retexspa.xr.masterdata.articolo.events;

import com.retexspa.xr.masterdata.shared.BaseEvent;

public class ArticoloStoredIndexEvent extends BaseEvent<String> {
    
    public final String storeId;

    public ArticoloStoredIndexEvent(String id, String storeId) {
        super(id);
        this.storeId = storeId;
    }
}
