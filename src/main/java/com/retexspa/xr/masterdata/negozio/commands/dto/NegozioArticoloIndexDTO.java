package com.retexspa.xr.masterdata.negozio.commands.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class NegozioArticoloIndexDTO {

  @TargetAggregateIdentifier private String id;

  private String negozioId;
  private List<String> articoloIds;


  public NegozioArticoloIndexDTO(String negozioId) {
    this.id = getIdFromNegozio(negozioId);
    this.negozioId = negozioId;
    this.articoloIds = new ArrayList<String>();
  }

  public static String getIdFromNegozio(String negozioId) {
    return UUID.nameUUIDFromBytes(("/NegozioArticoloIndex/" + negozioId).getBytes()).toString();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNegozioId() {
    return this.negozioId;
  }

  public void setNegozioId(String negozioId) {
    this.negozioId = negozioId;
  }

  public List<String> getArticoloIds() {
    return this.articoloIds;
  }

  public void setArticoloIds(List<String> articoloIds) {
    this.articoloIds = articoloIds;
  }


}
