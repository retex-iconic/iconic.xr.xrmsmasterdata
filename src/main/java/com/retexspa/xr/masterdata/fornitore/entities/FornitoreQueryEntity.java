package com.retexspa.xr.masterdata.fornitore.entities;

import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;
import com.retexspa.xr.masterdata.negozio.entities.NegozioQueryEntity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "fornitori")
public class FornitoreQueryEntity {

  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  // one to many --> articoli
  // many to one --> negozio
  private String id;

  @OneToMany(fetch = FetchType.EAGER, mappedBy="articoloIds")
  private List<String> articoloIds;

  @ManyToOne(targetEntity = NegozioQueryEntity.class)
  @JoinColumn(name = "codice")
  private String codice;

  @Column(name = "numeroFornitore")
  private String numeroFornitore;

  @Column(name = "nomeFornitore")
  private String nomeFornitore;

  @Column(name = "indirizzoFornitore")
  private String indirizzoFornitore;

  @Column(name = "cittaFornitore")
  private String cittaFornitore;

  @Column(name = "capFornitore")
  private String capFornitore;

  @Column(name = "PIVAFornitore")
  private String PIVAFornitore;

  @Column(name = "master")
  private String master;

  public FornitoreQueryEntity() {}

  public FornitoreQueryEntity(String fornitoreId, FornitoreDTO fornitoreDTO) {
    this.id = fornitoreId;
    this.codice = fornitoreDTO.getCodice();
    this.numeroFornitore = fornitoreDTO.getNumeroFornitore();
    this.nomeFornitore = fornitoreDTO.getNomeFornitore();
    this.indirizzoFornitore = fornitoreDTO.getIndirizzoFornitore();
    this.cittaFornitore = fornitoreDTO.getCittaFornitore();
    this.capFornitore = fornitoreDTO.getCapFornitore();
    this.PIVAFornitore = fornitoreDTO.getPIVAFornitore();
    this.master = fornitoreDTO.getMaster();
    this.articoloIds = new ArrayList<>();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<String> getArticoloIds() {
    return this.articoloIds;
  }

  public void setArticoloIds(List<String> articoloIds) {
    this.articoloIds = articoloIds;
  }

  public String getCodice() {
    return this.codice;
  }

  public void setCodice(String codice) {
    this.codice = codice;
  }

  public String getCodiceFornitore() {
    return this.codice;
  }

  public void setCodiceFornitore(String codice) {
    this.codice = codice;
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

  public String getIndirizzoFornitore() {
    return this.indirizzoFornitore;
  }

  public void setIndirizzoFornitore(String indirizzoFornitore) {
    this.indirizzoFornitore = indirizzoFornitore;
  }

  public String getCittaFornitore() {
    return this.cittaFornitore;
  }

  public void setCittaFornitore(String cittaFornitore) {
    this.cittaFornitore = cittaFornitore;
  }

  public String getCapFornitore() {
    return this.capFornitore;
  }

  public void setCapFornitore(String capFornitore) {
    this.capFornitore = capFornitore;
  }

  public String getPIVAFornitore() {
    return this.PIVAFornitore;
  }

  public void setPIVAFornitore(String PIVAFornitore) {
    this.PIVAFornitore = PIVAFornitore;
  }

  public String getMaster() {
    return this.master;
  }

  public void setMaster(String master) {
    this.master = master;
  }
}
