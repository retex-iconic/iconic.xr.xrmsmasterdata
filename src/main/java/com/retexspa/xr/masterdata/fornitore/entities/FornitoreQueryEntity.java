package com.retexspa.xr.masterdata.fornitore.entities;

import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "fornitori")
public class FornitoreQueryEntity {

  //TODO correct this to be equivalent to the FornitoreDTO class!

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

  @Column(name = "fornom", length = 30)
  private String fornom;

  public FornitoreQueryEntity() {}

  public FornitoreQueryEntity(String fornitoreId, FornitoreDTO fornitoreDTO) {
    this.id = fornitoreId;
    this.fornom = fornitoreDTO.getName();
    this.master = fornitoreDTO.getMaster();
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

  public String getFornom() {
    return this.fornom;
  }

  public void setFornom(String fornom) {
    this.fornom = fornom;
  }
}
