package com.retexspa.xr.masterdata.articolo.aggregates;

import com.retexspa.xr.masterdata.articolo.commands.ArticoloStoreIndexCommand;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloStoreIndexDTO;
import com.retexspa.xr.masterdata.articolo.events.ArticoloStoredIndexEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class ArticoloStoreIndexAggregate {

  @AggregateIdentifier private String id;

  private ArticoloStoreIndexDTO data;

  public ArticoloStoreIndexAggregate() {}

  @CommandHandler
  public ArticoloStoreIndexAggregate(ArticoloStoreIndexCommand articoloStoreIndexCommand) {
    AggregateLifecycle.apply(
        new ArticoloStoredIndexEvent(articoloStoreIndexCommand.id, articoloStoreIndexCommand.data));
  }

  @EventSourcingHandler
  protected void on(ArticoloStoredIndexEvent articoloStoredIndexEvent) {
    this.id = articoloStoredIndexEvent.id;
    this.data = articoloStoredIndexEvent.data;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ArticoloStoreIndexDTO getData() {
    return data;
  }

  public void setId(ArticoloStoreIndexDTO data) {
    this.data = data;
  }
}
