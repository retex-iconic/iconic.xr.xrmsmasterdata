package com.retexspa.xr.masterdata.codiciVendita.commands.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.axonframework.modelling.command.TargetAggregateIdentifier;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CodiciVenditaDTO {

    @TargetAggregateIdentifier private String id;
    
    private String articolo;

    private String tipoCodiceVendita;

    private String codiceVendita;

    private String codiceMoltiplicatore;

    private LocalDate codiceVenditaLocale;

    // private LocalDate datins;

    // private LocalDate datmod;

    // private Integer datulve;

    private BigDecimal quantitaCodiceVendita;

    private String prezzoCodiceVendita;
    
    private String descrizioneCodiceVendita;

    private BigDecimal stato;

    private String scontoCodiceVendita;

    // private String tipoprz;

    // private String artecr;

    // private String eanbo;

    private String variante;

    // private String dataoraupd;
    
    private String codiciVenditaId;

    private List<String> codiciVenditaIds;

    public CodiciVenditaDTO(String codiciVenditaId) {
        this.id = getIdFromArticolo(codiciVenditaId);
        this.codiciVenditaId = codiciVenditaId;
        this.codiciVenditaIds = new ArrayList<String>();
    }

    private String getIdFromArticolo(String negozioId) {
        return UUID.nameUUIDFromBytes(("/CodiciVenditaIndex/" + negozioId).getBytes()).toString();
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

    public String getVariante() {
        return this.variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public String getCodiciVenditaId() {
        return this.codiciVenditaId;
    }

    public void setCodiciVenditaId(String codiciVenditaId) {
        this.codiciVenditaId = codiciVenditaId;
    }

    public List<String> getCodiciVenditaIds() {
        return this.codiciVenditaIds;
    }

    public void setCodiciVenditaIds(List<String> codiciVenditaIds) {
        this.codiciVenditaIds = codiciVenditaIds;
    }
}
