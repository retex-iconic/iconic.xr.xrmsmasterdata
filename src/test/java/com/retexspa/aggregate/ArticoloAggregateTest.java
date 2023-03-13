package com.retexspa.aggregate;

import com.retexspa.LoadArticolo;
import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloCreateCommand;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloNegozioIndexCommand;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloNegozioIndexDTO;
import com.retexspa.xr.masterdata.articolo.events.ArticoloCreatedEvent;
import com.retexspa.xr.masterdata.articolo.events.ArticoloNegozioIndexEvent;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;
import com.retexspa.xr.masterdata.negozio.commands.NegozioCreateCommand;
import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import com.retexspa.xr.masterdata.negozio.events.NegozioCreatedEvent;
import java.util.UUID;
import org.axonframework.test.aggregate.AggregateTestFixture;
import org.axonframework.test.aggregate.FixtureConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// uuid index = 0d6c3219-82ee-3d2a-bc48-e5de675e8d92
// articolo id = 4f2ef142-c882-484e-84a3-7bbb3dfc0e6a

public class ArticoloAggregateTest {
  private FixtureConfiguration<?> fixture;
  private FixtureConfiguration<?> fixture_negozio;

  @BeforeEach
  public void setUp() {
    fixture = new AggregateTestFixture<ArticoloAggregate>(ArticoloAggregate.class);
    fixture_negozio = new AggregateTestFixture<NegozioAggregate>(NegozioAggregate.class);
  }

  @Test
  void generateId () {
    String articolo_id = "4f2ef142-c882-484e-84a3-7bbb3dfc0e6a";
    String articolo_index_id = "0d6c3219-82ee-3d2a-bc48-e5de675e8d92";
    String id = ArticoloNegozioIndexDTO.getIdFromArticolo(articolo_id) ;
    assert id.equals(articolo_index_id);
  }

  @Test
  void createArticolo() {

    ArticoloDTO articoloDTO = new LoadArticolo().loadArticolo();
    String id = UUID.randomUUID().toString();
    ArticoloNegozioIndexDTO articoloStoreIndexDTO = new ArticoloNegozioIndexDTO(id);
    fixture
        .given(new ArticoloCreatedEvent(id, articoloDTO))
        .when(new ArticoloCreateCommand(id, articoloDTO))
        .expectSuccessfulHandlerExecution()
        .expectEvents(new ArticoloNegozioIndexEvent(id, articoloStoreIndexDTO));
  }

  @Test
  void addArticoloNegozioIndex() {
    String id = UUID.randomUUID().toString();    
    ArticoloDTO articoloDTO = new ArticoloDTO();
    fixture
        .given()
        .when(new ArticoloCreateCommand(id, articoloDTO))
        .expectSuccessfulHandlerExecution()
        .expectEvents(new ArticoloCreatedEvent(id, articoloDTO));



    NegozioDTO negozioDTO = new NegozioDTO();
    negozioDTO.setRagioneSociale("ragioneSociale");
    negozioDTO.setCodiceFiscale("codiceFiscale");
    negozioDTO.setRegimeFiscale("regimeFiscale");
    negozioDTO.setMaster(null);
    String id_negozio = UUID.randomUUID().toString();
    fixture_negozio
        .given()
        .when(new NegozioCreateCommand(id_negozio, negozioDTO))
        .expectSuccessfulHandlerExecution()
        .expectEvents(new NegozioCreatedEvent(id_negozio, negozioDTO));


    ArticoloNegozioIndexDTO articoloStoreIndexDTO = new ArticoloNegozioIndexDTO(id);

    fixture.given( )
        .when(new ArticoloNegozioIndexCommand(id_negozio, articoloStoreIndexDTO))
        .expectSuccessfulHandlerExecution()
        .expectEvents(new ArticoloNegozioIndexCommand(id_negozio, articoloStoreIndexDTO));

  }
}
