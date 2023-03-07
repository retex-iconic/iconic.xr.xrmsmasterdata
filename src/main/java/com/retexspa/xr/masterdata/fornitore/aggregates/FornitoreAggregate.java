package com.retexspa.xr.masterdata.fornitore.aggregates;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.retexspa.xr.masterdata.fornitore.commands.FornitoreAddArticoloCommand;
import com.retexspa.xr.masterdata.fornitore.commands.FornitoreCreateCommand;
import com.retexspa.xr.masterdata.fornitore.commands.FornitoreUpdateCommand;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;
import com.retexspa.xr.masterdata.fornitore.events.FornitoreAddedArticoloEvent;
import com.retexspa.xr.masterdata.fornitore.events.FornitoreCreatedEvent;
import com.retexspa.xr.masterdata.fornitore.events.FornitoreUpdatedEvent;
import java.io.IOException;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class FornitoreAggregate {

  @AggregateIdentifier private String id;

  private FornitoreDTO data;

  public FornitoreAggregate() {}

  @CommandHandler
  public FornitoreAggregate(FornitoreCreateCommand fornitoreCreateCommand) {
    AggregateLifecycle.apply(
        new FornitoreCreatedEvent(fornitoreCreateCommand.id, fornitoreCreateCommand.data));
  }

  @EventSourcingHandler
  public void on(FornitoreCreatedEvent fornitoreCreatedEvent) {
    this.id = fornitoreCreatedEvent.id;
    this.data = fornitoreCreatedEvent.data;
  }

  @CommandHandler
  protected void on(FornitoreUpdateCommand fornitoreUpdateCommand) {
    AggregateLifecycle.apply(
        new FornitoreUpdatedEvent(fornitoreUpdateCommand.id, fornitoreUpdateCommand.data));
  }

  @EventSourcingHandler
  protected void on(FornitoreUpdatedEvent fornitoreUpdatedEvent) throws IOException {

    if (this.id == null) {
      this.id = fornitoreUpdatedEvent.id;
    }
    ObjectMapper objectMapper = new ObjectMapper();
    ObjectReader objectReader = objectMapper.readerForUpdating(this.data);
    String jsonInString = objectMapper.writeValueAsString(fornitoreUpdatedEvent.data);
    this.data = objectReader.readValue(jsonInString, FornitoreDTO.class);
    // BeanUtils.copyProperties(fornitoreUpdatedEvent.data, this.data);
  }

  @CommandHandler
  protected void on(FornitoreAddArticoloCommand fornitoreAddArticoloCommand) {
    AggregateLifecycle.apply(
        new FornitoreAddedArticoloEvent(
            fornitoreAddArticoloCommand.id, fornitoreAddArticoloCommand.articoloId));
  }

  // @EventSourcingHandler
  // protected void on(FornitoreAddedArticoloEvent fornitoreAddArticoloEvent) {
  //   if (!(this.articoloIds.contains(fornitoreAddArticoloEvent.articoloId)))
  //     this.articoloIds.add(fornitoreAddArticoloEvent.articoloId);

  //   AggregateLifecycle.apply(
  //       new FornitoreAddedArticoloEvent(
  //           fornitoreAddArticoloEvent.id, fornitoreAddArticoloEvent.articoloId));
  // }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FornitoreDTO getData() {
    return this.data;
  }

  public void setData(FornitoreDTO data) {
    this.data = data;
  }
}
