package com.retexspa.xr.masterdata.fornitore.entities;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;

import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;

@Mapper
public interface FornitoreMapper {

  FornitoreMapper MAPPER = Mappers.getMapper(FornitoreMapper.class);

  @Mapping(target = "forcod", source = "codiceFornitore")
  @Mapping(target = "fornum", source = "numeroFornitore")
  @Mapping(target = "fornom", source = "nomeFornitore")
  @Mapping(target = "forind", source = "indirizzo")
  @Mapping(target = "forcit", source = "città")
  @Mapping(target = "forcap", source = "cap")
  @Mapping(target = "forpiva", source = "piva")

  FornitoreDTO legacyToDTO(FornitoreLegacy legacy);
}
