package com.retexspa.xr.masterdata.articolo.commands.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class ArticoloNegozioIndexDTO {

  @TargetAggregateIdentifier private String id;

  private String articoloId;
  private List<String> nogizioIds;

  public ArticoloNegozioIndexDTO(String articoloId) {
    this.id = getIdFromArticolo(articoloId);
    this.articoloId = articoloId;
    this.nogizioIds = new ArrayList<String>();
  }

  public static String getIdFromArticolo(String articoloId) {
    return UUID.nameUUIDFromBytes(("/ArticoloNegozioIndex/" + articoloId).getBytes()).toString();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getArticoloId() {
    return this.articoloId;
  }

  public void setArticoloId(String articoloId) {
    this.articoloId = articoloId;
  }

  public List<String> getStoreIds() {
    return this.nogizioIds;
  }

  public void setStoreIds(List<String> nogizioIds) {
    this.nogizioIds = nogizioIds;
  }
}
