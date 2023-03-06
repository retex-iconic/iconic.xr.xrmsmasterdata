package com.retexspa.xr.masterdata.negozio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.retexspa.xr.masterdata.negozio.entities.NegozioQueryEntity;

public interface NegozioRepository extends JpaRepository<NegozioQueryEntity, String> {
}