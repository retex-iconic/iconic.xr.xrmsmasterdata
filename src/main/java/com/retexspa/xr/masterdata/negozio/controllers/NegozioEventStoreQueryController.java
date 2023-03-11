package com.retexspa.xr.masterdata.negozio.controllers;

import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;
import com.retexspa.xr.masterdata.negozio.services.commands.NegozioCommandService;
import com.retexspa.xr.masterdata.negozio.services.queries.NegozioQueryService;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/commands/r/negozio")
@io.swagger.v3.oas.annotations.tags.Tag(
    name = "Negozio Commands ( EventStore Queries )",
    description = "Negozio EventStore Queries Related Endpoints")
public class NegozioEventStoreQueryController {

  private final NegozioCommandService negozioCommandService;

  @Autowired private final NegozioQueryService negozioQueryService;

  public NegozioEventStoreQueryController(
      NegozioCommandService negozioCommandService, NegozioQueryService negozioQueryService) {
    this.negozioCommandService = negozioCommandService;
    this.negozioQueryService = negozioQueryService;
  }

  @GetMapping("/{negozioId}/events")
  public List<Object> getNegozioEvents(@PathParam(value = "negozioId") String negozioId) {
    List<Object> res = negozioQueryService.listEventsForNegozio(negozioId);
    return res;
  }

  @GetMapping("/{negozioId}")
  public NegozioAggregate getNegozioAggregate(@PathParam(value = "negozioId") String negozioId) {
    NegozioAggregate res = negozioQueryService.getNegozioAggregate(negozioId);
    return res;
  }

  @GetMapping("/fornitoreIndex-{negozioId}/{fornitoreId}")
  public FornitoreAggregate fornitoreIndex(
      @PathVariable(value = "negozioId") String negozioId,
      @PathVariable(value = "fornitoreId") String fornitoreId) {
    FornitoreAggregate res = negozioQueryService.fornitoreIndex(negozioId, fornitoreId);
    return res;
  }
}
