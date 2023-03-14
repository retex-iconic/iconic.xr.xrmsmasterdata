package com.retexspa.xr.masterdata.codiciVendita.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import com.retexspa.xr.masterdata.codiciVendita.commands.dto.CodiciVenditaDTO;

@Entity
@Table(name="CodiceVendita")
public class CodiciVenditaQueryEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    // @ManyToOne --> articoli
    @Column(name = "articolo")
    private String articolo;

    @Column(name = "tipoCodiceVendita")
    private String tipoCodiceVendita;

    @Column(name = "codiceVendita")
    private String codiceVendita;

    @Column(name = "codiceMoltiplicatore")
    private String codiceMoltiplicatore;

    @Column(name = "codiceVenditaLocale")
    private LocalDate codiceVenditaLocale;

    @Column(name = "quantitaCodiceVendita")
    private BigDecimal quantitaCodiceVendita;

    @Column(name = "prezzoCodiceVendita")
    private String prezzoCodiceVendita;

    @Column(name = "descrizioneCodiceVendita")
    private String descrizioneCodiceVendita;

    @Column(name = "stato")
    private BigDecimal stato;

    @Column(name = "scontoCodiceVendita")
    private String scontoCodiceVendita;

    public CodiciVenditaQueryEntity() {
    }

    public CodiciVenditaQueryEntity(String codiceVenditaId, CodiciVenditaDTO codiciVenditaDTO) {
        this.id = codiceVenditaId;
        this.articolo = codiciVenditaDTO.getArticolo();
        this.tipoCodiceVendita = codiciVenditaDTO.getTipoCodiceVendita();
        this.codiceVendita = codiciVenditaDTO.getCodiceVendita();
        this.codiceMoltiplicatore = codiciVenditaDTO.getCodiceMoltiplicatore();
        this.codiceVenditaLocale = codiciVenditaDTO.getCodiceVenditaLocale();
        this.quantitaCodiceVendita = codiciVenditaDTO.getQuantitaCodiceVendita();
        this.prezzoCodiceVendita = codiciVenditaDTO.getPrezzoCodiceVendita();
        this.descrizioneCodiceVendita = codiciVenditaDTO.getDescrizioneCodiceVendita();
        this.stato = codiciVenditaDTO.getStato();
        this.scontoCodiceVendita = codiciVenditaDTO.getScontoCodiceVendita();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticolo() {
        return this.articolo;
    }

    public void setArticolo(String articolo) {
        this.articolo = articolo;
    }

    public String getTipoCodiceVendita() {
        return this.tipoCodiceVendita;
    }

    public void setTipoCodiceVendita(String tipoCodiceVendita) {
        this.tipoCodiceVendita = tipoCodiceVendita;
    }

    public String getCodiceVendita() {
        return this.codiceVendita;
    }

    public void setCodiceVendita(String codiceVendita) {
        this.codiceVendita = codiceVendita;
    }

    public String getCodiceMoltiplicatore() {
        return this.codiceMoltiplicatore;
    }

    public void setCodiceMoltiplicatore(String codiceMoltiplicatore) {
        this.codiceMoltiplicatore = codiceMoltiplicatore;
    }

    public LocalDate getCodiceVenditaLocale() {
        return this.codiceVenditaLocale;
    }

    public void setCodiceVenditaLocale(LocalDate codiceVenditaLocale) {
        this.codiceVenditaLocale = codiceVenditaLocale;
    }

    public BigDecimal getQuantitaCodiceVendita() {
        return this.quantitaCodiceVendita;
    }

    public void setQuantitaCodiceVendita(BigDecimal quantitaCodiceVendita) {
        this.quantitaCodiceVendita = quantitaCodiceVendita;
    }

    public String getPrezzoCodiceVendita() {
        return this.prezzoCodiceVendita;
    }

    public void setPrezzoCodiceVendita(String prezzoCodiceVendita) {
        this.prezzoCodiceVendita = prezzoCodiceVendita;
    }

    public String getDescrizioneCodiceVendita() {
        return this.descrizioneCodiceVendita;
    }

    public void setDescrizioneCodiceVendita(String descrizioneCodiceVendita) {
        this.descrizioneCodiceVendita = descrizioneCodiceVendita;
    }

    public BigDecimal getStato() {
        return this.stato;
    }

    public void setStato(BigDecimal stato) {
        this.stato = stato;
    }

    public String getScontoCodiceVendita() {
        return this.scontoCodiceVendita;
    }

    public void setScontoCodiceVendita(String scontoCodiceVendita) {
        this.scontoCodiceVendita = scontoCodiceVendita;
    }
}
