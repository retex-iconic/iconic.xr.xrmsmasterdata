package com.retexspa.xr.masterdata.codiciArticoloFornitore.entities;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.retexspa.xr.masterdata.codiciArticoloFornitore.commands.dto.CodiciArticoloFornitoreDTO;

@Mapper
public interface CodiciArticoloFornitoreMapper {

   CodiciArticoloFornitoreMapper MAPPER = Mappers.getMapper( CodiciArticoloFornitoreMapper.class );

   @Mapping(target = "fornitore", source = "fornitore")
   @Mapping(target = "codiceArticoloFornitore", source = "artfor")
   @Mapping(target = "articolo", source = "articolo")
   @Mapping(target = "costoCartone", source = "prezzcart")
   @Mapping(target = "pezziCartone", source = "pezzicart")
   @Mapping(target = "descrizione", source = "descriz")
   @Mapping(target = "tipo", source = "tipo")
   @Mapping(target = "unitaDiMisura", source = "misura")
   @Mapping(target = "quantita", source = "quantita")
   @Mapping(target = "codiceSAP", source = "codicesap")
// @Mapping(source = "dataoraupd", ignore = true")

   CodiciArticoloFornitoreDTO legacyToDTO(CodiciArticoloFornitoreLegacy legacy);
}
