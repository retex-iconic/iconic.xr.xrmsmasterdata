package com.retexspa.xr.masterdata.articolo.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retexspa.xr.masterdata.articolo.aggregates.ArticoloAggregate;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloAddFornitoreDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloCreateDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloFornitoreIndexDTO;
import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloStoreIndexDTO;
import com.retexspa.xr.masterdata.articolo.services.commands.ArticoloCommandService;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value = "/articolo")
@Api(value = "Articolo Commands", description = "Articolo Commands Related Endpoints", tags = "Articolo Commands")
public class ArticoloCommandsController {
    

    private final ArticoloCommandService articoloCommandService;

    // This method creates a new Articolo instance and saves it to the database
    public ArticoloCommandsController(ArticoloCommandService articoloCommandService) {
        this.articoloCommandService = articoloCommandService;
    }

    // This code is used to create a new article. It is used in the context of a POST request to the URI /articoli.
    // The method takes a DTO as an argument. This DTO contains the information needed to create the article.
    // The method calls the method createArticoli in the service class ArticoloCommandService.

    @PostMapping
    public CompletableFuture<Object> createArticoli(@RequestBody ArticoloCreateDTO articoliCreateDTO) {
        CompletableFuture<Object> res = articoloCommandService.createArticolo(articoliCreateDTO);
        return res;
    }

    @GetMapping("/{articoloId}/events")
    public List<Object> getArticoloEvents(@PathParam(value = "articoloId") String articoloId) {
        List<Object> res = articoloCommandService.listEventsForArticolo(articoloId);
        return res;

    }

    @GetMapping("/{articoloId}")
    public ArticoloAggregate getArticoloAggregate(@PathParam(value = "articoloId") String articoloId) {
        ArticoloAggregate res = articoloCommandService.getArticoloAggregate(articoloId);
        return res;
    }

    // endpoint di index e di adding devono essere get??
    @PutMapping("/fornitorePrincipale/{articoloId}")
    public CompletableFuture<String> addedFornitore(@PathParam(value = "articoloId") String articoloId,
                                                    @RequestBody ArticoloAddFornitoreDTO articoloAddFornitoreDTO) {
        CompletableFuture<String> res = articoloCommandService.addedFornitore(articoloId, articoloAddFornitoreDTO);
        return res;
    }

    @PutMapping("/negozioIndex/{articoloId}")
    public CompletableFuture<String> storeIndex(@PathParam(value = "articoloId") String articoloId,
                                                    @RequestBody ArticoloStoreIndexDTO articoloStoreIndexDTO) {
        CompletableFuture<String> res = articoloCommandService.storeIndex(articoloId, articoloStoreIndexDTO);
        return res;
    }

    @PutMapping("/fornitorePrincipaleIndex/{articoloId}")
    public CompletableFuture<String> fornitoreIndex(@PathParam(value = "articoloId") String articoloId,
                                                    @RequestBody ArticoloFornitoreIndexDTO articoloFornitoreIndexDTO) {
        CompletableFuture<String> res = articoloCommandService.fornitoreIndex(articoloId, articoloFornitoreIndexDTO);
        return res;
    }
}
