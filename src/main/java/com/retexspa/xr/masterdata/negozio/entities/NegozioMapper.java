package com.retexspa.xr.masterdata.negozio.entities;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;

@Mapper
public interface NegozioMapper {

  NegozioMapper MAPPER = Mappers.getMapper(NegozioMapper.class);

  @Mapping(source = "ragsoc", target = "ragioneSociale")
  @Mapping(source = "codfisc", target = "codiceFiscale")
  @Mapping(source = "regfisc", target = "regimeFiscale")

  NegozioDTO legacyToDto(NegozioLegacy negozioLegacy);
}
