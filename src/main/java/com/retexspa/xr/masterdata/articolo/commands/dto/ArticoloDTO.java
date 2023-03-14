package com.retexspa.xr.masterdata.articolo.commands.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.math.BigDecimal;

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

  private String descrizioneBreve;

  private String unitaDiMisura;

  private Integer quantita;

  private Integer scortaMinima;

  private Integer deposito;

  private String scaffale;

  private BigDecimal superficieEspositiva;

  private Integer quantitaImpegnata;

  private Integer scortaMassima;

  private Integer layoutEtichetta;

  private String tipoProdotto;

  private Integer numeroEtichette;

  private String tipoScaricoVenduto;

  private String fornitorePrimario;

  private String fornitoreEtichetta;

  private Integer posizionamento;

  private Integer stagionalita;

  private Integer tipoProdotto2;

  private String svalorizzazione;

  private String cluster;

  private String assortimentoPuntoVendita;

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

  public String getDescrizioneBreve() {
    return descrizioneBreve;
  }

  public void setDescrizioneBreve(String descrizioneBreve) {
    this.descrizioneBreve = descrizioneBreve;
  }

  public String getUnitaDiMisura() {
    return unitaDiMisura;
  }

  public void setUnitaDiMisura(String unitaDiMisura) {
    this.unitaDiMisura = unitaDiMisura;
  }

  public Integer getQuantita() {
    return quantita;
  }

  public void setQuantita(Integer quantita) {
    this.quantita = quantita;
  }

  public Integer getScortaMinima() {
    return scortaMinima;
  }

  public void setScortaMinima(Integer scortaMinima) {
    this.scortaMinima = scortaMinima;
  }

  public Integer getDeposito() {
    return deposito;
  }

  public void setDeposito(Integer deposito) {
    this.deposito = deposito;
  }

  public String getScaffale() {
    return scaffale;
  }

  public void setScaffale(String scaffale) {
    this.scaffale = scaffale;
  }

  public BigDecimal getSuperficieEspositiva() {
    return superficieEspositiva;
  }

  public void setSuperficieEspositiva(BigDecimal superficieEspositiva) {
    this.superficieEspositiva = superficieEspositiva;
  }

  public Integer getQuantitaImpegnata() {
    return quantitaImpegnata;
  }

  public void setQuantitaImpegnata(Integer quantitaImpegnata) {
    this.quantitaImpegnata = quantitaImpegnata;
  }

  public Integer getScortaMassima() {
    return scortaMassima;
  }

  public void setScortaMassima(Integer scortaMassima) {
    this.scortaMassima = scortaMassima;
  }

  public Integer getLayoutEtichetta() {
    return layoutEtichetta;
  }

  public void setLayoutEtichetta(Integer layoutEtichetta) {
    this.layoutEtichetta = layoutEtichetta;
  }

  public String getTipoProdotto() {
    return tipoProdotto;
  }

  public void setTipoProdotto(String tipoProdotto) {
    this.tipoProdotto = tipoProdotto;
  }

  public Integer getNumeroEtichette() {
    return numeroEtichette;
  }

  public void setNumeroEtichette(Integer numeroEtichette) {
    this.numeroEtichette = numeroEtichette;
  }

  public String getTipoScaricoVenduto() {
    return tipoScaricoVenduto;
  }

  public void setTipoScaricoVenduto(String tipoScaricoVenduto) {
    this.tipoScaricoVenduto = tipoScaricoVenduto;
  }

  public String getFornitorePrimario() {
    return fornitorePrimario;
  }

  public void setFornitorePrimario(String fornitorePrimario) {
    this.fornitorePrimario = fornitorePrimario;
  }

  public String getFornitoreEtichetta() {
    return fornitoreEtichetta;
  }

  public void setFornitoreEtichetta(String fornitoreEtichetta) {
    this.fornitoreEtichetta = fornitoreEtichetta;
  }

  public Integer getPosizionamento() {
    return posizionamento;
  }

  public void setPosizionamento(Integer posizionamento) {
    this.posizionamento = posizionamento;
  }

  public Integer getStagionalita() {
    return stagionalita;
  }

  public void setStagionalita(Integer stagionalita) {
    this.stagionalita = stagionalita;
  }

  public Integer getTipoProdotto2() {
    return tipoProdotto2;
  }

  public void setTipoProdotto2(Integer tipoProdotto2) {
    this.tipoProdotto2 = tipoProdotto2;
  }

  public String getSvalorizzazione() {
    return svalorizzazione;
  }

  public void setSvalorizzazione(String svalorizzazione) {
    this.svalorizzazione = svalorizzazione;
  }

  public String getCluster() {
    return cluster;
  }

  public void setCluster(String cluster) {
    this.cluster = cluster;
  }

  public String getAssortimentoPuntoVendita() {
    return assortimentoPuntoVendita;
  }

  public void setAssortimentoPuntoVendita(String assortimentoPuntoVendita) {
    this.assortimentoPuntoVendita = assortimentoPuntoVendita;
  }
}
