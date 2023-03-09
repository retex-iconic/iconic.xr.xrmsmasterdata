package com.retexspa.xr.masterdata.articoloFornitore.entities;

import java.math.BigDecimal;
import javax.persistence.Column;

// Table --> articolifornitori (DBF_ACQUISTI)
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

   @Column(name = "note", length = 30)
   private String note;

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

   public String getNote() {
      return this.note;
   }

   public void setNote(String note) {
      this.note = note;
   }

}
