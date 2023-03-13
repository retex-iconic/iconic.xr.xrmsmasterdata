package com.retexspa.xr.masterdata.articolo.aggregates;

import com.retexspa.xr.masterdata.articolo.commands.ArticoloNegozioIndexCommand;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloNegozioIndexDTO;
import com.retexspa.xr.masterdata.articolo.events.ArticoloNegozioIndexEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class ArticoloNegozioIndexAggregate {

  @AggregateIdentifier private String id;

  private ArticoloNegozioIndexDTO data;

  public ArticoloNegozioIndexAggregate() {}

  @CommandHandler
  public ArticoloNegozioIndexAggregate(ArticoloNegozioIndexCommand articoloNegozioIndexCommand) {
    AggregateLifecycle.apply(
        new ArticoloNegozioIndexEvent(articoloNegozioIndexCommand.id, articoloNegozioIndexCommand.data));
  }

  @EventSourcingHandler
  protected void on(ArticoloNegozioIndexEvent articoloNegoziodIndexEvent) {
    this.id = articoloNegoziodIndexEvent.id;
    this.data = articoloNegoziodIndexEvent.data;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ArticoloNegozioIndexDTO getData() {
    return data;
  }

  public void setId(ArticoloNegozioIndexDTO data) {
    this.data = data;
  }
}
