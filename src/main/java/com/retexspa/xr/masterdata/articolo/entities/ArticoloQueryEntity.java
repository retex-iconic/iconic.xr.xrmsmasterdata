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

  @Column(name = "descriz", length = 30)
  private String descriz;

  @Column(name = "reparto", length = 4)
  private String reparto;

  @Column(name = "produttore", length = 6)
  private String produttore;

  @Column(name = "artcedi", length = 16)
  private String artcedi;

  @Column(name = "artbo", length = 16)
  private String artbo;

  @Column(name = "idsendecr", length = 8)
  private String idsendecr;

  // constructors
  public ArticoloQueryEntity() {}

  public ArticoloQueryEntity(String articoloId, ArticoloDTO articoloDTO) throws IOException {
    // ObjectMapper objectMapper = new ObjectMapper();
    // ObjectReader objectReader = objectMapper.readerForUpdating(this);
    // String jsonInString = objectMapper.writeValueAsString(articoloDTO);
    // Object t = objectReader.readValue(jsonInString, ArticoloQueryEntity.class);
    // this.articolo = articolo;
    // this.descriz = articoloDTO.getDescription();
    this.id = articoloId;
    this.artbo = articoloDTO.getCodice();
    this.descriz = articoloDTO.getDescrizione();
    this.artcedi = articoloDTO.getCodice2();
    this.idsendecr = articoloDTO.getCodice3();
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
    return this.descriz;
  }

  public void setDescriz(String descriz) {
    this.descriz = descriz;
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
    return this.artcedi;
  }

  public void setArtcedi(String artcedi) {
    this.artcedi = artcedi;
  }

  public String getArtbo() {
    return this.artbo;
  }

  public void setArtbo(String artbo) {
    this.artbo = artbo;
  }

  public String getIdsendecr() {
    return this.idsendecr;
  }

  public void setIdsendecr(String idsendecr) {
    this.idsendecr = idsendecr;
  }  
}
