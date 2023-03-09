package com.retexspa.xr.masterdata.fornitore.commands.dto;

public class FornitoreDTO {

  private String codiceFornitore;

  private String numeroFornitore;

  private String nomeFornitore;

  private String indirizzo;

  private String città;

  private String cap;

  private String piva;

  private String master;

  public String getCodiceFornitore() {
    return this.codiceFornitore;
  }

  public void setCodiceFornitore(String codiceFornitore) {
    this.codiceFornitore = codiceFornitore;
  }

  public String getNumeroFornitore() {
    return this.numeroFornitore;
  }

  public void setNumeroFornitore(String numeroFornitore) {
    this.numeroFornitore = numeroFornitore;
  }

  public String getNomeFornitore() {
    return this.nomeFornitore;
  }

  public void setNomeFornitore(String nomeFornitore) {
    this.nomeFornitore = nomeFornitore;
  }

  public String getIndirizzo() {
    return this.indirizzo;
  }

  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  public String getCittà() {
    return this.città;
  }

  public void setCittà(String città) {
    this.città = città;
  }

  public String getCap() {
    return this.cap;
  }

  public void setCap(String cap) {
    this.cap = cap;
  }

  public String getPIVA() {
    return this.piva;
  }

  public void setPIVA(String piva) {
    this.piva = piva;
  }

  public String getMaster() {
    return this.master;
  }

  public void setMaster(String master) {
    this.master = master;
  }
}
