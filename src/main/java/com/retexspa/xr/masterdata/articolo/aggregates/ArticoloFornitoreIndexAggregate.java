package com.retexspa.xr.masterdata.articolo.aggregates;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloFornitoreIndexCommand;
import com.retexspa.xr.masterdata.articolo.events.ArticoloFornitoreIndexEvent;

@Aggregate
public class ArticoloFornitoreIndexAggregate {
    
    @AggregateIdentifier
    private String id;

    //TODO come capisco se un fornitore è principale?
    private String fornitorePrincipaleId;

    public ArticoloFornitoreIndexAggregate() {
    }

    @CommandHandler
    protected void ArticoloAggregate(ArticoloFornitoreIndexCommand articoloFornitoreIndexCommand) {
        AggregateLifecycle.apply(new ArticoloFornitoreIndexEvent(
            articoloFornitoreIndexCommand.id, 
            articoloFornitoreIndexCommand.fornitoreId
        ));
    }

    @EventSourcingHandler
    protected void on(ArticoloFornitoreIndexEvent articoloFornitoreIndexEvent) {
        this.id = articoloFornitoreIndexEvent.id;
        this.fornitorePrincipaleId = articoloFornitoreIndexEvent.fornitoreId;

        AggregateLifecycle.apply(new ArticoloFornitoreIndexEvent(
            articoloFornitoreIndexEvent.id,
            articoloFornitoreIndexEvent.fornitoreId
        ));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFornitorePrincipaleId() {
        return fornitorePrincipaleId;
    }

    public void setFornitorePrincipaleId(String fornitorePrincipaleId) {
        this.fornitorePrincipaleId = fornitorePrincipaleId;
    }
}
