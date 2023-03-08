package com.retexspa;

import com.retexspa.xr.masterdata.articolo.commands.dto.ArticoloDTO;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.retexspa.xr.masterdata.articolo.entities.ArticoloLegacy;
import com.retexspa.xr.masterdata.articolo.entities.ArticoloMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LoadArticolo {
    
    public ArticoloDTO loadArticolo() {
        ArticoloDTO articoloDTO = null;
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current absolute path is: " + s);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        ArticoloLegacy articoloLegacy;
        
        try {
            articoloLegacy = objectMapper.readValue(new File("src/test/resources/013188.json"), ArticoloLegacy.class);
            articoloDTO = ArticoloMapper.MAPPER.legacyToDTO(articoloLegacy);
        } catch (StreamReadException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DatabindException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }                    
        
        return articoloDTO;
    }
}
