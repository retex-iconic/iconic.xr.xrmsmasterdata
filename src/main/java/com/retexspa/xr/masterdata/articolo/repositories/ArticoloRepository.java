package com.retexspa.xr.masterdata.articolo.repositories;

import com.retexspa.xr.masterdata.articolo.entities.ArticoloQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticoloRepository extends JpaRepository<ArticoloQueryEntity, Long> {}
