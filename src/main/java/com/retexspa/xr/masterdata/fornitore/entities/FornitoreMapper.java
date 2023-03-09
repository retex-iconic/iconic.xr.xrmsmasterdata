package com.retexspa.xr.masterdata.fornitore.entities;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;

import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;

@Mapper
public interface FornitoreMapper {

  FornitoreMapper MAPPER = Mappers.getMapper(FornitoreMapper.class);

  //TODO define new parameters for Fornitore DTO
  @Mapping(target = "fornom", source = "name")

  FornitoreDTO legacyToDTO(FornitoreLegacy legacy);
}
