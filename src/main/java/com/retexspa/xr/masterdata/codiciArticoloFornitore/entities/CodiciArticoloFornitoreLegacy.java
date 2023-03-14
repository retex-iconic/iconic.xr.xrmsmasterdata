package com.retexspa.xr.masterdata.codiciArticoloFornitore.entities;

import java.math.BigDecimal;
import javax.persistence.Column;

// Table --> "CodiceArticoloFornitore" ("ARTFOR")
public class CodiciArticoloFornitoreLegacy {

   @Column(name = "fornitore", length = 4)
   private String fornitore;

   @Column(name = "artfor", length = 13)
   private String artfor;

   @Column(name = "articolo", length = 6)
   private String articolo;

   @Column(name = "prezzcart", length = 1)
   private String prezzcart;

   @Column(name = "pezzicart", precision = 7, scale = 2)
   private BigDecimal pezzicart;

   @Column(name = "descriz", length = 30)
   private String descriz;

   @Column(name = "tipo", length = 1)
   private String tipo;

   @Column(name = "misura", length = 2)
   private String misura;

   @Column(name = "quantita")
   private Integer quantita;

   @Column(name = "codicesap", length = 20)
   private String codicesap;

   @Column(name = "dataoraupd", length = 14)
   private String dataoraupd;

   public String getFornitore() {
      return this.fornitore;
   }

   public void setFornitore(String fornitore) {
      this.fornitore = fornitore;
   }

   public String getArtfor() {
      return this.artfor;
   }

   public void setArtfor(String artfor) {
      this.artfor = artfor;
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

   public String getDescriz() {
      return this.descriz;
   }

   public void setDescriz(String descriz) {
      this.descriz = descriz;
   }

   public String getTipo() {
      return this.tipo;
   }

   public void setTipo(String tipo) {
      this.tipo = tipo;
   }

   public String getMisura() {
      return this.misura;
   }

   public void setMisura(String misura) {
      this.misura = misura;
   }

   public Integer getQuantita() {
      return this.quantita;
   }

   public void setQuantita(Integer quantita) {
      this.quantita = quantita;
   }

   public String getCodicesap() {
      return this.codicesap;
   }

   public void setCodicesap(String codicesap) {
      this.codicesap = codicesap;
   }

   public String getDataoraupd() {
      return this.dataoraupd;
   }

   public void setDataoraupd(String dataoraupd) {
      this.dataoraupd = dataoraupd;
   }

}
