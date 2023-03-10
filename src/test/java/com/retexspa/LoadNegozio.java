package com.retexspa;

import com.retexspa.xr.masterdata.negozio.commands.dto.NegozioDTO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.retexspa.xr.masterdata.negozio.entities.NegozioLegacy;
import com.retexspa.xr.masterdata.negozio.entities.NegozioMapper;

public class LoadNegozio {
    
    public NegozioDTO loadNegozio() {
        NegozioDTO negozioDTO = null;
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current absolute path is: " + s);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        NegozioLegacy negozioLegacy;
        
        try {
            negozioLegacy = objectMapper.readValue(new File("src/test/resources/negozi/01.json"), NegozioLegacy.class);
            negozioDTO = NegozioMapper.MAPPER.legacyToDTO(negozioLegacy);
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
        
        return negozioDTO;
    }
}
