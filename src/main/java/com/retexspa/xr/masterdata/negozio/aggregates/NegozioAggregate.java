package com.retexspa.xr.masterdata.negozio.aggregates;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.retexspa.xr.masterdata.negozio.commands.NegozioCreateCommand;
import com.retexspa.xr.masterdata.negozio.commands.NegozioUpdateCommand;
import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import com.retexspa.xr.masterdata.negozio.events.NegozioCreatedEvent;
import com.retexspa.xr.masterdata.negozio.events.NegozioUpdatedEvent;
import java.io.IOException;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class NegozioAggregate {

  @AggregateIdentifier private String id;

  private NegozioDTO data;

  public NegozioAggregate() {}

  @CommandHandler
  public NegozioAggregate(NegozioCreateCommand negozioCreateCommand) {
    AggregateLifecycle.apply(
        new NegozioCreatedEvent(negozioCreateCommand.id, negozioCreateCommand.data));
  }

  @EventSourcingHandler
  public void on(NegozioCreatedEvent negozioCreatedEvent) {
    this.id = negozioCreatedEvent.id;
    this.data = negozioCreatedEvent.data;
  }

  @CommandHandler
  protected void on(NegozioUpdateCommand negozioUpdateCommand) {
    AggregateLifecycle.apply(
        new NegozioUpdatedEvent(negozioUpdateCommand.id, negozioUpdateCommand.data));
  }

  @EventSourcingHandler
  protected void on(NegozioUpdatedEvent negozioUpdatedEvent) throws IOException {

    if (this.id == null) {
      this.id = negozioUpdatedEvent.id;
    }

    ObjectMapper objectMapper = new ObjectMapper();
    ObjectReader objectReader = objectMapper.readerForUpdating(this.data);
    String jsonInString = objectMapper.writeValueAsString(negozioUpdatedEvent.data);
    this.data = objectReader.readValue(jsonInString, NegozioDTO.class);
    // BeanUtils.copyProperties(negozioUpdatedEvent.data, this.data);
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NegozioDTO getdata() {
    return this.data;
  }

  public void setdata(NegozioDTO data) {
    this.data = data;
  }
}
