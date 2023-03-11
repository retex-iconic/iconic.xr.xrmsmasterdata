package com.retexspa.xr.masterdata.articolo.commands.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class ArticoloStoreIndexDTO {

  @TargetAggregateIdentifier private String id;

  private String articoloId;
  private List<String> storeIds;

  public ArticoloStoreIndexDTO(String articoloId) {
    this.id = getIdFromArticoloStore(articoloId);
    this.articoloId = articoloId;
    this.storeIds = new ArrayList<String>();
  }

  public static String getIdFromArticoloStore(String articoloId) {
    return UUID.nameUUIDFromBytes(("/ArticoloStoreIndex/" + articoloId).getBytes()).toString();
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
    return this.storeIds;
  }

  public void setStoreIds(List<String> storeIds) {
    this.storeIds = storeIds;
  }
}
