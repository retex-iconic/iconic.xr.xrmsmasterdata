package com.retexspa.xr.masterdata.articolo.controllers;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.retexspa.xr.masterdata.articolo.services.commands.ArticoloCommandService;
import com.retexspa.xr.masterdata.articolo.services.queries.ArticoloQueryService;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;
import io.swagger.annotations.Api;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/articolo")
@Api(
    value = "Articolo Commands",
    description = "Articolo Commands Related Endpoints",
    tags = "Articolo Commands")
public class ArticoloController {

  private final ArticoloCommandService articoloCommandService;
  private final ArticoloQueryService articoloQueryService;

  // This method creates a new Articolo instance and saves it to the database
  public ArticoloController(ArticoloCommandService articoloCommandService, ArticoloQueryService articoloQueryService) {
    this.articoloCommandService = articoloCommandService;
    this.articoloQueryService = articoloQueryService;
  }

  // This code is used to create a new article. It is used in the context of a POST request to the
  // URI /articoli.
  // The method takes a DTO as an argument. This DTO contains the information needed to create the
  // article.
  // The method calls the method createArticoli in the service class ArticoloCommandService.

  @PostMapping
  public CompletableFuture<Object> createArticoli(@RequestBody ArticoloDTO articoliDTO) {
    CompletableFuture<Object> res = articoloCommandService.createArticolo(articoliDTO);
    return res;
  }

  @GetMapping("/{articoloId}/events")
  public List<Object> getArticoloEvents(@PathVariable(value = "articoloId") String articoloId) {
    List<Object> res = articoloQueryService.listEventsForArticolo(articoloId);
    return res;
  }

  @GetMapping("/{articoloId}")
  public ArticoloAggregate getArticoloAggregate(
      @PathVariable(value = "articoloId") String articoloId) {
    ArticoloAggregate res = articoloQueryService.getArticoloAggregate(articoloId);
    return res;
  }

  @PutMapping("/{articoloId}")
  public CompletableFuture<Object> updateArticoli(
      @PathVariable(value = "articoloId") String articoloId, @RequestBody ArticoloDTO articoliDTO) {
    CompletableFuture<Object> res = articoloCommandService.updateArticolo(articoloId, articoliDTO);
    return res;
  }

  @GetMapping("/negozioIndex-{articoloId}/{storeId}")
  public NegozioAggregate storeIndex(
      @PathVariable(value = "articoloId") String articoloId,
      @PathVariable(value = "storeId") String storeId) {
    NegozioAggregate res = articoloQueryService.storeIndex(articoloId, storeId);
    return res;
  }
}
