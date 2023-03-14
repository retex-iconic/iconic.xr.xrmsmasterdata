package com.retexspa.xr.masterdata.negozio.entities;

import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioArticoloIndexDTO;
import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import java.io.IOException;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "negozi")
public class NegozioQueryEntity {

  // TODO correct this to be equivalent to the NegozioDTO class!

  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  // one to many --> sia per articoli che per fornitori
  private String id;

  @OneToMany(fetch = FetchType.EAGER, mappedBy="articoloIds")
  private List<String> articoloIds;

  @OneToMany(fetch = FetchType.EAGER, mappedBy="fornitoreIds")
  private List<String> fornitoreIds;

  @Column(name = "master")
  private String master;

  @Column(name = "ragionesociale")
  private String ragioneSociale;

  @Column(name = "codicefiscale")
  private String codiceFiscale;

  @Column(name = "regimefiscale")
  private String regimeFiscale;

  public NegozioQueryEntity() {}

  public NegozioQueryEntity(String negozioId, NegozioDTO negozioDTO) throws IOException {

    NegozioArticoloIndexDTO negozioArticoloIndexDTO = new NegozioArticoloIndexDTO(negozioId);

    this.id = negozioId;
    this.ragioneSociale = negozioDTO.getRagioneSociale();
    this.codiceFiscale = negozioDTO.getCodiceFiscale();
    this.regimeFiscale = negozioDTO.getRegimeFiscale();
    this.master = negozioDTO.getMaster();
    this.articoloIds = negozioArticoloIndexDTO.getArticoloIds();
    this.fornitoreIds = negozioArticoloIndexDTO.getFornitoreIds();
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

  public List<String> getFornitoreIds() {
    return this.fornitoreIds;
  }

  public void setFornitoreIds(List<String> fornitoreIds) {
    this.fornitoreIds = fornitoreIds;
  }

  public String getMaster() {
    return this.master;
  }

  public void setMaster(String master) {
    this.master = master;
  }

  public String getRagioneSociale() {
    return this.ragioneSociale;
  }

  public void setRagioneSociale(String ragioneSociale) {
    this.ragioneSociale = ragioneSociale;
  }

  public String getCodiceFiscale() {
    return this.codiceFiscale;
  }

  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  public String getRegimeFiscale() {
    return this.regimeFiscale;
  }

  public void setRegimeFiscale(String regimeFiscale) {
    this.regimeFiscale = regimeFiscale;
  }
}
