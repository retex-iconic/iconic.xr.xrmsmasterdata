package com.retexspa.xr.masterdata.negozio.aggregates;

import com.retexspa.xr.masterdata.negozio.commands.NegozioCreateCommand;
import com.retexspa.xr.masterdata.negozio.events.NegozioCreatedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class NegozioAggregate {

  @AggregateIdentifier private String id;

  private String code;

  public NegozioAggregate() {}

  @CommandHandler
  public NegozioAggregate(NegozioCreateCommand negozioCreateCommand) {
    AggregateLifecycle.apply(
        new NegozioCreatedEvent(negozioCreateCommand.id, negozioCreateCommand.code));
  }

  @EventSourcingHandler
  public void on(NegozioCreatedEvent negozioCreatedEvent) {
    this.id = negozioCreatedEvent.id;
    this.code = negozioCreatedEvent.code;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }
}
