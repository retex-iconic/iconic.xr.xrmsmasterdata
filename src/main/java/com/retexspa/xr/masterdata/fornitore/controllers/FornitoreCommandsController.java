package com.retexspa.xr.masterdata.fornitore.controllers;

import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreAddArticoloDTO;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreArticoloIndexDTO;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreCreateDTO;
import com.retexspa.xr.masterdata.fornitore.services.commands.FornitoreCommandService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fornitore")
@Api(
    value = "Fornitore Commands",
    description = "Fornitore Commands Related Endpoints",
    tags = "Fornitore Commands")
public class FornitoreCommandsController {

  private final FornitoreCommandService fornitoreCommandService;

  public FornitoreCommandsController(FornitoreCommandService fornitoreCommandService) {
    this.fornitoreCommandService = fornitoreCommandService;
  }

  @PostMapping
  public CompletableFuture<Object> createFornitore(
      @RequestBody FornitoreCreateDTO fornitoreCreateDTO) {
    CompletableFuture<Object> res = fornitoreCommandService.createFornitore(fornitoreCreateDTO);
    return res;
  }

  @GetMapping("/{fornitoreId}/events")
  public List<Object> getFornitoreEvents(@PathParam(value = "fornitoreId") String articoloId) {
    List<Object> res = fornitoreCommandService.listEventsForFornitore(articoloId);
    return res;
  }

  @GetMapping("/{fornitoreId}")
  public FornitoreAggregate getFornitoreAggregate(
      @PathParam(value = "fornitoreId") String fornitoreId) {
    FornitoreAggregate res = fornitoreCommandService.getFornitoreAggregate(fornitoreId);
    return res;
  }

  // endpoint di index e di adding devono essere get??
  @PutMapping("/articoloFornitorePrincipale/{fornitoreId}")
  public CompletableFuture<String> addedArticolo(
      @PathParam(value = "fornitoreId") String fornitoreId,
      @RequestBody FornitoreAddArticoloDTO fornitoreAddArticoloDTO) {
    CompletableFuture<String> res =
        fornitoreCommandService.addedArticolo(fornitoreId, fornitoreAddArticoloDTO);
    return res;
  }

  @PutMapping("/articoloFornitorePrincipaleIndex/{fornitoreId}")
  public CompletableFuture<String> articoloIndex(
      @PathParam(value = "fornitoreId") String fornitoreId,
      @RequestBody FornitoreArticoloIndexDTO fornitoreArticoloIndexDTO) {
    CompletableFuture<String> res =
        fornitoreCommandService.articoloIndex(fornitoreId, fornitoreArticoloIndexDTO);
    return res;
  }
}
