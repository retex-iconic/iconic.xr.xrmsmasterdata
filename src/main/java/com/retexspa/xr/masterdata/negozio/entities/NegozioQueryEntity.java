package com.retexspa.xr.masterdata.negozio.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;

import java.io.IOException;
import java.math.BigDecimal;

@Entity
@Table(name = "infoinst")
public class NegozioQueryEntity {

    @Id
    // @ManyToOne
    // @JoinColumn(name = "id", referencedColumnName = "parent")
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;

    // @OneToMany(cascade = CascadeType.ALL)
    // @JoinColumn(name = "parent")
    @Column(name = "parent")
    private String parent;

    @Column(name = "magazzino", length = 2)
    private String magazzino;

    @Column(name = "magsede", length = 2)
    private String magsede;

    @Column(name = "idpaese", length = 2)
    private String idpaese;
    
    @Column(name = "idcodice", length = 28)
    private String idcodice;
    
    @Column(name = "idcedente", length = 10)
    private String idcedente;

    @Column(name = "idpv", length = 10)
    private String idpv;

    @Column(name = "ragsoc", length = 100)
    private String ragsoc;

    @Column(name = "ragsoc2", length = 100)
    private String ragsoc2;
    
    @Column(name = "codfisc", length = 16)
    private String codfisc;

    @Column(name = "regfisc", length = 4)
    private String regfisc;

    @Column(name = "reauff", length = 2)
    private String reauff;
    
    @Column(name = "reanum", length = 20)
    private String reanum;

    @Column(name = "reacapsoc", precision = 15, scale = 2)
    private BigDecimal reacapsoc;

    @Column(name = "reasu", length = 2)
    private String reasu;

    @Column(name = "realiq", length = 2)
    private String realiq;

    @Column(name = "slind", length = 60)
    private String slind;

    @Column(name = "slcivico", length = 8)
    private String slcivico;

    @Column(name = "slcomune", length = 60)
    private String slcomune;

    @Column(name = "slprov", length = 2)
    private String slprov;

    @Column(name = "slcap", length = 5)
    private String slcap;

    @Column(name = "slnaz", length = 2)
    private String slnaz;

    @Column(name = "sonome", length = 100)
    private String sonome;
    
    @Column(name = "soind", length = 60)
    private String soind;

    @Column(name = "socivico", length = 8)
    private String socivico;
    
    @Column(name = "socomune", length = 60)
    private String socomune;

    @Column(name = "soprov", length = 2)
    private String soprov;

    @Column(name = "socap", length = 5)
    private String socap;

    @Column(name = "sonaz", length = 2)
    private String sonaz;

    @Column(name = "numtel", length = 12)
    private String numtel;
    
    @Column(name = "numcell", length = 12)
    private String numcell;
    
    @Column(name = "numfax", length = 12)
    private String numfax;
    
    @Column(name = "pec", length = 60)
    private String pec;
    
    @Column(name = "email", length = 60)
    private String email;

    @Column(name = "trpaese", length = 2)
    private String trpaese;
    
    @Column(name = "trcodice", length = 28)
    private String trcodice;

    @Column(name = "coddest", length = 7)
    private String coddest;
    
    @Column(name = "iban", length = 34)
    private String iban;

    @Column(name = "esenzpa", length = 2)
    private String esenzpa;

    @Column(name = "giornilav", length = 7)
    private String giornilav;
    
    @Column(name = "idcontratt", length = 10)
    private String idcontratt;

    @Column(name = "packfat")
    private Integer packfat;

    @Column(name = "comalt", length = 1)
    private String comalt;

    @Column(name = "exportcon", length = 1)
    private String exportcon;
    
    @Column(name = "mailcon", length = 60)
    private String mailcon;
    
    @Column(name = "ftpsrvcon", length = 60)
    private String ftpsrvcon;
    
    @Column(name = "ftppathcon", length = 60)
    private String ftppathcon;
    
    @Column(name = "ftpusrcon", length = 60)
    private String ftpusrcon;
    
    @Column(name = "ftppwdcon", length = 60)
    private String ftppwdcon;

    @Column(name = "ftpportcon", length = 5)
    private String ftpportcon;

    @Column(name = "sftpcon", length = 1)
    private String sftpcon;

    @Column(name = "gdpr", length = 1)
    private String gdpr;
    
    @Column(name = "emailsf", length = 60)
    private String emailsf;

    @Column(name = "ateco", length = 8)
    private String ateco;
    
    @Column(name = "lastnot", length = 14)
    private String lastnot;
    
    @Column(name = "dataoraupd", length = 14)
    private String dataoraupd;

    public NegozioQueryEntity() {
    }

    public NegozioQueryEntity(String negozioId, NegozioDTO negozioDTO) throws IOException {
        this.id = negozioId;
        this.idcodice = negozioDTO.getCode();
        this.parent = negozioDTO.getParent();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParent() {
        return this.parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getMagazzino() {
        return this.magazzino;
    }

    public void setMagazzino(String magazzino) {
        this.magazzino = magazzino;
    }

    public String getMagsede() {
        return this.magsede;
    }

    public void setMagsede(String magsede) {
        this.magsede = magsede;
    }

    public String getIdpaese() {
        return this.idpaese;
    }

    public void setIdpaese(String idpaese) {
        this.idpaese = idpaese;
    }

    public String getIdcodice() {
        return this.idcodice;
    }

    public void setIdcodice(String idcodice) {
        this.idcodice = idcodice;
    }

    public String getIdcedente() {
        return this.idcedente;
    }

    public void setIdcedente(String idcedente) {
        this.idcedente = idcedente;
    }

    public String getIdpv() {
        return this.idpv;
    }

    public void setIdpv(String idpv) {
        this.idpv = idpv;
    }

    public String getRagsoc() {
        return this.ragsoc;
    }

    public void setRagsoc(String ragsoc) {
        this.ragsoc = ragsoc;
    }

    public String getRagsoc2() {
        return this.ragsoc2;
    }

    public void setRagsoc2(String ragsoc2) {
        this.ragsoc2 = ragsoc2;
    }

    public String getCodfisc() {
        return this.codfisc;
    }

    public void setCodfisc(String codfisc) {
        this.codfisc = codfisc;
    }

    public String getRegfisc() {
        return this.regfisc;
    }

    public void setRegfisc(String regfisc) {
        this.regfisc = regfisc;
    }

    public String getReauff() {
        return this.reauff;
    }

    public void setReauff(String reauff) {
        this.reauff = reauff;
    }

    public String getReanum() {
        return this.reanum;
    }

    public void setReanum(String reanum) {
        this.reanum = reanum;
    }

    public BigDecimal getReacapsoc() {
        return this.reacapsoc;
    }

    public void setReacapsoc(BigDecimal reacapsoc) {
        this.reacapsoc = reacapsoc;
    }

    public String getReasu() {
        return this.reasu;
    }

    public void setReasu(String reasu) {
        this.reasu = reasu;
    }

    public String getRealiq() {
        return this.realiq;
    }

    public void setRealiq(String realiq) {
        this.realiq = realiq;
    }

    public String getSlind() {
        return this.slind;
    }

    public void setSlind(String slind) {
        this.slind = slind;
    }

    public String getSlcivico() {
        return this.slcivico;
    }

    public void setSlcivico(String slcivico) {
        this.slcivico = slcivico;
    }

    public String getSlcomune() {
        return this.slcomune;
    }

    public void setSlcomune(String slcomune) {
        this.slcomune = slcomune;
    }

    public String getSlprov() {
        return this.slprov;
    }

    public void setSlprov(String slprov) {
        this.slprov = slprov;
    }

    public String getSlcap() {
        return this.slcap;
    }

    public void setSlcap(String slcap) {
        this.slcap = slcap;
    }

    public String getSlnaz() {
        return this.slnaz;
    }

    public void setSlnaz(String slnaz) {
        this.slnaz = slnaz;
    }

    public String getSonome() {
        return this.sonome;
    }

    public void setSonome(String sonome) {
        this.sonome = sonome;
    }

    public String getSoind() {
        return this.soind;
    }

    public void setSoind(String soind) {
        this.soind = soind;
    }

    public String getSocivico() {
        return this.socivico;
    }

    public void setSocivico(String socivico) {
        this.socivico = socivico;
    }

    public String getSocomune() {
        return this.socomune;
    }

    public void setSocomune(String socomune) {
        this.socomune = socomune;
    }

    public String getSoprov() {
        return this.soprov;
    }

    public void setSoprov(String soprov) {
        this.soprov = soprov;
    }

    public String getSocap() {
        return this.socap;
    }

    public void setSocap(String socap) {
        this.socap = socap;
    }

    public String getSonaz() {
        return this.sonaz;
    }

    public void setSonaz(String sonaz) {
        this.sonaz = sonaz;
    }

    public String getNumtel() {
        return this.numtel;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }

    public String getNumcell() {
        return this.numcell;
    }

    public void setNumcell(String numcell) {
        this.numcell = numcell;
    }

    public String getNumfax() {
        return this.numfax;
    }

    public void setNumfax(String numfax) {
        this.numfax = numfax;
    }

    public String getPec() {
        return this.pec;
    }

    public void setPec(String pec) {
        this.pec = pec;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTrpaese() {
        return this.trpaese;
    }

    public void setTrpaese(String trpaese) {
        this.trpaese = trpaese;
    }

    public String getTrcodice() {
        return this.trcodice;
    }

    public void setTrcodice(String trcodice) {
        this.trcodice = trcodice;
    }

    public String getCoddest() {
        return this.coddest;
    }

    public void setCoddest(String coddest) {
        this.coddest = coddest;
    }

    public String getIban() {
        return this.iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getEsenzpa() {
        return this.esenzpa;
    }

    public void setEsenzpa(String esenzpa) {
        this.esenzpa = esenzpa;
    }

    public String getGiornilav() {
        return this.giornilav;
    }

    public void setGiornilav(String giornilav) {
        this.giornilav = giornilav;
    }

    public String getIdcontratt() {
        return this.idcontratt;
    }

    public void setIdcontratt(String idcontratt) {
        this.idcontratt = idcontratt;
    }

    public Integer getPackfat() {
        return this.packfat;
    }

    public void setPackfat(Integer packfat) {
        this.packfat = packfat;
    }

    public String getComalt() {
        return this.comalt;
    }

    public void setComalt(String comalt) {
        this.comalt = comalt;
    }

    public String getExportcon() {
        return this.exportcon;
    }

    public void setExportcon(String exportcon) {
        this.exportcon = exportcon;
    }

    public String getMailcon() {
        return this.mailcon;
    }

    public void setMailcon(String mailcon) {
        this.mailcon = mailcon;
    }

    public String getFtpsrvcon() {
        return this.ftpsrvcon;
    }

    public void setFtpsrvcon(String ftpsrvcon) {
        this.ftpsrvcon = ftpsrvcon;
    }

    public String getFtppathcon() {
        return this.ftppathcon;
    }

    public void setFtppathcon(String ftppathcon) {
        this.ftppathcon = ftppathcon;
    }

    public String getFtpusrcon() {
        return this.ftpusrcon;
    }

    public void setFtpusrcon(String ftpusrcon) {
        this.ftpusrcon = ftpusrcon;
    }

    public String getFtppwdcon() {
        return this.ftppwdcon;
    }

    public void setFtppwdcon(String ftppwdcon) {
        this.ftppwdcon = ftppwdcon;
    }

    public String getFtpportcon() {
        return this.ftpportcon;
    }

    public void setFtpportcon(String ftpportcon) {
        this.ftpportcon = ftpportcon;
    }

    public String getSftpcon() {
        return this.sftpcon;
    }

    public void setSftpcon(String sftpcon) {
        this.sftpcon = sftpcon;
    }

    public String getGdpr() {
        return this.gdpr;
    }

    public void setGdpr(String gdpr) {
        this.gdpr = gdpr;
    }

    public String getEmailsf() {
        return this.emailsf;
    }

    public void setEmailsf(String emailsf) {
        this.emailsf = emailsf;
    }

    public String getAteco() {
        return this.ateco;
    }

    public void setAteco(String ateco) {
        this.ateco = ateco;
    }

    public String getLastnot() {
        return this.lastnot;
    }

    public void setLastnot(String lastnot) {
        this.lastnot = lastnot;
    }

    public String getDataoraupd() {
        return this.dataoraupd;
    }

    public void setDataoraupd(String dataoraupd) {
        this.dataoraupd = dataoraupd;
    }
}