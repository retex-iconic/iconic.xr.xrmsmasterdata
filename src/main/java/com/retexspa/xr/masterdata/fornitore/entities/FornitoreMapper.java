package com.retexspa.xr.masterdata.fornitore.entities;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;

@Mapper
public interface FornitoreMapper {

   FornitoreMapper MAPPER = Mappers.getMapper( FornitoreMapper.class );

   @Mapping(target = "codice", source = "forcod")
   @Mapping(target = "codiceEsterno", source = "fornum")
   @Mapping(target = "ragioneSociale", source = "fornom")
   @Mapping(target = "indirizzo", source = "forind")
   @Mapping(target = "citta", source = "forcit")
   @Mapping(target = "cap", source = "forcap")
   @Mapping(target = "partitaIva", source = "forpiva")
   @Mapping(target = "codiceFiscale", source = "forcf")
   @Mapping(target = "telefono", source = "fortel")
// @Mapping(source = "giorcons", ignore = true")
// @Mapping(source = "costoper", ignore = true")
// @Mapping(source = "varfor", ignore = true")
// @Mapping(source = "autom", ignore = true")
   @Mapping(target = "rank", source = "primario")
// @Mapping(source = "cedifile", ignore = true")
// @Mapping(source = "anagra", ignore = true")
// @Mapping(source = "fattura", ignore = true")
// @Mapping(source = "codsocio", ignore = true")
// @Mapping(source = "prezzicedi", ignore = true")
// @Mapping(source = "gesrifat", ignore = true")
// @Mapping(source = "export", ignore = true")
   @Mapping(target = "tipocod", source = "tipocod")
// @Mapping(source = "fattdif", ignore = true")
// @Mapping(source = "offerte", ignore = true")
// @Mapping(source = "offfid", ignore = true")
// @Mapping(source = "costi", ignore = true")
// @Mapping(source = "rifattu", ignore = true")
// @Mapping(source = "flagdocum", ignore = true")
// @Mapping(source = "maskcodart", ignore = true")
   @Mapping(target = "email", source = "email")
// @Mapping(source = "datatype", ignore = true")
// @Mapping(source = "datafunc", ignore = true")
// @Mapping(source = "backclr", ignore = true")
// @Mapping(source = "anarif", ignore = true")
// @Mapping(source = "catrif", ignore = true")
// @Mapping(source = "fattddt", ignore = true")
// @Mapping(source = "flagfile", ignore = true")
   @Mapping(target = "codiceEsterno2", source = "forcedi")
// @Mapping(source = "monofase", ignore = true")
   @Mapping(target = "codiceContabilita", source = "codcontab")
// @Mapping(source = "fattven", ignore = true")
// @Mapping(source = "ordcolli", ignore = true")
// @Mapping(source = "doccolli", ignore = true")
// @Mapping(source = "calclist", ignore = true")
// @Mapping(source = "listini", ignore = true")
// @Mapping(source = "pagament", ignore = true")
// @Mapping(source = "codpagam", ignore = true")
// @Mapping(source = "tipopagam", ignore = true")
// @Mapping(source = "scaffale", ignore = true")
// @Mapping(source = "sendecr", ignore = true")
// @Mapping(source = "flgmobile", ignore = true")
// @Mapping(source = "ordmobile", ignore = true")
// @Mapping(source = "desmobile", ignore = true")
// @Mapping(source = "wsurl", ignore = true")
// @Mapping(source = "wsuser", ignore = true")
// @Mapping(source = "wspassword", ignore = true")
// @Mapping(source = "wssocio", ignore = true")
// @Mapping(source = "wslastanag", ignore = true")
// @Mapping(source = "wslastsud", ignore = true")
// @Mapping(source = "reparto", ignore = true")
// @Mapping(source = "classe", ignore = true")
// @Mapping(source = "eticod", ignore = true")
// @Mapping(source = "etibar", ignore = true")
   @Mapping(target = "codicePrecedenteBackOffice", source = "forbo")
// @Mapping(source = "tlcentrale", ignore = true")
// @Mapping(source = "dataoraupd", ignore = true")

   FornitoreDTO legacyToDTO(FornitoreLegacy legacy);
}
