package com.retexspa.xr.masterdata.negozio.repositories;

import com.retexspa.xr.masterdata.negozio.entities.NegozioQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NegozioRepository extends JpaRepository<NegozioQueryEntity, String> {}
