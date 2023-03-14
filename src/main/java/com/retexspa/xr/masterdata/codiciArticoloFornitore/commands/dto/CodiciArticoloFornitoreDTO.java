package com.retexspa.xr.masterdata.codiciArticoloFornitore.commands.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.axonframework.modelling.command.TargetAggregateIdentifier;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CodiciArticoloFornitoreDTO {

    @TargetAggregateIdentifier private String id;
    
    private String fornitore;

    private String codiceArticoloFornitore;

    private String articolo;

    private BigDecimal costoCartone;

    private String pezziCartone;

    private String descrizione;

    private String tipo;

    private Integer unitaDiMisura;

    private String quantita;

    private String codiceSAP;

    private String codiceArticoloFornitoreId;
    
    private List<String> codiceArticoloFornitoreIds;

    public CodiciArticoloFornitoreDTO(String codiceArticoloFornitoreId) {
        this.id = getIdFromArticolo(codiceArticoloFornitoreId);
        this.codiceArticoloFornitoreId = codiceArticoloFornitoreId;
        this.codiceArticoloFornitoreIds = new ArrayList<String>();
    }

    private String getIdFromArticolo(String articoloId) {
        return UUID.nameUUIDFromBytes(("/CodiciArticoloFornitoreIndex/" + articoloId).getBytes()).toString();
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

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodiceArticoloFornitoreId() {
        return this.codiceArticoloFornitoreId;
    }

    public void setCodiceArticoloFornitoreId(String codiceArticoloFornitoreId) {
        this.codiceArticoloFornitoreId = codiceArticoloFornitoreId;
    }

    public List<String> getCodiceArticoloFornitoreIds() {
        return this.codiceArticoloFornitoreIds;
    }

    public void setCodiceArticoloFornitoreIds(List<String> codiceArticoloFornitoreIds) {
        this.codiceArticoloFornitoreIds = codiceArticoloFornitoreIds;
    }
}
