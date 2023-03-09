package com.retexspa.aggregate;

import java.util.UUID;

import org.axonframework.test.aggregate.AggregateTestFixture;
import org.axonframework.test.aggregate.FixtureConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.retexspa.LoadArticolo;
import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.articolo.commands.ArticoloCreateCommand;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.retexspa.xr.masterdata.articolo.events.ArticoloCreatedEvent;

public class ArticoloAggregateTest {
	private FixtureConfiguration<?> fixture;

	@BeforeEach
	public void setUp() {
		fixture = new AggregateTestFixture<ArticoloAggregate>(ArticoloAggregate.class);
	}    

	@Test
	void createArticolo() {
		
        ArticoloDTO articoloDTO = new LoadArticolo().loadArticolo();
		String id = UUID.randomUUID().toString();
		fixture.given().when(new ArticoloCreateCommand(id, articoloDTO))
        	.expectSuccessfulHandlerExecution()
        	.expectEvents(new ArticoloCreatedEvent(id, articoloDTO));			
	}    
}
