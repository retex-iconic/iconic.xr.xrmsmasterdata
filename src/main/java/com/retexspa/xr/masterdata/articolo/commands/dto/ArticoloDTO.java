package com.retexspa.xr.masterdata.articolo.commands.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ArticoloDTO {

  private String codice;

  private String codice2;

  private String codice3;

  private String codice4;

  private String descrizione;

  private String master;

  private String produttore;

  private String reparto;

  // define properties here from ArticoloMapper target name

  private String layoutESL;

  private String gruppo;

  public String getLayoutESL() {
    return this.layoutESL;
  }

  public void setLayoutESL(String layoutESL) {
    this.layoutESL = layoutESL;
  }

  public String getGruppo() {
    return this.gruppo;
  }

  public void setGruppo(String gruppo) {
    this.gruppo = gruppo;
  }

  public String getReparto() {
    return this.reparto;
  }

  public void setReparto(String reparto) {
    this.reparto = reparto;
  }

  public String getCodice2() {
    return this.codice2;
  }

  public void setCodice2(String codice2) {
    this.codice2 = codice2;
  }

  public String getCodice3() {
    return this.codice3;
  }

  public void setCodice3(String codice3) {
    this.codice3 = codice3;
  }

  public String getCodice4() {
    return this.codice4;
  }

  public void setCodice4(String codice4) {
    this.codice4 = codice4;
  }

  public String getProduttore() {
    return this.produttore;
  }

  public void setProduttore(String produttore) {
    this.produttore = produttore;
  }

  public String getCodice() {
    return codice;
  }

  public void setCodice(String codice) {
    this.codice = codice;
  }

  public String getDescrizione() {
    return descrizione;
  }

  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  public String getMaster() {
    return master;
  }

  public void setMaster(String master) {
    this.master = master;
  }
}
