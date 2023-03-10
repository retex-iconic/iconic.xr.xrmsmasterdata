package com.retexspa.xr.masterdata.articoloFornitore.entities;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.retexspa.xr.masterdata.articoloFornitore.commands.dto.ArticoloFornitoreDTO;

@Mapper
public interface ArticoloFornitoreMapper {

   ArticoloFornitoreMapper MAPPER = Mappers.getMapper( ArticoloFornitoreMapper.class );

   @Mapping(target = "fornitore", source = "fornitore")
   @Mapping(target = "articolo", source = "articolo")
   @Mapping(target = "costoCartone", source = "prezzcart")
   @Mapping(target = "pezziPerCartone", source = "pezzicart")
   @Mapping(target = "lottoRiordino", source = "lotrior")
// @Mapping(source = "quanacq", ignore = true")
// @Mapping(source = "valacq", ignore = true")
// @Mapping(source = "datulacq", ignore = true")
// @Mapping(source = "ultqua", ignore = true")
// @Mapping(source = "ultprli", ignore = true")
// @Mapping(source = "ultprsc", ignore = true")
// @Mapping(source = "ultprsi", ignore = true")
// @Mapping(source = "penprsc", ignore = true")
// @Mapping(source = "costfut", ignore = true")
// @Mapping(source = "datcofu", ignore = true")
// @Mapping(source = "prsosp", ignore = true")
// @Mapping(source = "quaord", ignore = true")
// @Mapping(source = "datord", ignore = true")
// @Mapping(source = "prord", ignore = true")
// @Mapping(source = "scontrel", ignore = true")
   @Mapping(target = "note", source = "note")
// @Mapping(source = "costoagg", ignore = true")
// @Mapping(source = "quareso", ignore = true")
// @Mapping(source = "valreso", ignore = true")
// @Mapping(source = "penprli", ignore = true")
// @Mapping(source = "datprli", ignore = true")
// @Mapping(source = "costoper", ignore = true")
// @Mapping(source = "rifforn", ignore = true")
// @Mapping(source = "rifartf", ignore = true")
// @Mapping(source = "viscofu", ignore = true")
// @Mapping(source = "dataoraupd", ignore = true")

   ArticoloFornitoreDTO legacyToDTO(ArticoloFornitoreLegacy legacy);
}
