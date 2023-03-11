package com.retexspa.mapstruct;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.retexspa.LoadNegozio;
import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class NegozioMapperTests {

  @Test
  public void testMapDtoToEntity() throws StreamReadException, DatabindException, IOException {
    NegozioDTO negozioDTO = new LoadNegozio().loadNegozio();

    assertThat(negozioDTO.getRagioneSociale()).isEqualTo("S.I.F. SRL");
    assertThat(negozioDTO.getCodiceFiscale()).isEqualTo("");
    assertThat(negozioDTO.getRegimeFiscale()).isEqualTo("RF01");
    assertThat(negozioDTO.getMaster()).isEqualTo(null);
    // assertThat( customer.getOrderItems() )
    //     .extracting( "name", "quantity" )
    //     .containsExactly( tuple( "Table", 2L ) );
  }
}
