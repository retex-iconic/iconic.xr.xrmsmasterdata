package com.retexspa.xr.masterdata.codiciArticoloFornitore.entities;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import com.retexspa.xr.masterdata.codiciArticoloFornitore.commands.dto.CodiciArticoloFornitoreDTO;

@Entity
@Table(name="CodiceArticoloFornitore")
public class CodiciArticoloFornitoreQueryEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    
    // @ManyToOne --> fornitori
    @Column(name = "fornitore")
    private String fornitore;
    
    @Column(name = "codiceArticoloFornitore")
    private String codiceArticoloFornitore;

    // @ManyToOne --> articoli
    @Column(name = "articolo")
    private String articolo;

    @Column(name = "costoCartone")
    private BigDecimal costoCartone;

    @Column(name = "pezziCartone")
    private String pezziCartone;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "unitaDiMisura")
    private Integer unitaDiMisura;

    @Column(name = "quantita")
    private String quantita;

    @Column(name = "codiceSAP")
    private String codiceSAP;

    public CodiciArticoloFornitoreQueryEntity() {
    }

    public CodiciArticoloFornitoreQueryEntity(String codiceArticoloFornitoreId, CodiciArticoloFornitoreDTO codiciArticoloFornitoreDTO) {
        this.id = codiceArticoloFornitoreId;
        this.fornitore = codiciArticoloFornitoreDTO.getFornitore();
        this.codiceArticoloFornitore = codiciArticoloFornitoreDTO.getCodiceArticoloFornitore();
        this.articolo = codiciArticoloFornitoreDTO.getArticolo();
        this.costoCartone = codiciArticoloFornitoreDTO.getCostoCartone();
        this.pezziCartone = codiciArticoloFornitoreDTO.getPezziCartone();
        // ecc ecc:
        // this.descrizione = codiciArticoloFornitoreDTO;
        // this.tipo = codiciArticoloFornitoreDTO;     
        // this.unitaDiMisura = codiciArticoloFornitoreDTO;
        // this.quantita = codiciArticoloFornitoreDTO;
        // this.codiceSAP = codiciArticoloFornitoreDTO;
    }

    public String getFornitore() {
        return this.fornitore;
    }

    public void setFornitore(String fornitore) {
        this.fornitore = fornitore;
    }

    public String getCodiceArticoloFornitore() {
        return this.codiceArticoloFornitore;
    }

    public void setCodiceArticoloFornitore(String codiceArticoloFornitore) {
        this.codiceArticoloFornitore = codiceArticoloFornitore;
    }

    public String getArticolo() {
        return this.articolo;
    }

    public void setArticolo(String articolo) {
        this.articolo = articolo;
    }

    public BigDecimal getCostoCartone() {
        return this.costoCartone;
    }

    public void setCostoCartone(BigDecimal costoCartone) {
        this.costoCartone = costoCartone;
    }

    public String getPezziCartone() {
        return this.pezziCartone;
    }

    public void setPezziCartone(String pezziCartone) {
        this.pezziCartone = pezziCartone;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getUnitaDiMisura() {
        return this.unitaDiMisura;
    }

    public void setUnitaDiMisura(Integer unitaDiMisura) {
        this.unitaDiMisura = unitaDiMisura;
    }

    public String getQuantita() {
        return this.quantita;
    }

    public void setQuantita(String quantita) {
        this.quantita = quantita;
    }

    public String getCodiceSAP() {
        return this.codiceSAP;
    }

    public void setCodiceSAP(String codiceSAP) {
        this.codiceSAP = codiceSAP;
    }
}
