package com.retexspa.xr.masterdata.fornitore.repositories;

import com.retexspa.xr.masterdata.fornitore.entities.FornitoreQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornitoreRepository extends JpaRepository<FornitoreQueryEntity, String> {}
