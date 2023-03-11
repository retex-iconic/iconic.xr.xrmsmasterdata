package com.retexspa.xr.masterdata.articoloFornitore.controllers;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.articoloFornitore.aggregates.ArticoloFornitoreAggregate;
import com.retexspa.xr.masterdata.articoloFornitore.commands.dto.ArticoloFornitoreDTO;
import com.retexspa.xr.masterdata.articoloFornitore.services.commands.ArticoloFornitoreCommandService;
import com.retexspa.xr.masterdata.articoloFornitore.services.queries.ArticoloFornitoreQueryService;
import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import io.swagger.annotations.Api;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/articoloFornitore")
@Api(
    value = "ArticoloFornitore Commands",
    description = "ArticoloFornitore Commands Related Endpoints",
    tags = "ArticoloFornitore Commands")
public class ArticoloFornitoreController {

  private final ArticoloFornitoreCommandService articoloFornitoreCommandService;

  @Autowired private final ArticoloFornitoreQueryService articoloFornitoreQueryService;

  public ArticoloFornitoreController(
      ArticoloFornitoreCommandService articoloFornitoreCommandService,
      ArticoloFornitoreQueryService articoloFornitoreQueryService) {
    this.articoloFornitoreCommandService = articoloFornitoreCommandService;
    this.articoloFornitoreQueryService = articoloFornitoreQueryService;
  }

  @PostMapping
  public CompletableFuture<Object> createArticoloFornitore(
      @RequestBody ArticoloFornitoreDTO articoliFornitoreDTO) {
    CompletableFuture<Object> res =
        articoloFornitoreCommandService.createArticoloFornitore(articoliFornitoreDTO);
    return res;
  }

  @GetMapping("/{articoloFornitoreId}/events")
  public List<Object> getArticoloFornitoreEvents(
      @PathVariable(value = "articoloFornitoreId") String articoloFornitoreId) {
    List<Object> res =
        articoloFornitoreQueryService.listEventsForArticoloFornitore(articoloFornitoreId);
    return res;
  }

  @GetMapping("/{articoloFornitoreId}")
  public ArticoloFornitoreAggregate getArticoloFornitoreAggregate(
      @PathVariable(value = "articoloFornitoreId") String articoloFornitoreId) {
    ArticoloFornitoreAggregate res =
        articoloFornitoreQueryService.getArticoloFornitoreAggregate(articoloFornitoreId);
    return res;
  }

  @PutMapping("/{articoloFornitoreId}")
  public CompletableFuture<Object> updateArticoloFornitore(
      @PathVariable(value = "articoloFornitoreId") String articoloFornitoreId,
      @RequestBody ArticoloFornitoreDTO articoliFornitoreDTO) {
    CompletableFuture<Object> res =
        articoloFornitoreCommandService.updateArticoloFornitore(
            articoloFornitoreId, articoliFornitoreDTO);
    return res;
  }

  @GetMapping("/articoloIndex-{articoloFornitoreId}/{articoloId}")
  public ArticoloAggregate articoloIndex(
      @PathVariable(value = "articoloFornitoreId") String articoloFornitoreId,
      @PathVariable(value = "articoloId") String articoloId) {
    ArticoloAggregate res =
        articoloFornitoreQueryService.articoloIndex(articoloFornitoreId, articoloId);
    return res;
  }

  @GetMapping("/fornitoreIndex-{articoloFornitoreId}/{fornitoreId}")
  public FornitoreAggregate fornitoreIndex(
      @PathVariable(value = "articoloFornitoreId") String articoloFornitoreId,
      @PathVariable(value = "fornitoreId") String fornitoreId) {
    FornitoreAggregate res =
        articoloFornitoreQueryService.fornitoreIndex(articoloFornitoreId, fornitoreId);
    return res;
  }
}
