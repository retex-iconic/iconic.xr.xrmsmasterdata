package com.retexspa.xr.masterdata.negozio.entities;

import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NegozioMapper {

  NegozioMapper MAPPER = Mappers.getMapper(NegozioMapper.class);

  @Mapping(target = "magazzino", source = "magazzino")
  @Mapping(target = "differenzialePartitaIVA", source = "magsede")
  @Mapping(target = "nazionePartitaIVA", source = "idpaese")
  @Mapping(target = "partitaIVA", source = "idcodice")
  // @Mapping(source = "idcedente", ignore = true")
  // @Mapping(source = "idpv", ignore = true")
  @Mapping(target = "ragioneSociale", expression = "java(legacy.getRagsoc()+ ' ' + legacy.getRagsoc2())")
  // @Mapping(source = "ragsoc2", ignore = true")
  @Mapping(target = "codiceFiscale", source = "codfisc")
  @Mapping(target = "regimeFiscale", source = "regfisc")
  @Mapping(target = "reaUfficio", source = "reauff")
  @Mapping(target = "reaNumero", source = "reanum")
  @Mapping(target = "reaCapitaleSociale", source = "reacapsoc")
  @Mapping(target = "reaSocioUnico", source = "reasu")
  @Mapping(target = "reaLiquidazione", source = "realiq")
  @Mapping(target = "sedeLegaleIndirizzo", source = "slind")
  @Mapping(target = "sedeLegaleNumeroCivico", source = "slcivico")
  @Mapping(target = "sedeLegaleComune", source = "slcomune")
  @Mapping(target = "sedeLegaleProvincia", source = "slprov")
  @Mapping(target = "sedeLegaleCAP", source = "slcap")
  @Mapping(target = "sedeLegaleNazione", source = "slnaz")
  @Mapping(target = "sedeOperativaNome", source = "sonome")
  @Mapping(target = "sedeOperativaIndirizzo", source = "soind")
  @Mapping(target = "sedeOperativaNumeroCivico", source = "socivico")
  @Mapping(target = "sedeOperativaComune", source = "socomune")
  @Mapping(target = "sedeOperativaProvincia", source = "soprov")
  @Mapping(target = "sedeOperativaCAP", source = "socap")
  @Mapping(target = "sedeOperativaNazione", source = "sonaz")
  @Mapping(target = "telefono", source = "numtel")
  @Mapping(target = "cellulare", source = "numcell")
  @Mapping(target = "fax", source = "numfax")
  @Mapping(target = "pec", source = "pec")
  @Mapping(target = "email", source = "email")
  @Mapping(target = "nazioneTrasmittente", source = "trpaese")
  @Mapping(target = "partitaIvaTrasmittente", source = "trcodice")
  @Mapping(target = "codiceDestinatarioSDI", source = "coddest")
  @Mapping(target = "iban", source = "iban")
  // @Mapping(source = "esenzpa", ignore = true")
  // @Mapping(source = "giornilav", ignore = true")
  // @Mapping(source = "idcontratt", ignore = true")
  // @Mapping(source = "packfat", ignore = true")
  // @Mapping(source = "comalt", ignore = true")
  // @Mapping(source = "exportcon", ignore = true")
  // @Mapping(source = "mailcon", ignore = true")
  // @Mapping(source = "ftpsrvcon", ignore = true")
  // @Mapping(source = "ftppathcon", ignore = true")
  // @Mapping(source = "ftpusrcon", ignore = true")
  // @Mapping(source = "ftppwdcon", ignore = true")
  // @Mapping(source = "ftpportcon", ignore = true")
  // @Mapping(source = "sftpcon", ignore = true")
  // @Mapping(source = "gdpr", ignore = true")
  // @Mapping(source = "emailsf", ignore = true")
  @Mapping(target = "codiceAteco", source = "ateco")
  @Mapping(target = "ivaVentilata", source = "ivavent")
  // @Mapping(source = "lastnot", ignore = true")
  // @Mapping(source = "dataoraupd", ignore = true")
  @Mapping(target = "canale", source = "canale")
  @Mapping(target = "insegna", source = "insegna")
  NegozioDTO legacyToDTO(NegozioLegacy legacy);
}
