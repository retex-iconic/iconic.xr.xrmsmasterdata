package com.retexspa.xr.masterdata.articoloFornitore.commands.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ArticoloFornitoreDTO {

  private String fornitore;

  private String articolo;

  private String costoCartone;

  private BigDecimal pezziPerCartone;

  private Integer lottoRiordino;

  private String note;

  private String master;

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
}
