package com.retexspa.xr.masterdata.articolo.entities;

import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import java.io.IOException;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "articoli")
public class ArticoloQueryEntity {

  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  private String id;

  @Column(name = "descrizione")
  private String descrizione;

  @Column(name = "reparto")
  private String reparto;

  @Column(name = "produttore")
  private String produttore;

  @Column(name = "codice1")
  private String codice1;

  @Column(name = "codice2")
  private String codice2;

  @Column(name = "codice3")
  private String codice3;

  // constructors
  public ArticoloQueryEntity() {}

  public ArticoloQueryEntity(String articoloId, ArticoloDTO articoloDTO) throws IOException {
    // ObjectMapper objectMapper = new ObjectMapper();
    // ObjectReader objectReader = objectMapper.readerForUpdating(this);
    // String jsonInString = objectMapper.writeValueAsString(articoloDTO);
    // Object t = objectReader.readValue(jsonInString, ArticoloQueryEntity.class);
    // this.articolo = articolo;
    // this.descrizione = articoloDTO.getDescription();
    this.id = articoloId;
    this.codice1 = articoloDTO.getCodice();
    this.descrizione = articoloDTO.getDescrizione();
    this.codice2 = articoloDTO.getCodice2();
    this.codice3 = articoloDTO.getCodice3();
    this.produttore = articoloDTO.getProduttore();
    this.reparto = articoloDTO.getReparto();
  }

  // getters and setters
  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDescriz() {
    return this.descrizione;
  }

  public void setDescriz(String descrizione) {
    this.descrizione = descrizione;
  }

  public String getReparto() {
    return this.reparto;
  }

  public void setReparto(String reparto) {
    this.reparto = reparto;
  }

  public String getProduttore() {
    return this.produttore;
  }

  public void setProduttore(String produttore) {
    this.produttore = produttore;
  }

  public String getArtcedi() {
    return this.codice2;
  }

  public void setArtcedi(String codice2) {
    this.codice2 = codice2;
  }

  public String getArtbo() {
    return this.codice1;
  }

  public void setArtbo(String codice1) {
    this.codice1 = codice1;
  }

  public String getIdsendecr() {
    return this.codice3;
  }

  public void setIdsendecr(String codice3) {
    this.codice3 = codice3;
  }  
}
