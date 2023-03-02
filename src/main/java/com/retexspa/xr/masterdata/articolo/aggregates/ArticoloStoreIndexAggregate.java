package com.retexspa.xr.masterdata.articolo.aggregates;

import com.retexspa.xr.masterdata.articolo.commands.ArticoloStoreIndexCommand;
import com.retexspa.xr.masterdata.articolo.events.ArticoloStoredIndexEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class ArticoloStoreIndexAggregate {

  @AggregateIdentifier private String id;

  private String storeId;

  public ArticoloStoreIndexAggregate() {}

  @CommandHandler
  protected void ArticoloAggregate(ArticoloStoreIndexCommand articoloStoreIndexCommand) {
    AggregateLifecycle.apply(
        new ArticoloStoredIndexEvent(
            articoloStoreIndexCommand.id, articoloStoreIndexCommand.storeId));
  }

  @EventSourcingHandler
  protected void on(ArticoloStoredIndexEvent articoloStoredIndexEvent) {
    this.id = articoloStoredIndexEvent.id;
    this.storeId = articoloStoredIndexEvent.storeId;

    AggregateLifecycle.apply(
        new ArticoloStoredIndexEvent(
            articoloStoredIndexEvent.id, articoloStoredIndexEvent.storeId));
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }
}
