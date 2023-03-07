package com.retexspa.mapstruct;

import static org.assertj.core.api.Assertions.assertThat;
import com.retexspa.LoadArticolo;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.retexspa.xr.masterdata.articolo.entities.ArticoloLegacy;
import com.retexspa.xr.masterdata.articolo.entities.ArticoloMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

public class ArticoloMapperTests {

  @Test
  public void testMapDtoToEntity() throws StreamReadException, DatabindException, IOException {
    ArticoloDTO articoloDTO = new LoadArticolo().loadArticolo();

    assertThat(articoloDTO.getCodice()).isEqualTo("026472");
    assertThat(articoloDTO.getDescrizione()).isEqualTo("BUITONI PIZZA BEL NAP MINI 300");
    assertThat(articoloDTO.getCodice2()).isEqualTo("520353");
    assertThat(articoloDTO.getCodice3()).isEqualTo("00002395");
    // assertThat( customer.getOrderItems() )
    //     .extracting( "name", "quantity" )
    //     .containsExactly( tuple( "Table", 2L ) );
  }
}
