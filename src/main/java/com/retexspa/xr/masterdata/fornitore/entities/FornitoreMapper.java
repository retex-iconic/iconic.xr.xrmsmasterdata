package com.retexspa.xr.masterdata.fornitore.entities;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;

import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;

@Mapper
public interface FornitoreMapper {

  FornitoreMapper MAPPER = Mappers.getMapper(FornitoreMapper.class);

  @Mapping(source = "forcod", target = "codiceFornitore")
  @Mapping(source = "fornum", target = "numeroFornitore")
  @Mapping(source = "fornom", target = "nomeFornitore")
  @Mapping(source = "forind", target = "indirizzo")
  @Mapping(source = "forcit", target = "citta")
  @Mapping(source = "forcap", target = "cap")
  @Mapping(source = "forpiva", target = "piva")

  FornitoreDTO legacyToDTO(FornitoreLegacy legacy);
}
