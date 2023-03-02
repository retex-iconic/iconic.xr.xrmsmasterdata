package com.retexspa.xr.masterdata.negozio.controllers;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.retexspa.xr.masterdata.negozio.aggregates.NegozioAggregate;
import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioCreateDTO;
import com.retexspa.xr.masterdata.negozio.commands.dto.StoreArticoloIndexDTO;
import com.retexspa.xr.masterdata.negozio.services.commands.NegozioCommandService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value = "/negozio")
@Api(value = "Negozio Commands", description = "Negozio Commands Related Endpoints", tags = "Negozio Commands")
public class NegozioCommandsController {
    
    private final NegozioCommandService negozioCommandService;

    public NegozioCommandsController(NegozioCommandService negozioCommandService) {
        this.negozioCommandService = negozioCommandService;
    }

    //TODO aggiungere metodi per post e get..


    @PostMapping
    public CompletableFuture<Object> createNegozio(@RequestBody NegozioCreateDTO negozioCreateDTO) {
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

    @PutMapping("/articoloIndex/{negozioId}")
    public CompletableFuture<String> articoloIndex(@PathParam(value = "negozioId") String negozioId,
                                                    @RequestBody StoreArticoloIndexDTO storeArticoloIndexDTO) {
        CompletableFuture<String> res = negozioCommandService.articoloIndex(negozioId, storeArticoloIndexDTO);
        return res;
    }
}
