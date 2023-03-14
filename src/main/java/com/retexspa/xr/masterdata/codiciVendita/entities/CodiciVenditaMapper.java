package com.retexspa.xr.masterdata.codiciVendita.entities;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.retexspa.xr.masterdata.codiciVendita.commands.dto.CodiciVenditaDTO;

@Mapper
public interface CodiciVenditaMapper {

   CodiciVenditaMapper MAPPER = Mappers.getMapper( CodiciVenditaMapper.class );

   @Mapping(target = "articolo", source = "articolo")
   @Mapping(target = "tipoCodiceVendita", source = "tipocod")
   @Mapping(target = "codiceVendita", source = "artcas")
   @Mapping(target = "codiceMoltiplicatore", source = "moltip")
   @Mapping(target = "codiceVenditaLocale", source = "ecrres")
   // @Mapping(source = "datins", ignore = true)
   // @Mapping(source = "datmod", ignore = true)
   // @Mapping(source = "datulve", ignore = true)
   @Mapping(target = "quantitaCodiceVendita", source = "qtamolt")
   @Mapping(target = "prezzoCodiceVendita", source = "przmolt")
   @Mapping(target = "descrizioneCodiceVendita", source = "desmolt")
   @Mapping(target = "stato", source = "stato")
   @Mapping(target = "scontoCodiceVendita", source = "scomolt")
   // @Mapping(source = "tipoprz", ignore = true)
   // @Mapping(source = "artecr", ignore = true)
   // @Mapping(source = "eanbo", ignore = true)
   @Mapping(target = "variante", source = "variante")
   // @Mapping(source = "dataoraupd", ignore = true)

   CodiciVenditaDTO legacyToDTO(CodiciVenditaLegacy legacy);
}
