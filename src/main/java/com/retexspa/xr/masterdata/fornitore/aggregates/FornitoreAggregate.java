package com.retexspa.xr.masterdata.fornitore.aggregates;

import com.retexspa.xr.masterdata.fornitore.commands.FornitoreAddArticoloCommand;
import com.retexspa.xr.masterdata.fornitore.commands.FornitoreCreateCommand;
import com.retexspa.xr.masterdata.fornitore.events.FornitoreAddedArticoloEvent;
import com.retexspa.xr.masterdata.fornitore.events.FornitoreCreatedEvent;
import java.util.List;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class FornitoreAggregate {

  @AggregateIdentifier private String id;

  private String name;

  // ho bisogno della lista degli articoli?
  private List<String> articoloIds;

  public FornitoreAggregate() {}

  @CommandHandler
  public FornitoreAggregate(FornitoreCreateCommand fornitoreCreateCommand) {
    AggregateLifecycle.apply(
        new FornitoreCreatedEvent(fornitoreCreateCommand.id, fornitoreCreateCommand.name));
  }

  @EventSourcingHandler
  public void on(FornitoreCreatedEvent fornitoreCreatedEvent) {
    this.id = fornitoreCreatedEvent.id;
    this.name = fornitoreCreatedEvent.name;
  }

  @CommandHandler
  protected void on(FornitoreAddArticoloCommand fornitoreAddArticoloCommand) {
    AggregateLifecycle.apply(
        new FornitoreAddedArticoloEvent(
            fornitoreAddArticoloCommand.id, fornitoreAddArticoloCommand.articoloId));
  }

  @EventSourcingHandler
  protected void on(FornitoreAddedArticoloEvent fornitoreAddArticoloEvent) {
    if (!(this.articoloIds.contains(fornitoreAddArticoloEvent.articoloId)))
      this.articoloIds.add(fornitoreAddArticoloEvent.articoloId);

    AggregateLifecycle.apply(
        new FornitoreAddedArticoloEvent(
            fornitoreAddArticoloEvent.id, fornitoreAddArticoloEvent.articoloId));
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getArticoloIds() {
    return this.articoloIds;
  }

  public void setArticoloIds(List<String> articoloIds) {
    this.articoloIds = articoloIds;
  }
}
