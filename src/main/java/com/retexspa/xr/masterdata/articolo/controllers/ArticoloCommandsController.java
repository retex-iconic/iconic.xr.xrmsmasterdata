package com.retexspa.xr.masterdata.articolo.controllers;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloAddFornitoreDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloFornitoreIndexDTO;
import com.retexspa.xr.masterdata.articolo.services.commands.ArticoloCommandService;
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
public class ArticoloCommandsController {

  private final ArticoloCommandService articoloCommandService;

  // This method creates a new Articolo instance and saves it to the database
  public ArticoloCommandsController(ArticoloCommandService articoloCommandService) {
    this.articoloCommandService = articoloCommandService;
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
    List<Object> res = articoloCommandService.listEventsForArticolo(articoloId);
    return res;
  }

  @GetMapping("/{articoloId}")
  public ArticoloAggregate getArticoloAggregate(
      @PathVariable(value = "articoloId") String articoloId) {
    ArticoloAggregate res = articoloCommandService.getArticoloAggregate(articoloId);
    return res;
  }

  @GetMapping("/negozioIndex/{articoloId}")
  public NegozioAggregate storeIndex(@PathVariable(value = "articoloId") String articoloId) {
    NegozioAggregate res = articoloCommandService.storeIndex(articoloId);
    return res;
  }

  @PutMapping("/{articoloId}")
  public CompletableFuture<Object> updateArticoli(
      @PathVariable(value = "articoloId") String articoloId, @RequestBody ArticoloDTO articoliDTO) {
    CompletableFuture<Object> res = articoloCommandService.updateArticolo(articoloId, articoliDTO);
    return res;
  }

  @PutMapping("/fornitorePrincipale/{articoloId}")
  public CompletableFuture<String> addedFornitore(
      @PathVariable(value = "articoloId") String articoloId,
      @RequestBody ArticoloAddFornitoreDTO articoloAddFornitoreDTO) {
    CompletableFuture<String> res =
        articoloCommandService.addedFornitore(articoloId, articoloAddFornitoreDTO);
    return res;
  }

  @PutMapping("/fornitorePrincipaleIndex/{articoloId}")
  public CompletableFuture<String> fornitoreIndex(
      @PathVariable(value = "articoloId") String articoloId,
      @RequestBody ArticoloFornitoreIndexDTO articoloFornitoreIndexDTO) {
    CompletableFuture<String> res =
        articoloCommandService.fornitoreIndex(articoloId, articoloFornitoreIndexDTO);
    return res;
  }
}
