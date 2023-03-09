package com.retexspa.xr.masterdata.articoloFornitore.repositories;

import com.retexspa.xr.masterdata.articoloFornitore.entities.ArticoloFornitoreQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticoloFornitoreRepository extends JpaRepository<ArticoloFornitoreQueryEntity, String> {}
