package com.retexspa.xr.masterdata.articoloFornitore.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Column;

// Table --> "ArticoliFornitori" ("ACQUISTI")
public class ArticoloFornitoreLegacy {

   @Column(name = "fornitore", length = 4)
   private String fornitore;

   @Column(name = "articolo", length = 6)
   private String articolo;

   @Column(name = "prezzcart", length = 1)
   private String prezzcart;

   @Column(name = "pezzicart", precision = 7, scale = 2)
   private BigDecimal pezzicart;

   @Column(name = "lotrior")
   private Integer lotrior;

   @Column(name = "quanacq", precision = 9, scale = 2)
   private BigDecimal quanacq;

   @Column(name = "valacq", precision = 12, scale = 2)
   private BigDecimal valacq;

   @Column(name = "datulacq")
   private LocalDate datulacq;

   @Column(name = "ultqua", precision = 9, scale = 2)
   private BigDecimal ultqua;

   @Column(name = "ultprli", precision = 12, scale = 3)
   private BigDecimal ultprli;

   @Column(name = "ultprsc", precision = 11, scale = 2)
   private BigDecimal ultprsc;

   @Column(name = "ultprsi", precision = 11, scale = 2)
   private BigDecimal ultprsi;

   @Column(name = "penprsc", precision = 11, scale = 2)
   private BigDecimal penprsc;

   @Column(name = "costfut", precision = 11, scale = 2)
   private BigDecimal costfut;

   @Column(name = "datcofu")
   private LocalDate datcofu;

   @Column(name = "prsosp", precision = 11, scale = 2)
   private BigDecimal prsosp;

   @Column(name = "quaord", precision = 7, scale = 2)
   private BigDecimal quaord;

   @Column(name = "datord")
   private LocalDate datord;

   @Column(name = "prord", precision = 11, scale = 2)
   private BigDecimal prord;

   @Column(name = "scontrel", precision = 10, scale = 2)
   private BigDecimal scontrel;

   @Column(name = "note", length = 30)
   private String note;

   @Column(name = "costoagg", precision = 10, scale = 2)
   private BigDecimal costoagg;

   @Column(name = "quareso", precision = 9, scale = 2)
   private BigDecimal quareso;

   @Column(name = "valreso", precision = 12, scale = 2)
   private BigDecimal valreso;

   @Column(name = "penprli", precision = 11, scale = 3)
   private BigDecimal penprli;

   @Column(name = "datprli")
   private LocalDate datprli;

   @Column(name = "costoper", precision = 4, scale = 1)
   private BigDecimal costoper;

   @Column(name = "rifforn", length = 4)
   private String rifforn;

   @Column(name = "rifartf", length = 13)
   private String rifartf;

   @Column(name = "viscofu", length = 1)
   private String viscofu;

   @Column(name = "dataoraupd", length = 14)
   private String dataoraupd;

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

   public String getPrezzcart() {
      return this.prezzcart;
   }

   public void setPrezzcart(String prezzcart) {
      this.prezzcart = prezzcart;
   }

   public BigDecimal getPezzicart() {
      return this.pezzicart;
   }

   public void setPezzicart(BigDecimal pezzicart) {
      this.pezzicart = pezzicart;
   }

   public Integer getLotrior() {
      return this.lotrior;
   }

   public void setLotrior(Integer lotrior) {
      this.lotrior = lotrior;
   }

   public BigDecimal getQuanacq() {
      return this.quanacq;
   }

   public void setQuanacq(BigDecimal quanacq) {
      this.quanacq = quanacq;
   }

   public BigDecimal getValacq() {
      return this.valacq;
   }

   public void setValacq(BigDecimal valacq) {
      this.valacq = valacq;
   }

   public LocalDate getDatulacq() {
      return this.datulacq;
   }

   public void setDatulacq(LocalDate datulacq) {
      this.datulacq = datulacq;
   }

   public BigDecimal getUltqua() {
      return this.ultqua;
   }

   public void setUltqua(BigDecimal ultqua) {
      this.ultqua = ultqua;
   }

   public BigDecimal getUltprli() {
      return this.ultprli;
   }

   public void setUltprli(BigDecimal ultprli) {
      this.ultprli = ultprli;
   }

   public BigDecimal getUltprsc() {
      return this.ultprsc;
   }

   public void setUltprsc(BigDecimal ultprsc) {
      this.ultprsc = ultprsc;
   }

   public BigDecimal getUltprsi() {
      return this.ultprsi;
   }

   public void setUltprsi(BigDecimal ultprsi) {
      this.ultprsi = ultprsi;
   }

   public BigDecimal getPenprsc() {
      return this.penprsc;
   }

   public void setPenprsc(BigDecimal penprsc) {
      this.penprsc = penprsc;
   }

   public BigDecimal getCostfut() {
      return this.costfut;
   }

   public void setCostfut(BigDecimal costfut) {
      this.costfut = costfut;
   }

   public LocalDate getDatcofu() {
      return this.datcofu;
   }

   public void setDatcofu(LocalDate datcofu) {
      this.datcofu = datcofu;
   }

   public BigDecimal getPrsosp() {
      return this.prsosp;
   }

   public void setPrsosp(BigDecimal prsosp) {
      this.prsosp = prsosp;
   }

   public BigDecimal getQuaord() {
      return this.quaord;
   }

   public void setQuaord(BigDecimal quaord) {
      this.quaord = quaord;
   }

   public LocalDate getDatord() {
      return this.datord;
   }

   public void setDatord(LocalDate datord) {
      this.datord = datord;
   }

   public BigDecimal getPrord() {
      return this.prord;
   }

   public void setPrord(BigDecimal prord) {
      this.prord = prord;
   }

   public BigDecimal getScontrel() {
      return this.scontrel;
   }

   public void setScontrel(BigDecimal scontrel) {
      this.scontrel = scontrel;
   }

   public String getNote() {
      return this.note;
   }

   public void setNote(String note) {
      this.note = note;
   }

   public BigDecimal getCostoagg() {
      return this.costoagg;
   }

   public void setCostoagg(BigDecimal costoagg) {
      this.costoagg = costoagg;
   }

   public BigDecimal getQuareso() {
      return this.quareso;
   }

   public void setQuareso(BigDecimal quareso) {
      this.quareso = quareso;
   }

   public BigDecimal getValreso() {
      return this.valreso;
   }

   public void setValreso(BigDecimal valreso) {
      this.valreso = valreso;
   }

   public BigDecimal getPenprli() {
      return this.penprli;
   }

   public void setPenprli(BigDecimal penprli) {
      this.penprli = penprli;
   }

   public LocalDate getDatprli() {
      return this.datprli;
   }

   public void setDatprli(LocalDate datprli) {
      this.datprli = datprli;
   }

   public BigDecimal getCostoper() {
      return this.costoper;
   }

   public void setCostoper(BigDecimal costoper) {
      this.costoper = costoper;
   }

   public String getRifforn() {
      return this.rifforn;
   }

   public void setRifforn(String rifforn) {
      this.rifforn = rifforn;
   }

   public String getRifartf() {
      return this.rifartf;
   }

   public void setRifartf(String rifartf) {
      this.rifartf = rifartf;
   }

   public String getViscofu() {
      return this.viscofu;
   }

   public void setViscofu(String viscofu) {
      this.viscofu = viscofu;
   }

   public String getDataoraupd() {
      return this.dataoraupd;
   }

   public void setDataoraupd(String dataoraupd) {
      this.dataoraupd = dataoraupd;
   }

}
