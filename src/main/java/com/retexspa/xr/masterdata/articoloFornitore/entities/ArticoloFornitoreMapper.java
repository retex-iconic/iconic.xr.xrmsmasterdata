package com.retexspa.xr.masterdata.articoloFornitore.entities;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.retexspa.xr.masterdata.articoloFornitore.commands.dto.ArticoloFornitoreDTO;

@Mapper
public interface ArticoloFornitoreMapper {

   ArticoloFornitoreMapper MAPPER = Mappers.getMapper( ArticoloFornitoreMapper.class );

   @Mapping(source = "fornitore", target = "fornitore")
   @Mapping(source = "articolo", target = "articolo")
   @Mapping(source = "prezzcart", target = "costoCartone")
   @Mapping(source = "pezzicart", target = "pezziPerCartone")
   @Mapping(source = "lotrior", target = "lottoRiordino")
   @Mapping(source = "note", target = "note")

   ArticoloFornitoreDTO legacyToDto(ArticoloFornitoreLegacy articoloFornitorelegacy);
}
