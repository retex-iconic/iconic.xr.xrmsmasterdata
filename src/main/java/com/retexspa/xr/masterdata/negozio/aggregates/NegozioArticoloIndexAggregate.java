package com.retexspa.xr.masterdata.negozio.aggregates;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import com.retexspa.xr.masterdata.negozio.commands.StoreArticoloIndexCommand;
import com.retexspa.xr.masterdata.negozio.events.StoredArticoloIndexEvent;

@Aggregate
public class NegozioArticoloIndexAggregate {
    
    @AggregateIdentifier
    private String id;

    private String articoloId;

    public NegozioArticoloIndexAggregate() {
    }

    @CommandHandler
    protected void ArticoloAggregate(StoreArticoloIndexCommand storeArticoloIndexCommand) {
        AggregateLifecycle.apply(new StoredArticoloIndexEvent(
            storeArticoloIndexCommand.id, 
            storeArticoloIndexCommand.articoloId
        ));
    }

    @EventSourcingHandler
    protected void on(StoredArticoloIndexEvent storedArticoloIndexEvent) {
        this.id = storedArticoloIndexEvent.id;
        this.articoloId = storedArticoloIndexEvent.articoloId;

        AggregateLifecycle.apply(new StoredArticoloIndexEvent(
            storedArticoloIndexEvent.id,
            storedArticoloIndexEvent.articoloId
        ));
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticoloId() {
        return this.articoloId;
    }

    public void setArticoloId(String articoloId) {
        this.articoloId = articoloId;
    }
}
