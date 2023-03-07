package com.retexspa.xr.masterdata.negozio.controllers;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;
import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import com.retexspa.xr.masterdata.negozio.services.commands.NegozioCommandService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/negozio")
@Api(
    value = "Negozio Commands",
    description = "Negozio Commands Related Endpoints",
    tags = "Negozio Commands")
public class NegozioCommandsController {

  private final NegozioCommandService negozioCommandService;

  public NegozioCommandsController(NegozioCommandService negozioCommandService) {
    this.negozioCommandService = negozioCommandService;
  }

  @PostMapping
  public CompletableFuture<Object> createNegozio(@RequestBody NegozioDTO negozioCreateDTO) {
    CompletableFuture<Object> res = negozioCommandService.createNegozio(negozioCreateDTO);
    return res;
  }

  @GetMapping("/{negozioId}/events")
  public List<Object> getNegozioEvents(@PathParam(value = "negozioId") String negozioId) {
    List<Object> res = negozioCommandService.listEventsForNegozio(negozioId);
    return res;
  }

  @GetMapping("/{negozioId}")
  public NegozioAggregate getNegozioAggregate(@PathParam(value = "negozioId") String negozioId) {
    NegozioAggregate res = negozioCommandService.getNegozioAggregate(negozioId);
    return res;
  }

  @PutMapping("/{negozioId}")
  public CompletableFuture<Object> updateNegozi(@PathVariable(value = "negozioId") String negozioId, @RequestBody NegozioDTO negozioCreateDTO) {
    CompletableFuture<Object> res = negozioCommandService.updateNegozio(negozioId, negozioCreateDTO);
    return res;
  }

  @PutMapping("/articoloIndex-{negozioId}/{articoloId}")
  public ArticoloAggregate articoloIndex(
      @PathVariable(value = "negozioId") String negozioId,
      @PathVariable(value = "articoloId") String articoloId) {
    ArticoloAggregate res = negozioCommandService.articoloIndex(negozioId, articoloId);
    return res;
  }

  @GetMapping("/fornitoreIndex-{negozioId}/{fornitoreId}")
  public FornitoreAggregate fornitoreIndex(
      @PathVariable(value = "negozioId") String negozioId,
      @PathVariable(value = "fornitoreId") String fornitoreId) {
    FornitoreAggregate res = negozioCommandService.fornitoreIndex(negozioId, fornitoreId);
    return res;
  }
}
