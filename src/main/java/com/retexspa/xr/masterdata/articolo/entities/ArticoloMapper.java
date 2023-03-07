package com.retexspa.xr.masterdata.articolo.entities;

import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ArticoloMapper {

  ArticoloMapper MAPPER = Mappers.getMapper(ArticoloMapper.class);

  @Mapping(source = "artbo", target = "codice")
  @Mapping(source = "descriz", target = "descrizione")
  @Mapping(source = "artcedi", target = "codice2")
  @Mapping(source = "idsendecr", target = "codice3")
  @Mapping(source = "produttore", target = "produttore")
  @Mapping(source = "reparto", target = "reparto")
  ArticoloDTO legacyToDTO(ArticoloLegacy articoloLegacy);
}
