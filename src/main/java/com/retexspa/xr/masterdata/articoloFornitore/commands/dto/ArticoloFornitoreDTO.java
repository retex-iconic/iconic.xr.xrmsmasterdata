package com.retexspa.xr.masterdata.articoloFornitore.commands.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

@JsonInclude(Include.NON_NULL)
public class ArticoloFornitoreDTO {

  @TargetAggregateIdentifier private String id;

  private String fornitore;

  private String articolo;

  private String costoCartone;

  private BigDecimal pezziPerCartone;

  private Integer lottoRiordino;

  private String note;

  private String master;

  private String articoloFornitoreId;

  private List<String> articoloFornitoreIds;

  public ArticoloFornitoreDTO(String articoloFornitoreId) {
    this.id = getIdFromArticolo(articoloFornitoreId);
    this.articoloFornitoreId = articoloFornitoreId;
    this.articoloFornitoreIds = new ArrayList<String>();
  }

  private String getIdFromArticolo(String articoloId) {
    return UUID.nameUUIDFromBytes(("/ArticoloFornitoreIndex/" + articoloId).getBytes()).toString();
  }

  public String getFornitore() {
    return this.fornitore;
  }

  public void setFornitore(String fornitore) {
    this.fornitore = fornitore;
  }

  public String getArticolo() {
    return this.articolo;
  }

  public void setArticolo(String articolo) {
    this.articolo = articolo;
  }

  public String getCostoCartone() {
    return this.costoCartone;
  }

  public void setCostoCartone(String costoCartone) {
    this.costoCartone = costoCartone;
  }

  public BigDecimal getPezziPerCartone() {
    return this.pezziPerCartone;
  }

  public void setPezziPerCartone(BigDecimal pezziPerCartone) {
    this.pezziPerCartone = pezziPerCartone;
  }

  public Integer getLottoRiordino() {
    return this.lottoRiordino;
  }

  public void setLottoRiordino(Integer lottoRiordino) {
    this.lottoRiordino = lottoRiordino;
  }

  public String getNote() {
    return this.note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public String getMaster() {
    return this.master;
  }

  public void setMaster(String master) {
    this.master = master;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getArticoloFornitoreId() {
    return this.articoloFornitoreId;
  }

  public void setArticoloFornitoreId(String articoloFornitoreId) {
    this.articoloFornitoreId = articoloFornitoreId;
  }

  public List<String> getArticoloFornitoreIds() {
    return this.articoloFornitoreIds;
  }

  public void setArticoloFornitoreIds(List<String> articoloFornitoreIds) {
    this.articoloFornitoreIds = articoloFornitoreIds;
  }
}
