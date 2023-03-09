package com.retexspa.xr.masterdata.articolo.aggregates;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloAddFornitoreCommand;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloCreateCommand;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloUpdateCommand;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.retexspa.xr.masterdata.articolo.events.ArticoloAddedFornitoreEvent;
import com.retexspa.xr.masterdata.articolo.events.ArticoloCreatedEvent;
import com.retexspa.xr.masterdata.articolo.events.ArticoloUpdatedEvent;
import java.io.IOException;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class ArticoloAggregate {

  @AggregateIdentifier private String id;
  
  @AggregateIdentifier private String fornitoreId;

  private ArticoloDTO data;

  public ArticoloAggregate() {}

  @CommandHandler
  public ArticoloAggregate(ArticoloCreateCommand articoloCreateCommand) {
    AggregateLifecycle.apply(
        new ArticoloCreatedEvent(articoloCreateCommand.id, articoloCreateCommand.data));
  }

  @EventSourcingHandler
  protected void on(ArticoloCreatedEvent articoloCreatedEvent) {
    this.id = articoloCreatedEvent.id;
    this.data = articoloCreatedEvent.data;
  }

  @CommandHandler
  protected void on(ArticoloUpdateCommand articoloUpdateCommand) {
    AggregateLifecycle.apply(
        new ArticoloUpdatedEvent(articoloUpdateCommand.id, articoloUpdateCommand.data));
  }

  @EventSourcingHandler
  protected void on(ArticoloUpdatedEvent articoloUpdatedEvent) throws IOException {

    if (this.id == null) {
      this.id = articoloUpdatedEvent.id;
    }
    ObjectMapper objectMapper = new ObjectMapper();
    ObjectReader objectReader = objectMapper.readerForUpdating(this.data);
    String jsonInString = objectMapper.writeValueAsString(articoloUpdatedEvent.data);
    this.data = objectReader.readValue(jsonInString, ArticoloDTO.class);
    // BeanUtils.copyProperties(articoloUpdatedEvent.data, this.data);
  }

  @CommandHandler
  protected void on(ArticoloAddFornitoreCommand articoloAddFornitoreCommand) {
    AggregateLifecycle.apply(
        new ArticoloAddedFornitoreEvent(
            articoloAddFornitoreCommand.id, articoloAddFornitoreCommand.fornitoreId));
  }

  @EventSourcingHandler
  protected void on(ArticoloAddedFornitoreEvent articoloAddedFornitoreEvent) {
    this.id = articoloAddedFornitoreEvent.id;
    this.fornitoreId = articoloAddedFornitoreEvent.fornitoreId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ArticoloDTO getData() {
    return data;
  }

  public void setData(ArticoloDTO data) {
    this.data = data;
  }

  public String getFornitoreId() {
    return this.fornitoreId;
  }

  public void setFornitoreId(String fornitoreId) {
    this.fornitoreId = fornitoreId;
  }
}
