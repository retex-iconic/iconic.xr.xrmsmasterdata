package com.retexspa;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.retexspa.xr.masterdata.fornitore.commands.dto.FornitoreDTO;
import com.retexspa.xr.masterdata.fornitore.entities.FornitoreLegacy;
import com.retexspa.xr.masterdata.fornitore.entities.FornitoreMapper;

public class LoadFornitore {
    
    //TODO complete the load for fornitore as it was done for articolo

    public FornitoreDTO loadFornitore() {
        FornitoreDTO fornitoreDTO = null;
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current absolute path is: " + s);
        
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        FornitoreLegacy fornitoreLegacy;
        
        try {
            fornitoreLegacy = objectMapper.readValue(new File("src/test/resources/"/*+ add test json for fornitore*/), FornitoreLegacy.class);
            fornitoreDTO = FornitoreMapper.MAPPER.legacyToDTO(fornitoreLegacy);
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
        
        return fornitoreDTO;
    }
}
