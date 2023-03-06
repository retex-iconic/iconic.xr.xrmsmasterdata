package com.retexspa.xr.masterdata.shared;

import com.retexspa.xr.masterdata.articolo.projections.ArticoloProjection;
import com.retexspa.xr.masterdata.fornitore.projections.FornitoreProjection;
import com.retexspa.xr.masterdata.negozio.projections.NegozioProjection;
import org.axonframework.config.Configurer;
import org.axonframework.config.DefaultConfigurer;

public class Projection {
  ArticoloProjection articoloProjection = new ArticoloProjection();
  FornitoreProjection fornitoreProjection = new FornitoreProjection();
  NegozioProjection negozioProjection = new NegozioProjection();

  Configurer configurer =
      DefaultConfigurer.defaultConfiguration()
          .registerMessageHandler(config -> articoloProjection)
          .registerMessageHandler(config -> fornitoreProjection)
          .registerMessageHandler(config -> negozioProjection);
}
