package com.retexspa.xr.masterdata.negozio.entities;

import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import java.io.IOException;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "negozi")
public class NegozioQueryEntity {

  //TODO correct this to be equivalent to the NegozioDTO class!

  @Id
  // @ManyToOne
  // @JoinColumn(name = "id", referencedColumnName = "parent")
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  private String id;

  // @OneToMany(cascade = CascadeType.ALL)
  // @JoinColumn(name = "parent")
  @Column(name = "master")
  private String master;

  @Column(name = "ragionesociale", length = 100)
  private String ragioneSociale;

  @Column(name = "codicefiscale", length = 16)
  private String codiceFiscale;

  @Column(name = "regimefiscale", length = 4)
  private String regimeFiscale;

  public NegozioQueryEntity() {}

  public NegozioQueryEntity(String negozioId, NegozioDTO negozioDTO) throws IOException {
    this.id = negozioId;
    this.ragioneSociale = negozioDTO.getRagioneSociale();
    this.codiceFiscale = negozioDTO.getCodiceFiscale();
    this.regimeFiscale = negozioDTO.getRegimeFiscale();
    this.master = negozioDTO.getMaster();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
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