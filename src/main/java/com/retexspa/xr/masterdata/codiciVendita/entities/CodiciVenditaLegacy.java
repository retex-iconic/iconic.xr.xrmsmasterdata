package com.retexspa.xr.masterdata.codiciVendita.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Column;

// Table --> "CodiceVendita" ("ARTCAS")
public class CodiciVenditaLegacy {

   @Column(name = "articolo", length = 6)
   private String articolo;

   @Column(name = "tipocod", length = 1)
   private String tipocod;

   @Column(name = "artcas", length = 13)
   private String artcas;

   @Column(name = "moltip", length = 1)
   private String moltip;

   @Column(name = "datins")
   private LocalDate datins;

   @Column(name = "datmod")
   private LocalDate datmod;

   @Column(name = "datulve")
   private LocalDate datulve;

   @Column(name = "qtamolt")
   private Integer qtamolt;

   @Column(name = "przmolt", precision = 10, scale = 2)
   private BigDecimal przmolt;

   @Column(name = "desmolt", length = 20)
   private String desmolt;

   @Column(name = "stato", length = 1)
   private String stato;

   @Column(name = "scomolt", precision = 6, scale = 2)
   private BigDecimal scomolt;

   @Column(name = "tipoprz", length = 1)
   private String tipoprz;

   @Column(name = "artecr", length = 13)
   private String artecr;

   @Column(name = "eanbo", length = 16)
   private String eanbo;

   @Column(name = "variante", length = 6)
   private String variante;

   @Column(name = "dataoraupd", length = 14)
   private String dataoraupd;

   public String getArticolo() {
      return this.articolo;
   }

   public void setArticolo(String articolo) {
      this.articolo = articolo;
   }

   public String getTipocod() {
      return this.tipocod;
   }

   public void setTipocod(String tipocod) {
      this.tipocod = tipocod;
   }

   public String getArtcas() {
      return this.artcas;
   }

   public void setArtcas(String artcas) {
      this.artcas = artcas;
   }

   public String getMoltip() {
      return this.moltip;
   }

   public void setMoltip(String moltip) {
      this.moltip = moltip;
   }

   public LocalDate getDatins() {
      return this.datins;
   }

   public void setDatins(LocalDate datins) {
      this.datins = datins;
   }

   public LocalDate getDatmod() {
      return this.datmod;
   }

   public void setDatmod(LocalDate datmod) {
      this.datmod = datmod;
   }

   public LocalDate getDatulve() {
      return this.datulve;
   }

   public void setDatulve(LocalDate datulve) {
      this.datulve = datulve;
   }

   public Integer getQtamolt() {
      return this.qtamolt;
   }

   public void setQtamolt(Integer qtamolt) {
      this.qtamolt = qtamolt;
   }

   public BigDecimal getPrzmolt() {
      return this.przmolt;
   }

   public void setPrzmolt(BigDecimal przmolt) {
      this.przmolt = przmolt;
   }

   public String getDesmolt() {
      return this.desmolt;
   }

   public void setDesmolt(String desmolt) {
      this.desmolt = desmolt;
   }

   public String getStato() {
      return this.stato;
   }

   public void setStato(String stato) {
      this.stato = stato;
   }

   public BigDecimal getScomolt() {
      return this.scomolt;
   }

   public void setScomolt(BigDecimal scomolt) {
      this.scomolt = scomolt;
   }

   public String getTipoprz() {
      return this.tipoprz;
   }

   public void setTipoprz(String tipoprz) {
      this.tipoprz = tipoprz;
   }

   public String getArtecr() {
      return this.artecr;
   }

   public void setArtecr(String artecr) {
      this.artecr = artecr;
   }

   public String getEanbo() {
      return this.eanbo;
   }

   public void setEanbo(String eanbo) {
      this.eanbo = eanbo;
   }

   public String getVariante() {
      return this.variante;
   }

   public void setVariante(String variante) {
      this.variante = variante;
   }

   public String getDataoraupd() {
      return this.dataoraupd;
   }

   public void setDataoraupd(String dataoraupd) {
      this.dataoraupd = dataoraupd;
   }

}
