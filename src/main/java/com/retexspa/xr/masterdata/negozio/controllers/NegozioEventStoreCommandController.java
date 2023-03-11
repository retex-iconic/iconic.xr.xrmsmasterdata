package com.retexspa.xr.masterdata.negozio.controllers;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;
import com.retexspa.xr.masterdata.negozio.services.commands.NegozioCommandService;
import com.retexspa.xr.masterdata.negozio.services.queries.NegozioQueryService;
import java.util.concurrent.CompletableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/commands/w/negozio")
@io.swagger.v3.oas.annotations.tags.Tag(
    name = "Negozio Commands",
    description = "Negozio Commands Related Endpoints")
public class NegozioEventStoreCommandController {

  private final NegozioCommandService negozioCommandService;

  @Autowired private final NegozioQueryService negozioQueryService;

  public NegozioEventStoreCommandController(
      NegozioCommandService negozioCommandService, NegozioQueryService negozioQueryService) {
    this.negozioCommandService = negozioCommandService;
    this.negozioQueryService = negozioQueryService;
  }

  @PostMapping
  public CompletableFuture<Object> createNegozio(@RequestBody NegozioDTO negozioCreateDTO) {
    CompletableFuture<Object> res = negozioCommandService.createNegozio(negozioCreateDTO);
    return res;
  }

  @PutMapping("/{negozioId}")
  public CompletableFuture<Object> updateNegozi(
      @PathVariable(value = "negozioId") String negozioId,
      @RequestBody NegozioDTO negozioCreateDTO) {
    CompletableFuture<Object> res =
        negozioCommandService.updateNegozio(negozioId, negozioCreateDTO);
    return res;
  }

  @PutMapping("/articoloIndex-{negozioId}/{articoloId}")
  public ArticoloAggregate articoloIndex(
      @PathVariable(value = "negozioId") String negozioId,
      @PathVariable(value = "articoloId") String articoloId) {
    ArticoloAggregate res = negozioQueryService.articoloIndex(negozioId, articoloId);
    return res;
  }
}
