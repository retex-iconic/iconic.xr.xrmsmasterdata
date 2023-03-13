package com.retexspa.xr.masterdata.negozio.aggregates;

import com.retexspa.xr.masterdata.negozio.commands.NegozioArticoloIndexCommand;
import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioArticoloIndexDTO;
import com.retexspa.xr.masterdata.negozio.events.NegozioArticoloIndexEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class NegozioArticoloIndexAggregate {

  @AggregateIdentifier private String id;

  private NegozioArticoloIndexDTO data;

  public NegozioArticoloIndexAggregate() {}

  @CommandHandler
  protected NegozioArticoloIndexAggregate(NegozioArticoloIndexCommand negozioArticoloIndexCommand) {
    AggregateLifecycle.apply(
        new NegozioArticoloIndexEvent(
            negozioArticoloIndexCommand.id, negozioArticoloIndexCommand.data));
  }

  @EventSourcingHandler
  protected void on(NegozioArticoloIndexEvent storedArticoloIndexEvent) {
    this.id = storedArticoloIndexEvent.id;
    this.data = storedArticoloIndexEvent.data;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NegozioArticoloIndexDTO getData() {
    return this.data;
  }

  public void setData(NegozioArticoloIndexDTO data) {
    this.data = data;
  }
}
