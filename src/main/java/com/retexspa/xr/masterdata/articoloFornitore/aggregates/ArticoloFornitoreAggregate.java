package com.retexspa.xr.masterdata.articoloFornitore.aggregates;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.retexspa.xr.masterdata.articoloFornitore.commands.ArticoloFornitoreCreateCommand;
import com.retexspa.xr.masterdata.articoloFornitore.commands.ArticoloFornitoreIndexCommand;
import com.retexspa.xr.masterdata.articoloFornitore.commands.ArticoloFornitoreUpdateCommand;
import com.retexspa.xr.masterdata.articoloFornitore.commands.dto.ArticoloFornitoreDTO;
import com.retexspa.xr.masterdata.articoloFornitore.events.ArticoloFornitoreCreatedEvent;
import com.retexspa.xr.masterdata.articoloFornitore.events.ArticoloFornitoreIndexEvent;
import com.retexspa.xr.masterdata.articoloFornitore.events.ArticoloFornitoreUpdatedEvent;
import java.io.IOException;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class ArticoloFornitoreAggregate {

  @AggregateIdentifier private String id;

  private ArticoloFornitoreDTO data;

  public ArticoloFornitoreAggregate() {}

  @CommandHandler
  public ArticoloFornitoreAggregate(ArticoloFornitoreCreateCommand articoloFornitoreCreateCommand) {
    AggregateLifecycle.apply(
        new ArticoloFornitoreCreatedEvent(articoloFornitoreCreateCommand.id, articoloFornitoreCreateCommand.data));
  }

  @EventSourcingHandler
  protected void on(ArticoloFornitoreCreatedEvent articoloFornitoreCreatedEvent) {
    this.id = articoloFornitoreCreatedEvent.id;
    this.data = articoloFornitoreCreatedEvent.data;
  }

  @CommandHandler
  protected void on(ArticoloFornitoreUpdateCommand articoloFornitoreUpdateCommand) {
    AggregateLifecycle.apply(
        new ArticoloFornitoreUpdatedEvent(articoloFornitoreUpdateCommand.id, articoloFornitoreUpdateCommand.data));
  }

  @EventSourcingHandler
  protected void on(ArticoloFornitoreUpdatedEvent articoloFornitoreUpdatedEvent) throws IOException {

    if (this.id == null) {
      this.id = articoloFornitoreUpdatedEvent.id;
    }
    ObjectMapper objectMapper = new ObjectMapper();
    ObjectReader objectReader = objectMapper.readerForUpdating(this.data);
    String jsonInString = objectMapper.writeValueAsString(articoloFornitoreUpdatedEvent.data);
    this.data = objectReader.readValue(jsonInString, ArticoloFornitoreDTO.class);
    // BeanUtils.copyProperties(articoloUpdatedEvent.data, this.data);
  }

  @CommandHandler
  protected void on(ArticoloFornitoreIndexCommand articoloFornitoreIndexCommand) {
    AggregateLifecycle.apply(
      new ArticoloFornitoreIndexEvent(articoloFornitoreIndexCommand.id));
  }

  @EventSourcingHandler
  protected void on(ArticoloFornitoreIndexEvent articoloFornitoreIndexEvent) throws IOException {
    if (this.id != articoloFornitoreIndexEvent.id || this.id == null) {
      this.id = articoloFornitoreIndexEvent.id;
    }
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ArticoloFornitoreDTO getData() {
    return this.data;
  }

  public void setData(ArticoloFornitoreDTO data) {
    this.data = data;
  }
}
