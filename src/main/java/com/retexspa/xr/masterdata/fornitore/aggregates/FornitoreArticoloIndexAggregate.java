package com.retexspa.xr.masterdata.fornitore.aggregates;

import com.retexspa.xr.masterdata.fornitore.commands.FornitoreArticoloIndexCommand;
import com.retexspa.xr.masterdata.fornitore.events.FornitoreArticoloIndexEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class FornitoreArticoloIndexAggregate {

  @AggregateIdentifier private String id;

  // TODO come capisco se un fornitore è principale?
  private String articoloId;

  public FornitoreArticoloIndexAggregate() {}

  @CommandHandler
  protected void ArticoloAggregate(FornitoreArticoloIndexCommand fornitoreArticoloIndexCommand) {
    AggregateLifecycle.apply(
        new FornitoreArticoloIndexEvent(
            fornitoreArticoloIndexCommand.id, fornitoreArticoloIndexCommand.articoloId));
  }

  @EventSourcingHandler
  protected void on(FornitoreArticoloIndexEvent FornitoreArticoloIndexEvent) {
    this.id = FornitoreArticoloIndexEvent.id;
    this.articoloId = FornitoreArticoloIndexEvent.articoloId;

    AggregateLifecycle.apply(
        new FornitoreArticoloIndexEvent(
            FornitoreArticoloIndexEvent.id, FornitoreArticoloIndexEvent.articoloId));
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getArticoloId() {
    return articoloId;
  }

  public void setArticoloId(String articoloId) {
    this.articoloId = articoloId;
  }
}
