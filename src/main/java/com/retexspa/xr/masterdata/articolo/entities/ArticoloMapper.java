package com.retexspa.xr.masterdata.articolo.entities;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;

/* 

Create all the target properties in ArticoloDTO and ArticoloQueryEntity

 only fields with block comment as prefix  are required 

 */

@Mapper
public interface ArticoloMapper {

   ArticoloMapper MAPPER = Mappers.getMapper( ArticoloMapper.class );

   @Mapping(target = "codice2", source = "articolo")

// @Mapping(source = "codicepri", ignore = true")

   @Mapping(target = "reparto", source = "reparto")
   @Mapping(target = "gruppo", source = "gruppo")

// @Mapping(source = "sospeso", ignore = true")
// @Mapping(source = "datins", ignore = true")
// @Mapping(source = "iva", ignore = true")

//* */ @Mapping(target = "descrizione", source = "descriz")
//* */ @Mapping(target = "descrizioneBreve", source = "desbrev")
//* */ @Mapping(target = "unitaDiMisura", source = "misura")
//* */ @Mapping(target = "quantita", source = "quantita")
//* */ @Mapping(target = "scortaMinima", source = "scorta")

// @Mapping(source = "giaciniz", ignore = true")
// @Mapping(source = "valiniz", ignore = true")
// @Mapping(source = "ricarico", ignore = true")
// @Mapping(source = "ricaric2", ignore = true")

//* */ @Mapping(target = "deposito", source = "deposito")
//* */ @Mapping(target = "scaffale", source = "scaffale")
//* */ @Mapping(target = "superficieEspositiva", source = "supespo")

// @Mapping(source = "offspec", ignore = true")
// @Mapping(source = "datinof", ignore = true")
// @Mapping(source = "datfiof", ignore = true")
// @Mapping(source = "proff", ignore = true")
// @Mapping(source = "primp", ignore = true")
// @Mapping(source = "mixmatch", ignore = true")
// @Mapping(source = "xpery", ignore = true")
// @Mapping(source = "datinmm", ignore = true")
// @Mapping(source = "datfimm", ignore = true")
// @Mapping(source = "prvend", ignore = true")
// @Mapping(source = "prven2", ignore = true")
// @Mapping(source = "giacenza", ignore = true")
// @Mapping(source = "ultforn", ignore = true")
// @Mapping(source = "quaacq", ignore = true")
// @Mapping(source = "valacq", ignore = true")
// @Mapping(source = "quavend", ignore = true")
// @Mapping(source = "valvend", ignore = true")
// @Mapping(source = "datulve", ignore = true")
// @Mapping(source = "quaoff", ignore = true")
// @Mapping(source = "valoff", ignore = true")
// @Mapping(source = "giorsta", ignore = true")
// @Mapping(source = "gioroff", ignore = true")
// @Mapping(source = "quascart", ignore = true")
// @Mapping(source = "valscart", ignore = true")

//* */ @Mapping(target = "quantitaImpegnata", source = "quaimpeg")

// @Mapping(source = "giacmed", ignore = true")
// @Mapping(source = "varprv", ignore = true")
// @Mapping(source = "quaulve", ignore = true")
// @Mapping(source = "bollini", ignore = true")
// @Mapping(source = "pzoff", ignore = true")
// @Mapping(source = "tipooff", ignore = true")
// @Mapping(source = "datinv", ignore = true")
// @Mapping(source = "datvar", ignore = true")
// @Mapping(source = "datcons", ignore = true")

//* */ @Mapping(target = "scortaMassima", source = "scortamax")
//* */ @Mapping(target = "layoutEtichetta", source = "etilay")

// @Mapping(source = "dateti", ignore = true")
// @Mapping(source = "prcons", ignore = true")
// @Mapping(source = "diffinv", ignore = true")

   @Mapping(target = "produttore", source = "produttore")

// @Mapping(source = "ultprli", ignore = true")
// @Mapping(source = "ultprsc", ignore = true")
// @Mapping(source = "ultprsi", ignore = true")
// @Mapping(source = "datulacq", ignore = true")
// @Mapping(source = "quaulacq", ignore = true")
// @Mapping(source = "prsosp", ignore = true")
// @Mapping(source = "prpers", ignore = true")
// @Mapping(source = "prdel", ignore = true")
// @Mapping(source = "descedi", ignore = true")

//* */ @Mapping(target = "tipoProdotto", source = "tipoart")

// @Mapping(source = "fidpromo", ignore = true")

//* */ @Mapping(target = "numeroEtichette", source = "numeti")

// @Mapping(source = "apeso", ignore = true")

//* */ @Mapping(target = "tipoScaricoVenduto", source = "tiposcar")

// @Mapping(source = "preuro", ignore = true")
// @Mapping(source = "datmod", ignore = true")
// @Mapping(source = "datcas", ignore = true")
// @Mapping(source = "datbil", ignore = true")
// @Mapping(source = "datgiacin", ignore = true")
// @Mapping(source = "qtainv", ignore = true")
// @Mapping(source = "scarto", ignore = true")
// @Mapping(source = "tiposos", ignore = true")
// @Mapping(source = "tipopr", ignore = true")
// @Mapping(source = "tipopromo", ignore = true")
// @Mapping(source = "tipocons", ignore = true")
// @Mapping(source = "datord", ignore = true")
// @Mapping(source = "qtaord", ignore = true")
// @Mapping(source = "prord", ignore = true")
// @Mapping(source = "medvendgg", ignore = true")

//* */ @Mapping(target = "fornitorePrimario", source = "fornpri")
//* */ @Mapping(target = "fornitoreEtichetta", source = "forneti")

// @Mapping(source = "flgecom", ignore = true")
// @Mapping(source = "giacwarn", ignore = true")
// @Mapping(source = "giacelim", ignore = true")

//* */ @Mapping(target = "posizionamento", source = "codposiz")
//* */ @Mapping(target = "stagionalita", source = "codstag")
//* */ @Mapping(target = "tipoProdotto2", source = "codtipo2")

// @Mapping(source = "subtotsc", ignore = true")
// @Mapping(source = "subtotpt", ignore = true")

//* */ @Mapping(target = "codice", source = "artcedi")

// @Mapping(source = "artbo", ignore = true")
// @Mapping(source = "datws", ignore = true")
// @Mapping(source = "przblk", ignore = true")
// @Mapping(source = "przimp", ignore = true")

//* */ @Mapping(target = "svalorizzazione", source = "codsva")
//* */ @Mapping(target = "cluster", source = "cluster")
//* */ @Mapping(target = "assortimentoPuntoVendita", source = "asspv")

// @Mapping(source = "idsendecr", ignore = true")

//* */ @Mapping(target = "layoutESL", source = "esllay")

// @Mapping(source = "esllpro", ignore = true")
// @Mapping(source = "dataoraupd", ignore = true")
// @Mapping(source = "datim", ignore = true")
// @Mapping(source = "dtetiim", ignore = true")
// @Mapping(source = "usetiim", ignore = true")
// @Mapping(source = "origineeti", ignore = true")

   ArticoloDTO legacyToDTO(ArticoloLegacy legacy);
}
