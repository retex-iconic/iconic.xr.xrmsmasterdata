package com.retexspa.xr.masterdata.fornitore.controllers;

import com.retexspa.xr.masterdata.fornitore.aggregates.FornitoreAggregate;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;
import com.retexspa.xr.masterdata.fornitore.services.commands.FornitoreCommandService;
import com.retexspa.xr.masterdata.fornitore.services.queries.FornitoreQueryService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class FornitoreController {

  private final FornitoreCommandService fornitoreCommandService;

  @Autowired private final FornitoreQueryService fornitoreQueryService;

  public FornitoreController(
      FornitoreCommandService fornitoreCommandService,
      FornitoreQueryService fornitoreQueryService) {
    this.fornitoreCommandService = fornitoreCommandService;
    this.fornitoreQueryService = fornitoreQueryService;
  }

  @PostMapping
  public CompletableFuture<Object> createFornitore(@RequestBody FornitoreDTO fornitoreDTO) {
    CompletableFuture<Object> res = fornitoreCommandService.createFornitore(fornitoreDTO);
    return res;
  }

  @GetMapping("/{fornitoreId}/events")
  public List<Object> getFornitoreEvents(@PathParam(value = "fornitoreId") String fornitoreId) {
    List<Object> res = fornitoreQueryService.listEventsForFornitore(fornitoreId);
    return res;
  }

  @GetMapping("/{fornitoreId}")
  public FornitoreAggregate getFornitoreAggregate(
      @PathVariable(value = "fornitoreId") String fornitoreId) {
    FornitoreAggregate res = fornitoreQueryService.getFornitoreAggregate(fornitoreId);
    return res;
  }

  @PutMapping("/{fornitoreId}")
  public CompletableFuture<Object> updateFornitori(
      @PathVariable(value = "fornitoreId") String fornitoreId,
      @RequestBody FornitoreDTO fornitoreDTO) {
    CompletableFuture<Object> res =
        fornitoreCommandService.updateFornitore(fornitoreId, fornitoreDTO);
    return res;
  }
}
