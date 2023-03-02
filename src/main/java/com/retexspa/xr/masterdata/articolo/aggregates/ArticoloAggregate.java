package com.retexspa.xr.masterdata.articolo.aggregates;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import com.retexspa.xr.masterdata.articolo.commands.ArticoloAddFornitoreCommand;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloCreateCommand;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.retexspa.xr.masterdata.articolo.events.ArticoloAddedFornitoreEvent;
import com.retexspa.xr.masterdata.articolo.events.ArticoloCreatedEvent;
import java.util.List;

@Aggregate
public class ArticoloAggregate {

    @AggregateIdentifier
    private String id;

    private ArticoloDTO data;




    public ArticoloAggregate() {
    }

    @CommandHandler
    public ArticoloAggregate(ArticoloCreateCommand articoloCreateCommand) {
        AggregateLifecycle.apply(new ArticoloCreatedEvent(
            articoloCreateCommand.id, 
            articoloCreateCommand.data
        ));
    }

    @EventSourcingHandler
    protected void on(ArticoloCreatedEvent articoloCreatedEvent) {
        this.id = articoloCreatedEvent.id;
        this.data = articoloCreatedEvent.data;
    }

    @CommandHandler
    protected void on(ArticoloAddFornitoreCommand articoloAddFornitoreCommand) {
        AggregateLifecycle.apply(new ArticoloAddedFornitoreEvent(
            articoloAddFornitoreCommand.id,  
            articoloAddFornitoreCommand.fornitoreId
        ));
    }

    // @EventSourcingHandler
    // protected void on(ArticoloAddedFornitoreEvent articoloAddFornitoreEvent) {
    //     if (!(this.fornitoreIds.contains(articoloAddFornitoreEvent.fornitoreId))) 
    //         this.fornitoreIds.add(articoloAddFornitoreEvent.fornitoreId);

    //     AggregateLifecycle.apply(new ArticoloAddedFornitoreEvent(
    //         articoloAddFornitoreEvent.id, 
    //         articoloAddFornitoreEvent.fornitoreId
    //     ));
    // }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArticoloDTO getData() {

        return data;
    }   

    public void setData(ArticoloDTO data) {
        this.data = data;
    }   

    // public String getCode() {
    //     return code;
    // }

    // public void setCode(String code) {
    //     this.code = code;
    // }

    // public List<String> getFornitoreIds() {
    //     return fornitoreIds;
    // }

    // public void setFornitoreIds(List<String> fornitoreIds) {
    //     this.fornitoreIds = fornitoreIds;
    // }

    // public String getDescription() {
    //     return description;
    // }

    // public void setDescription(String description) {
    //     this.description = description;
    // }
}
