package com.retexspa.xr.masterdata.negozio.commands.dto;

public class NegozioDTO {

  private String ragioneSociale;

  private String codiceFiscale;

  private String regimeFiscale;

  private String master;

  public String getRagioneSociale() {
    return this.ragioneSociale;
  }

  public void setRagioneSociale(String ragioneSociale) {
    this.ragioneSociale = ragioneSociale;
  }

  public String getCodiceFiscale() {
    return this.codiceFiscale;
  }

  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  public String getRegimeFiscale() {
    return this.regimeFiscale;
  }

  public void setRegimeFiscale(String regimeFiscale) {
    this.regimeFiscale = regimeFiscale;
  }

  public String getMaster() {
    return this.master;
  }

  public void setMaster(String master) {
    this.master = master;
  }
}
