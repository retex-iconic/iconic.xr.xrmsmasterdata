package com.retexspa.xr.masterdata.fornitore.entities;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fornitori")
public class FornitoreLegacy {

   @Column(name = "parent")
   private String parent;

   @Column(name = "forcod", length = 4)
   private String forcod;

   @Column(name = "fornum", length = 6)
   private String fornum;

   @Column(name = "fornom", length = 30)
   private String fornom;

   @Column(name = "forind", length = 30)
   private String forind;

   @Column(name = "forcit", length = 30)
   private String forcit;

   @Column(name = "forcap", length = 5)
   private String forcap;

   @Column(name = "forpiva", length = 11)
   private String forpiva;

   @Column(name = "forcf", length = 16)
   private String forcf;

   @Column(name = "fortel", length = 12)
   private String fortel;

   @Column(name = "giorcons")
   private Integer giorcons;

   @Column(name = "costoper", precision = 4, scale = 1)
   private BigDecimal costoper;

   @Column(name = "varfor", length = 1)
   private String varfor;

   @Column(name = "primario", length = 4)
   private String primario;

   @Column(name = "anagra", length = 50)
   private String anagra;

   @Column(name = "fattura", length = 50)
   private String fattura;

   @Column(name = "codsocio", length = 6)
   private String codsocio;

   @Column(name = "prezzicedi")
   private Integer prezzicedi;

   @Column(name = "gesrifat", length = 1)
   private String gesrifat;

   @Column(name = "tipocod", length = 1)
   private String tipocod;

   @Column(name = "fattdif", length = 50)
   private String fattdif;

   @Column(name = "offerte", length = 50)
   private String offerte;

   @Column(name = "offfid", length = 50)
   private String offfid;

   @Column(name = "costi", length = 50)
   private String costi;

   @Column(name = "rifattu", length = 50)
   private String rifattu;

   @Column(name = "flagdocum", length = 12)
   private String flagdocum;

   @Column(name = "maskcodart", length = 20)
   private String maskcodart;

   @Column(name = "email", length = 60)
   private String email;

   @Column(name = "datatype", length = 4)
   private String datatype;

   @Column(name = "datafunc", length = 8)
   private String datafunc;

   @Column(name = "backclr", length = 16)
   private String backclr;

   @Column(name = "anarif", length = 50)
   private String anarif;

   @Column(name = "catrif", length = 50)
   private String catrif;

   @Column(name = "fattddt", length = 50)
   private String fattddt;

   @Column(name = "flagfile", length = 16)
   private String flagfile;

   @Column(name = "forcedi", length = 16)
   private String forcedi;

   @Column(name = "monofase", length = 1)
   private String monofase;

   @Column(name = "codcontab", length = 12)
   private String codcontab;

   @Column(name = "fattven", length = 50)
   private String fattven;

   @Column(name = "ordcolli", length = 1)
   private String ordcolli;

   @Column(name = "doccolli", length = 1)
   private String doccolli;

   @Column(name = "calclist", length = 1)
   private String calclist;

   @Column(name = "listini", length = 1)
   private String listini;

   @Column(name = "pagament", length = 30)
   private String pagament;

   @Column(name = "codpagam", length = 3)
   private String codpagam;

   @Column(name = "tipopagam", length = 2)
   private String tipopagam;

   @Column(name = "scaffale", length = 4)
   private String scaffale;

   @Column(name = "sendecr", length = 1)
   private String sendecr;

   @Column(name = "ordmobile", length = 2)
   private String ordmobile;

   @Column(name = "desmobile", length = 30)
   private String desmobile;

   @Column(name = "wsurl", length = 100)
   private String wsurl;

   @Column(name = "wsuser", length = 24)
   private String wsuser;

   @Column(name = "wspassword", length = 24)
   private String wspassword;

   @Column(name = "wssocio", length = 6)
   private String wssocio;

   @Column(name = "wslastanag", length = 14)
   private String wslastanag;

   @Column(name = "wslastsud", length = 14)
   private String wslastsud;

   @Column(name = "reparto", length = 4)
   private String reparto;

   @Column(name = "classe", length = 4)
   private String classe;

   @Column(name = "eticod", length = 12)
   private String eticod;

   @Column(name = "etibar", length = 2)
   private String etibar;

   @Column(name = "forbo", length = 16)
   private String forbo;

   @Column(name = "dataoraupd", length = 14)
   private String dataoraupd;

   public String getForcod() {
      return this.forcod;
   }

   public void setForcod(String forcod) {
      this.forcod = forcod;
   }

   public String getFornum() {
      return this.fornum;
   }

   public void setFornum(String fornum) {
      this.fornum = fornum;
   }

   public String getFornom() {
      return this.fornom;
   }

   public void setFornom(String fornom) {
      this.fornom = fornom;
   }

   public String getForind() {
      return this.forind;
   }

   public void setForind(String forind) {
      this.forind = forind;
   }

   public String getForcit() {
      return this.forcit;
   }

   public void setForcit(String forcit) {
      this.forcit = forcit;
   }

   public String getForcap() {
      return this.forcap;
   }

   public void setForcap(String forcap) {
      this.forcap = forcap;
   }

   public String getForpiva() {
      return this.forpiva;
   }

   public void setForpiva(String forpiva) {
      this.forpiva = forpiva;
   }

   public String getForcf() {
      return this.forcf;
   }

   public void setForcf(String forcf) {
      this.forcf = forcf;
   }

   public String getFortel() {
      return this.fortel;
   }

   public void setFortel(String fortel) {
      this.fortel = fortel;
   }

   public Integer getGiorcons() {
      return this.giorcons;
   }

   public void setGiorcons(Integer giorcons) {
      this.giorcons = giorcons;
   }

   public BigDecimal getCostoper() {
      return this.costoper;
   }

   public void setCostoper(BigDecimal costoper) {
      this.costoper = costoper;
   }

   public String getVarfor() {
      return this.varfor;
   }

   public void setVarfor(String varfor) {
      this.varfor = varfor;
   }

   public String getPrimario() {
      return this.primario;
   }

   public void setPrimario(String primario) {
      this.primario = primario;
   }

   public String getAnagra() {
      return this.anagra;
   }

   public void setAnagra(String anagra) {
      this.anagra = anagra;
   }

   public String getFattura() {
      return this.fattura;
   }

   public void setFattura(String fattura) {
      this.fattura = fattura;
   }

   public String getCodsocio() {
      return this.codsocio;
   }

   public void setCodsocio(String codsocio) {
      this.codsocio = codsocio;
   }

   public Integer getPrezzicedi() {
      return this.prezzicedi;
   }

   public void setPrezzicedi(Integer prezzicedi) {
      this.prezzicedi = prezzicedi;
   }

   public String getGesrifat() {
      return this.gesrifat;
   }

   public void setGesrifat(String gesrifat) {
      this.gesrifat = gesrifat;
   }

   public String getTipocod() {
      return this.tipocod;
   }

   public void setTipocod(String tipocod) {
      this.tipocod = tipocod;
   }

   public String getFattdif() {
      return this.fattdif;
   }

   public void setFattdif(String fattdif) {
      this.fattdif = fattdif;
   }

   public String getOfferte() {
      return this.offerte;
   }

   public void setOfferte(String offerte) {
      this.offerte = offerte;
   }

   public String getOfffid() {
      return this.offfid;
   }

   public void setOfffid(String offfid) {
      this.offfid = offfid;
   }

   public String getCosti() {
      return this.costi;
   }

   public void setCosti(String costi) {
      this.costi = costi;
   }

   public String getRifattu() {
      return this.rifattu;
   }

   public void setRifattu(String rifattu) {
      this.rifattu = rifattu;
   }

   public String getFlagdocum() {
      return this.flagdocum;
   }

   public void setFlagdocum(String flagdocum) {
      this.flagdocum = flagdocum;
   }

   public String getMaskcodart() {
      return this.maskcodart;
   }

   public void setMaskcodart(String maskcodart) {
      this.maskcodart = maskcodart;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getDatatype() {
      return this.datatype;
   }

   public void setDatatype(String datatype) {
      this.datatype = datatype;
   }

   public String getDatafunc() {
      return this.datafunc;
   }

   public void setDatafunc(String datafunc) {
      this.datafunc = datafunc;
   }

   public String getBackclr() {
      return this.backclr;
   }

   public void setBackclr(String backclr) {
      this.backclr = backclr;
   }

   public String getAnarif() {
      return this.anarif;
   }

   public void setAnarif(String anarif) {
      this.anarif = anarif;
   }

   public String getCatrif() {
      return this.catrif;
   }

   public void setCatrif(String catrif) {
      this.catrif = catrif;
   }

   public String getFattddt() {
      return this.fattddt;
   }

   public void setFattddt(String fattddt) {
      this.fattddt = fattddt;
   }

   public String getFlagfile() {
      return this.flagfile;
   }

   public void setFlagfile(String flagfile) {
      this.flagfile = flagfile;
   }

   public String getForcedi() {
      return this.forcedi;
   }

   public void setForcedi(String forcedi) {
      this.forcedi = forcedi;
   }

   public String getMonofase() {
      return this.monofase;
   }

   public void setMonofase(String monofase) {
      this.monofase = monofase;
   }

   public String getCodcontab() {
      return this.codcontab;
   }

   public void setCodcontab(String codcontab) {
      this.codcontab = codcontab;
   }

   public String getFattven() {
      return this.fattven;
   }

   public void setFattven(String fattven) {
      this.fattven = fattven;
   }

   public String getOrdcolli() {
      return this.ordcolli;
   }

   public void setOrdcolli(String ordcolli) {
      this.ordcolli = ordcolli;
   }

   public String getDoccolli() {
      return this.doccolli;
   }

   public void setDoccolli(String doccolli) {
      this.doccolli = doccolli;
   }

   public String getCalclist() {
      return this.calclist;
   }

   public void setCalclist(String calclist) {
      this.calclist = calclist;
   }

   public String getListini() {
      return this.listini;
   }

   public void setListini(String listini) {
      this.listini = listini;
   }

   public String getPagament() {
      return this.pagament;
   }

   public void setPagament(String pagament) {
      this.pagament = pagament;
   }

   public String getCodpagam() {
      return this.codpagam;
   }

   public void setCodpagam(String codpagam) {
      this.codpagam = codpagam;
   }

   public String getTipopagam() {
      return this.tipopagam;
   }

   public void setTipopagam(String tipopagam) {
      this.tipopagam = tipopagam;
   }

   public String getScaffale() {
      return this.scaffale;
   }

   public void setScaffale(String scaffale) {
      this.scaffale = scaffale;
   }

   public String getSendecr() {
      return this.sendecr;
   }

   public void setSendecr(String sendecr) {
      this.sendecr = sendecr;
   }

   public String getOrdmobile() {
      return this.ordmobile;
   }

   public void setOrdmobile(String ordmobile) {
      this.ordmobile = ordmobile;
   }

   public String getDesmobile() {
      return this.desmobile;
   }

   public void setDesmobile(String desmobile) {
      this.desmobile = desmobile;
   }

   public String getWsurl() {
      return this.wsurl;
   }

   public void setWsurl(String wsurl) {
      this.wsurl = wsurl;
   }

   public String getWsuser() {
      return this.wsuser;
   }

   public void setWsuser(String wsuser) {
      this.wsuser = wsuser;
   }

   public String getWspassword() {
      return this.wspassword;
   }

   public void setWspassword(String wspassword) {
      this.wspassword = wspassword;
   }

   public String getWssocio() {
      return this.wssocio;
   }

   public void setWssocio(String wssocio) {
      this.wssocio = wssocio;
   }

   public String getWslastanag() {
      return this.wslastanag;
   }

   public void setWslastanag(String wslastanag) {
      this.wslastanag = wslastanag;
   }

   public String getWslastsud() {
      return this.wslastsud;
   }

   public void setWslastsud(String wslastsud) {
      this.wslastsud = wslastsud;
   }

   public String getReparto() {
      return this.reparto;
   }

   public void setReparto(String reparto) {
      this.reparto = reparto;
   }

   public String getClasse() {
      return this.classe;
   }

   public void setClasse(String classe) {
      this.classe = classe;
   }

   public String getEticod() {
      return this.eticod;
   }

   public void setEticod(String eticod) {
      this.eticod = eticod;
   }

   public String getEtibar() {
      return this.etibar;
   }

   public void setEtibar(String etibar) {
      this.etibar = etibar;
   }

   public String getForbo() {
      return this.forbo;
   }

   public void setForbo(String forbo) {
      this.forbo = forbo;
   }

   public String getDataoraupd() {
      return this.dataoraupd;
   }

   public void setDataoraupd(String dataoraupd) {
      this.dataoraupd = dataoraupd;
   }

}
