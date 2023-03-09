package com.retexspa.xr.masterdata.articoloFornitore.entities;

import com.retexspa.xr.masterdata.articoloFornitore.commands.dto.ArticoloFornitoreDTO;
import java.io.IOException;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "articoliFornitori")
public class ArticoloFornitoreQueryEntity {

  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  private String id;

  @Column(name = "fornitore")
  private String fornitore;

  @Column(name = "articolo")
  private String articolo;

  @Column(name = "costoCartone")
  private String costoCartone;

  @Column(name = "pezziPerCartone")
  private BigDecimal pezziPerCartone;

  @Column(name = "lottoRiordino")
  private Integer lottoRiordino;

  @Column(name = "codice3")
  private String codice3;

  @Column(name = "note")
  private String note;

  @Column(name = "master")
  private String master;

  // constructors
  public ArticoloFornitoreQueryEntity() {}

  public ArticoloFornitoreQueryEntity(String articoloFornitoreId, ArticoloFornitoreDTO articoloFornitoreDTO) throws IOException {
    // ObjectMapper objectMapper = new ObjectMapper();
    // ObjectReader objectReader = objectMapper.readerForUpdating(this);
    // String jsonInString = objectMapper.writeValueAsString(articoloFornitoreDTO);
    // Object t = objectReader.readValue(jsonInString, ArticoloFornitoreQueryEntity.class);

    this.id = articoloFornitoreId;
    this.fornitore = articoloFornitoreDTO.getFornitore();
    this.articolo = articoloFornitoreDTO.getArticolo();
    this.costoCartone = articoloFornitoreDTO.getCostoCartone();
    this.pezziPerCartone = articoloFornitoreDTO.getPezziPerCartone();
    this.lottoRiordino = articoloFornitoreDTO.getLottoRiordino();
    this.note = articoloFornitoreDTO.getNote();
    this.master = articoloFornitoreDTO.getMaster();
  }

  // getters and setters
  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
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

  public String getCodice3() {
    return this.codice3;
  }

  public void setCodice3(String codice3) {
    this.codice3 = codice3;
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