package com.retexspa.aggregate;

import com.retexspa.LoadArticolo;
import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloCreateCommand;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloStoreIndexDTO;
import com.retexspa.xr.masterdata.articolo.events.ArticoloCreatedEvent;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;
import com.retexspa.xr.masterdata.negozio.commands.NegozioCreateCommand;
import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import com.retexspa.xr.masterdata.negozio.events.NegozioCreatedEvent;
import java.util.UUID;
import org.axonframework.test.aggregate.AggregateTestFixture;
import org.axonframework.test.aggregate.FixtureConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArticoloAggregateTest {
  private FixtureConfiguration<?> fixture;
  private FixtureConfiguration<?> fixture_negozio;

  @BeforeEach
  public void setUp() {
    fixture = new AggregateTestFixture<ArticoloAggregate>(ArticoloAggregate.class);
    fixture_negozio = new AggregateTestFixture<NegozioAggregate>(NegozioAggregate.class);
  }

  @Test
  void createArticolo() {

    ArticoloDTO articoloDTO = new LoadArticolo().loadArticolo();
    String id = UUID.randomUUID().toString();
    fixture
        .given()
        .when(new ArticoloCreateCommand(id, articoloDTO))
        .expectSuccessfulHandlerExecution()
        .expectEvents(new ArticoloCreatedEvent(id, articoloDTO));
    NegozioDTO negozioDTO = new NegozioDTO();
    negozioDTO.setRagioneSociale("S.I.F. SRL");
    negozioDTO.setCodiceFiscale("");
    negozioDTO.setRegimeFiscale("RF01");
    negozioDTO.setMaster(null);
    String id_negozio = UUID.randomUUID().toString();
    fixture_negozio
        .given()
        .when(new NegozioCreateCommand(id_negozio, negozioDTO))
        .expectSuccessfulHandlerExecution()
        .expectEvents(new NegozioCreatedEvent(id_negozio, negozioDTO));

    ArticoloStoreIndexDTO articoloStoreIndexDTO = new ArticoloStoreIndexDTO(id);

    // assertThat(negozioDTO.getRagioneSociale()).isEqualTo("S.I.F. SRL");

  }
}
