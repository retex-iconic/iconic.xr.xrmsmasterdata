package com.retexspa.xr.masterdata.fornitore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.retexspa.xr.masterdata.fornitore.entities.FornitoreQueryEntity;

public interface FornitoreRepository extends JpaRepository<FornitoreQueryEntity, String> {
}
