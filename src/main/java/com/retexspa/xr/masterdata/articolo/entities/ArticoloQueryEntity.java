package com.retexspa.xr.masterdata.articolo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// import com.fasterxml.jackson.core.JsonProcessingException;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.fasterxml.jackson.databind.ObjectReader;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "articoli")
public class ArticoloQueryEntity {

    @Id
    @Column(name = "id")    
    private String id;

    @OneToMany(mappedBy = "id")
    @Column(name = "parent")   
    private String parent;

    //@Size(max = 6)
    @Column(name = "articolo", length = 6)
    private String articolo;

    //@Size(max = 30)
    @Column(name = "descriz", length = 30)
    private String descriz;

    //@Size(max = 6)
    @Column(name = "codicepri", length = 6)
    private String codicepri;

    //@Size(max = 4)
    @Column(name = "reparto", length = 4)
    private String reparto;

    //@Size(max = 2)
    @Column(name = "gruppo", length = 2)
    private String gruppo;

    //@Size(max = 1)
    @Column(name = "sospeso", length = 1)
    private String sospeso;

    @Column(name = "datins")
    private LocalDate datins;

    @Column(name = "iva")
    private Integer iva;

    //@Size(max = 24)
    @Column(name = "desbrev", length = 24)
    private String desbrev;

    //@Size(max = 2)
    @Column(name = "misura", length = 2)
    private String misura;

    @Column(name = "quantita")
    private Integer quantita;

    @Column(name = "scorta")
    private Integer scorta;

    @Column(name = "giaciniz", precision = 9, scale = 2)
    private BigDecimal giaciniz;

    @Column(name = "valiniz", precision = 12, scale = 2)
    private BigDecimal valiniz;

    @Column(name = "ricarico", precision = 5, scale = 1)
    private BigDecimal ricarico;

    @Column(name = "ricaric2", precision = 5, scale = 1)
    private BigDecimal ricaric2;

    @Column(name = "deposito")
    private Integer deposito;

    @Column(name = "scaffale", length = 4)
    private String scaffale;

    @Column(name = "supespo", precision = 7, scale = 4)
    private BigDecimal supespo;

    @Column(name = "offspec", length = 1)
    private String offspec;

    @Column(name = "datinof")
    private LocalDate datinof;

    @Column(name = "datfiof")
    private LocalDate datfiof;

    @Column(name = "proff", precision = 10, scale = 2)
    private BigDecimal proff;

    @Column(name = "primp", precision = 10, scale = 2)
    private BigDecimal primp;

    @Column(name = "mixmatch", length = 1)
    private String mixmatch;

    @Column(name = "xpery", length = 7)
    private String xpery;

    @Column(name = "datinmm")
    private LocalDate datinmm;

    @Column(name = "datfimm")
    private LocalDate datfimm;

    @Column(name = "prvend", precision = 10, scale = 2)
    private BigDecimal prvend;

    @Column(name = "prven2", precision = 10, scale = 2)
    private BigDecimal prven2;

    @Column(name = "giacenza", precision = 9, scale = 2)
    private BigDecimal giacenza;

    @Column(name = "ultforn", length = 4)
    private String ultforn;

    @Column(name = "quaacq", precision = 9, scale = 2)
    private BigDecimal quaacq;

    @Column(name = "valacq", precision = 12, scale = 2)
    private BigDecimal valacq;

    @Column(name = "quavend", precision = 9, scale = 2)
    private BigDecimal quavend;

    @Column(name = "valvend", precision = 12, scale = 2)
    private BigDecimal valvend;

    @Column(name = "datulve")
    private LocalDate datulve;

    @Column(name = "quaoff", precision = 8, scale = 2)
    private BigDecimal quaoff;

    @Column(name = "valoff", precision = 12, scale = 2)
    private BigDecimal valoff;

    @Column(name = "giorsta")
    private Integer giorsta;

    @Column(name = "gioroff")
    private Integer gioroff;

    @Column(name = "quascart", precision = 9, scale = 2)
    private BigDecimal quascart;

    @Column(name = "valscart", precision = 12, scale = 2)
    private BigDecimal valscart;

    @Column(name = "quaimpeg")
    private Integer quaimpeg;

    @Column(name = "giacmed")
    private Integer giacmed;

    @Column(name = "varprv", length = 1)
    private String varprv;

    @Column(name = "quaulve", precision = 9, scale = 2)
    private BigDecimal quaulve;

    @Column(name = "bollini")
    private Integer bollini;

    @Column(name = "pzoff")
    private Integer pzoff;

    @Column(name = "tipooff")
    private Integer tipooff;

    @Column(name = "datinv")
    private LocalDate datinv;

    @Column(name = "datvar")
    private LocalDate datvar;

    @Column(name = "datcons")
    private LocalDate datcons;

    @Column(name = "scortamax")
    private Integer scortamax;

    @Column(name = "etilay")
    private Integer etilay;

    @Column(name = "dateti")
    private LocalDate dateti;

    @Column(name = "prcons", precision = 10, scale = 2)
    private BigDecimal prcons;

    @Column(name = "diffinv", precision = 9, scale = 2)
    private BigDecimal diffinv;

    @Column(name = "produttore", length = 6)
    private String produttore;

    @Column(name = "ultprli", precision = 11, scale = 3)
    private BigDecimal ultprli;

    @Column(name = "ultprsc", precision = 10, scale = 2)
    private BigDecimal ultprsc;

    @Column(name = "ultprsi", precision = 10, scale = 2)
    private BigDecimal ultprsi;

    @Column(name = "datulacq")
    private LocalDate datulacq;

    @Column(name = "quaulacq", precision = 9, scale = 2)
    private BigDecimal quaulacq;

    @Column(name = "prsosp", precision = 10, scale = 2)
    private BigDecimal prsosp;

    @Column(name = "prpers", precision = 10, scale = 2)
    private BigDecimal prpers;

    @Column(name = "prdel", precision = 10, scale = 2)
    private BigDecimal prdel;

    @Column(name = "descedi", length = 3)
    private String descedi;

    @Column(name = "tipoart", length = 1)
    private String tipoart;

    @Column(name = "fidpromo", length = 6)
    private String fidpromo;

    @Column(name = "numeti")
    private Integer numeti;

    @Column(name = "apeso", length = 1)
    private String apeso;

    @Column(name = "tiposcar", length = 1)
    private String tiposcar;

    @Column(name = "preuro", precision = 7, scale = 2)
    private BigDecimal preuro;

    @Column(name = "datmod")
    private LocalDate datmod;

    @Column(name = "datcas")
    private LocalDate datcas;

    @Column(name = "datbil")
    private LocalDate datbil;

    @Column(name = "datgiacin")
    private LocalDate datgiacin;

    @Column(name = "qtainv", precision = 9, scale = 2)
    private BigDecimal qtainv;

    @Column(name = "scarto", precision = 5, scale = 2)
    private BigDecimal scarto;

    @Column(name = "tiposos", length = 1)
    private String tiposos;

    @Column(name = "tipopr", length = 2)
    private String tipopr;

    @Column(name = "tipopromo", length = 1)
    private String tipopromo;

    @Column(name = "tipocons", length = 2)
    private String tipocons;

    @Column(name = "datord")
    private LocalDate datord;

    @Column(name = "qtaord", precision = 8, scale = 2)
    private BigDecimal qtaord;

    @Column(name = "prord", precision = 10, scale = 2)
    private BigDecimal prord;

    @Column(name = "medvendgg", precision = 9, scale = 4)
    private BigDecimal medvendgg;

    @Column(name = "fornpri", length = 4)
    private String fornpri;

    @Column(name = "forneti", length = 4)
    private String forneti;

    @Column(name = "flgecom", length = 1)
    private String flgecom;

    @Column(name = "giacwarn", precision = 9, scale = 2)
    private BigDecimal giacwarn;

    @Column(name = "giacelim", precision = 9, scale = 2)
    private BigDecimal giacelim;

    @Column(name = "codposiz")
    private Integer codposiz;

    @Column(name = "codstag")
    private Integer codstag;

    @Column(name = "codtipo2")
    private Integer codtipo2;

    @Column(name = "subtotsc", length = 1)
    private String subtotsc;

    @Column(name = "subtotpt", length = 1)
    private String subtotpt;
    
    @Column(name = "artcedi", length = 16)
    private String artcedi;
    
    @Column(name = "artbo", length = 16)
    private String artbo;

    @Column(name = "datws")
    private LocalDate datws;

    @Column(name = "przblk", length = 1)
    private String przblk;

    @Column(name = "przimp", length = 1)
    private String przimp;

    @Column(name = "codsva", length = 6)
    private String codsva;

    @Column(name = "cluster", length = 30)
    private String cluster;

    @Column(name = "asspv", length = 1)
    private String asspv;

    @Column(name = "idsendecr", length = 8)
    private String idsendecr;
    
    @Column(name = "esllay", length = 30)
    private String esllay;
    
    @Column(name = "esllpro", length = 30)
    private String esllpro;
    
    @Column(name = "dataoraupd", length = 14)
    private String dataoraupd;

    @Column(name = "datim")
    private LocalDate datim;
    
    @Column(name = "dtetiim", length = 20)
    private String dtetiim;

    @Column(name = "usetiim", length = 50)
    private String usetiim;

    @Column(name = "origineeti", length = 1)
    private String origineeti;

    // MVP: ARTICOLO, DESCRIZ, REPARTO, IVA, MISURA, QUANTITA
    // public ArticoloQueryEntity(String articolo, String descriz, String reparto, Integer iva, String misura, Integer quantita) {
    //     this.articolo = articolo;
    //     this.descriz = descriz;
    //     this.reparto = reparto;
    //     this.iva = iva;
    //     this.misura = misura;
    //     this.quantita = quantita;
    // }

    public ArticoloQueryEntity() {
    }

    // for articolo repository:
    public ArticoloQueryEntity(String articoloId, ArticoloDTO articoloDTO) throws IOException {
        // ObjectMapper objectMapper = new ObjectMapper();
        // ObjectReader objectReader = objectMapper.readerForUpdating(this);
        // String jsonInString = objectMapper.writeValueAsString(articoloDTO);
        // Object t = objectReader.readValue(jsonInString, ArticoloQueryEntity.class);  
        // this.articolo = articolo;
        // this.descriz = articoloDTO.getDescription();
        this.id = articoloId;
        this.descriz = articoloDTO.getDescription();
        this.articolo = articoloDTO.getCode();
        this.parent = articoloDTO.getParent();
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

    public String getArticolo() {
        return this.articolo;
    }

    public void setArticolo(String articolo) {
        this.articolo = articolo;
    }

    public String getDescriz() {
        return this.descriz;
    }

    public void setDescriz(String descriz) {
        this.descriz = descriz;
    }

    public String getCodicepri() {
        return this.codicepri;
    }

    public void setCodicepri(String codicepri) {
        this.codicepri = codicepri;
    }

    public String getReparto() {
        return this.reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public String getGruppo() {
        return this.gruppo;
    }

    public void setGruppo(String gruppo) {
        this.gruppo = gruppo;
    }

    public String getSospeso() {
        return this.sospeso;
    }

    public void setSospeso(String sospeso) {
        this.sospeso = sospeso;
    }

    public LocalDate getDatins() {
        return this.datins;
    }

    public void setDatins(LocalDate datins) {
        this.datins = datins;
    }

    public Integer getIva() {
        return this.iva;
    }

    public void setIva(Integer iva) {
        this.iva = iva;
    }

    public String getDesbrev() {
        return this.desbrev;
    }

    public void setDesbrev(String desbrev) {
        this.desbrev = desbrev;
    }

    public String getMisura() {
        return this.misura;
    }

    public void setMisura(String misura) {
        this.misura = misura;
    }

    public Integer getQuantita() {
        return this.quantita;
    }

    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

    public Integer getScorta() {
        return this.scorta;
    }

    public void setScorta(Integer scorta) {
        this.scorta = scorta;
    }

    public BigDecimal getGiaciniz() {
        return this.giaciniz;
    }

    public void setGiaciniz(BigDecimal giaciniz) {
        this.giaciniz = giaciniz;
    }

    public BigDecimal getValiniz() {
        return this.valiniz;
    }

    public void setValiniz(BigDecimal valiniz) {
        this.valiniz = valiniz;
    }

    public BigDecimal getRicarico() {
        return this.ricarico;
    }

    public void setRicarico(BigDecimal ricarico) {
        this.ricarico = ricarico;
    }

    public BigDecimal getRicaric2() {
        return this.ricaric2;
    }

    public void setRicaric2(BigDecimal ricaric2) {
        this.ricaric2 = ricaric2;
    }

    public Integer getDeposito() {
        return this.deposito;
    }

    public void setDeposito(Integer deposito) {
        this.deposito = deposito;
    }

    public String getScaffale() {
        return this.scaffale;
    }

    public void setScaffale(String scaffale) {
        this.scaffale = scaffale;
    }

    public BigDecimal getSupespo() {
        return this.supespo;
    }

    public void setSupespo(BigDecimal supespo) {
        this.supespo = supespo;
    }

    public String getOffspec() {
        return this.offspec;
    }

    public void setOffspec(String offspec) {
        this.offspec = offspec;
    }

    public LocalDate getDatinof() {
        return this.datinof;
    }

    public void setDatinof(LocalDate datinof) {
        this.datinof = datinof;
    }

    public LocalDate getDatfiof() {
        return this.datfiof;
    }

    public void setDatfiof(LocalDate datfiof) {
        this.datfiof = datfiof;
    }

    public BigDecimal getProff() {
        return this.proff;
    }

    public void setProff(BigDecimal proff) {
        this.proff = proff;
    }

    public BigDecimal getPrimp() {
        return this.primp;
    }

    public void setPrimp(BigDecimal primp) {
        this.primp = primp;
    }

    public String getMixmatch() {
        return this.mixmatch;
    }

    public void setMixmatch(String mixmatch) {
        this.mixmatch = mixmatch;
    }

    public String getXpery() {
        return this.xpery;
    }

    public void setXpery(String xpery) {
        this.xpery = xpery;
    }

    public LocalDate getDatinmm() {
        return this.datinmm;
    }

    public void setDatinmm(LocalDate datinmm) {
        this.datinmm = datinmm;
    }

    public LocalDate getDatfimm() {
        return this.datfimm;
    }

    public void setDatfimm(LocalDate datfimm) {
        this.datfimm = datfimm;
    }

    public BigDecimal getPrvend() {
        return this.prvend;
    }

    public void setPrvend(BigDecimal prvend) {
        this.prvend = prvend;
    }

    public BigDecimal getPrven2() {
        return this.prven2;
    }

    public void setPrven2(BigDecimal prven2) {
        this.prven2 = prven2;
    }

    public BigDecimal getGiacenza() {
        return this.giacenza;
    }

    public void setGiacenza(BigDecimal giacenza) {
        this.giacenza = giacenza;
    }

    public String getUltforn() {
        return this.ultforn;
    }

    public void setUltforn(String ultforn) {
        this.ultforn = ultforn;
    }

    public BigDecimal getQuaacq() {
        return this.quaacq;
    }

    public void setQuaacq(BigDecimal quaacq) {
        this.quaacq = quaacq;
    }

    public BigDecimal getValacq() {
        return this.valacq;
    }

    public void setValacq(BigDecimal valacq) {
        this.valacq = valacq;
    }

    public BigDecimal getQuavend() {
        return this.quavend;
    }

    public void setQuavend(BigDecimal quavend) {
        this.quavend = quavend;
    }

    public BigDecimal getValvend() {
        return this.valvend;
    }

    public void setValvend(BigDecimal valvend) {
        this.valvend = valvend;
    }

    public LocalDate getDatulve() {
        return this.datulve;
    }

    public void setDatulve(LocalDate datulve) {
        this.datulve = datulve;
    }

    public BigDecimal getQuaoff() {
        return this.quaoff;
    }

    public void setQuaoff(BigDecimal quaoff) {
        this.quaoff = quaoff;
    }

    public BigDecimal getValoff() {
        return this.valoff;
    }

    public void setValoff(BigDecimal valoff) {
        this.valoff = valoff;
    }

    public Integer getGiorsta() {
        return this.giorsta;
    }

    public void setGiorsta(Integer giorsta) {
        this.giorsta = giorsta;
    }

    public Integer getGioroff() {
        return this.gioroff;
    }

    public void setGioroff(Integer gioroff) {
        this.gioroff = gioroff;
    }

    public BigDecimal getQuascart() {
        return this.quascart;
    }

    public void setQuascart(BigDecimal quascart) {
        this.quascart = quascart;
    }

    public BigDecimal getValscart() {
        return this.valscart;
    }

    public void setValscart(BigDecimal valscart) {
        this.valscart = valscart;
    }

    public Integer getQuaimpeg() {
        return this.quaimpeg;
    }

    public void setQuaimpeg(Integer quaimpeg) {
        this.quaimpeg = quaimpeg;
    }

    public Integer getGiacmed() {
        return this.giacmed;
    }

    public void setGiacmed(Integer giacmed) {
        this.giacmed = giacmed;
    }

    public String getVarprv() {
        return this.varprv;
    }

    public void setVarprv(String varprv) {
        this.varprv = varprv;
    }

    public BigDecimal getQuaulve() {
        return this.quaulve;
    }

    public void setQuaulve(BigDecimal quaulve) {
        this.quaulve = quaulve;
    }

    public Integer getBollini() {
        return this.bollini;
    }

    public void setBollini(Integer bollini) {
        this.bollini = bollini;
    }

    public Integer getPzoff() {
        return this.pzoff;
    }

    public void setPzoff(Integer pzoff) {
        this.pzoff = pzoff;
    }

    public Integer getTipooff() {
        return this.tipooff;
    }

    public void setTipooff(Integer tipooff) {
        this.tipooff = tipooff;
    }

    public LocalDate getDatinv() {
        return this.datinv;
    }

    public void setDatinv(LocalDate datinv) {
        this.datinv = datinv;
    }

    public LocalDate getDatvar() {
        return this.datvar;
    }

    public void setDatvar(LocalDate datvar) {
        this.datvar = datvar;
    }

    public LocalDate getDatcons() {
        return this.datcons;
    }

    public void setDatcons(LocalDate datcons) {
        this.datcons = datcons;
    }

    public Integer getScortamax() {
        return this.scortamax;
    }

    public void setScortamax(Integer scortamax) {
        this.scortamax = scortamax;
    }

    public Integer getEtilay() {
        return this.etilay;
    }

    public void setEtilay(Integer etilay) {
        this.etilay = etilay;
    }

    public LocalDate getDateti() {
        return this.dateti;
    }

    public void setDateti(LocalDate dateti) {
        this.dateti = dateti;
    }

    public BigDecimal getPrcons() {
        return this.prcons;
    }

    public void setPrcons(BigDecimal prcons) {
        this.prcons = prcons;
    }

    public BigDecimal getDiffinv() {
        return this.diffinv;
    }

    public void setDiffinv(BigDecimal diffinv) {
        this.diffinv = diffinv;
    }

    public String getProduttore() {
        return this.produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public BigDecimal getUltprli() {
        return this.ultprli;
    }

    public void setUltprli(BigDecimal ultprli) {
        this.ultprli = ultprli;
    }

    public BigDecimal getUltprsc() {
        return this.ultprsc;
    }

    public void setUltprsc(BigDecimal ultprsc) {
        this.ultprsc = ultprsc;
    }

    public BigDecimal getUltprsi() {
        return this.ultprsi;
    }

    public void setUltprsi(BigDecimal ultprsi) {
        this.ultprsi = ultprsi;
    }

    public LocalDate getDatulacq() {
        return this.datulacq;
    }

    public void setDatulacq(LocalDate datulacq) {
        this.datulacq = datulacq;
    }

    public BigDecimal getQuaulacq() {
        return this.quaulacq;
    }

    public void setQuaulacq(BigDecimal quaulacq) {
        this.quaulacq = quaulacq;
    }

    public BigDecimal getPrsosp() {
        return this.prsosp;
    }

    public void setPrsosp(BigDecimal prsosp) {
        this.prsosp = prsosp;
    }

    public BigDecimal getPrpers() {
        return this.prpers;
    }

    public void setPrpers(BigDecimal prpers) {
        this.prpers = prpers;
    }

    public BigDecimal getPrdel() {
        return this.prdel;
    }

    public void setPrdel(BigDecimal prdel) {
        this.prdel = prdel;
    }

    public String getDescedi() {
        return this.descedi;
    }

    public void setDescedi(String descedi) {
        this.descedi = descedi;
    }

    public String getTipoart() {
        return this.tipoart;
    }

    public void setTipoart(String tipoart) {
        this.tipoart = tipoart;
    }

    public String getFidpromo() {
        return this.fidpromo;
    }

    public void setFidpromo(String fidpromo) {
        this.fidpromo = fidpromo;
    }

    public Integer getNumeti() {
        return this.numeti;
    }

    public void setNumeti(Integer numeti) {
        this.numeti = numeti;
    }

    public String getApeso() {
        return this.apeso;
    }

    public void setApeso(String apeso) {
        this.apeso = apeso;
    }

    public String getTiposcar() {
        return this.tiposcar;
    }

    public void setTiposcar(String tiposcar) {
        this.tiposcar = tiposcar;
    }

    public BigDecimal getPreuro() {
        return this.preuro;
    }

    public void setPreuro(BigDecimal preuro) {
        this.preuro = preuro;
    }

    public LocalDate getDatmod() {
        return this.datmod;
    }

    public void setDatmod(LocalDate datmod) {
        this.datmod = datmod;
    }

    public LocalDate getDatcas() {
        return this.datcas;
    }

    public void setDatcas(LocalDate datcas) {
        this.datcas = datcas;
    }

    public LocalDate getDatbil() {
        return this.datbil;
    }

    public void setDatbil(LocalDate datbil) {
        this.datbil = datbil;
    }

    public LocalDate getDatgiacin() {
        return this.datgiacin;
    }

    public void setDatgiacin(LocalDate datgiacin) {
        this.datgiacin = datgiacin;
    }

    public BigDecimal getQtainv() {
        return this.qtainv;
    }

    public void setQtainv(BigDecimal qtainv) {
        this.qtainv = qtainv;
    }

    public BigDecimal getScarto() {
        return this.scarto;
    }

    public void setScarto(BigDecimal scarto) {
        this.scarto = scarto;
    }

    public String getTiposos() {
        return this.tiposos;
    }

    public void setTiposos(String tiposos) {
        this.tiposos = tiposos;
    }

    public String getTipopr() {
        return this.tipopr;
    }

    public void setTipopr(String tipopr) {
        this.tipopr = tipopr;
    }

    public String getTipopromo() {
        return this.tipopromo;
    }

    public void setTipopromo(String tipopromo) {
        this.tipopromo = tipopromo;
    }

    public String getTipocons() {
        return this.tipocons;
    }

    public void setTipocons(String tipocons) {
        this.tipocons = tipocons;
    }

    public LocalDate getDatord() {
        return this.datord;
    }

    public void setDatord(LocalDate datord) {
        this.datord = datord;
    }

    public BigDecimal getQtaord() {
        return this.qtaord;
    }

    public void setQtaord(BigDecimal qtaord) {
        this.qtaord = qtaord;
    }

    public BigDecimal getPrord() {
        return this.prord;
    }

    public void setPrord(BigDecimal prord) {
        this.prord = prord;
    }

    public BigDecimal getMedvendgg() {
        return this.medvendgg;
    }

    public void setMedvendgg(BigDecimal medvendgg) {
        this.medvendgg = medvendgg;
    }

    public String getFornpri() {
        return this.fornpri;
    }

    public void setFornpri(String fornpri) {
        this.fornpri = fornpri;
    }

    public String getForneti() {
        return this.forneti;
    }

    public void setForneti(String forneti) {
        this.forneti = forneti;
    }

    public String getFlgecom() {
        return this.flgecom;
    }

    public void setFlgecom(String flgecom) {
        this.flgecom = flgecom;
    }

    public BigDecimal getGiacwarn() {
        return this.giacwarn;
    }

    public void setGiacwarn(BigDecimal giacwarn) {
        this.giacwarn = giacwarn;
    }

    public BigDecimal getGiacelim() {
        return this.giacelim;
    }

    public void setGiacelim(BigDecimal giacelim) {
        this.giacelim = giacelim;
    }

    public Integer getCodposiz() {
        return this.codposiz;
    }

    public void setCodposiz(Integer codposiz) {
        this.codposiz = codposiz;
    }

    public Integer getCodstag() {
        return this.codstag;
    }

    public void setCodstag(Integer codstag) {
        this.codstag = codstag;
    }

    public Integer getCodtipo2() {
        return this.codtipo2;
    }

    public void setCodtipo2(Integer codtipo2) {
        this.codtipo2 = codtipo2;
    }

    public String getSubtotsc() {
        return this.subtotsc;
    }

    public void setSubtotsc(String subtotsc) {
        this.subtotsc = subtotsc;
    }

    public String getSubtotpt() {
        return this.subtotpt;
    }

    public void setSubtotpt(String subtotpt) {
        this.subtotpt = subtotpt;
    }

    public String getArtcedi() {
        return this.artcedi;
    }

    public void setArtcedi(String artcedi) {
        this.artcedi = artcedi;
    }

    public String getArtbo() {
        return this.artbo;
    }

    public void setArtbo(String artbo) {
        this.artbo = artbo;
    }

    public LocalDate getDatws() {
        return this.datws;
    }

    public void setDatws(LocalDate datws) {
        this.datws = datws;
    }

    public String getPrzblk() {
        return this.przblk;
    }

    public void setPrzblk(String przblk) {
        this.przblk = przblk;
    }

    public String getPrzimp() {
        return this.przimp;
    }

    public void setPrzimp(String przimp) {
        this.przimp = przimp;
    }

    public String getCodsva() {
        return this.codsva;
    }

    public void setCodsva(String codsva) {
        this.codsva = codsva;
    }

    public String getCluster() {
        return this.cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public String getAsspv() {
        return this.asspv;
    }

    public void setAsspv(String asspv) {
        this.asspv = asspv;
    }

    public String getIdsendecr() {
        return this.idsendecr;
    }

    public void setIdsendecr(String idsendecr) {
        this.idsendecr = idsendecr;
    }

    public String getEsllay() {
        return this.esllay;
    }

    public void setEsllay(String esllay) {
        this.esllay = esllay;
    }

    public String getEsllpro() {
        return this.esllpro;
    }

    public void setEsllpro(String esllpro) {
        this.esllpro = esllpro;
    }

    public String getDataoraupd() {
        return this.dataoraupd;
    }

    public void setDataoraupd(String dataoraupd) {
        this.dataoraupd = dataoraupd;
    }

    public LocalDate getDatim() {
        return this.datim;
    }

    public void setDatim(LocalDate datim) {
        this.datim = datim;
    }

    public String getDtetiim() {
        return this.dtetiim;
    }

    public void setDtetiim(String dtetiim) {
        this.dtetiim = dtetiim;
    }

    public String getUsetiim() {
        return this.usetiim;
    }

    public void setUsetiim(String usetiim) {
        this.usetiim = usetiim;
    }

    public String getOrigineeti() {
        return this.origineeti;
    }

    public void setOrigineeti(String origineeti) {
        this.origineeti = origineeti;
    }

}
