package com.retexspa.xr.masterdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
 * TODO:
 *  definire annotation di relate table creare aggregato per codici articolo fornitore che proietta 
 *  articoli e fornitori con legame (articoloFornitore to codiciArticoloFornitore, @ManyToOne); 
 *  creare aggregato codici vendita (articolo to CodiciVendita, @OneToMany) 
 *  DOBBIAMO ANCORA CAPIRE COME RELAZIONARE ARTICOLI NEGOZI FORNITORI IN VIA DEFINITIVA
 */

 //TODO relate the tables correctly
@SpringBootApplication
@EnableJpaRepositories
@io.swagger.v3.oas.annotations.OpenAPIDefinition(
    info =
        @io.swagger.v3.oas.annotations.info.Info(
            title = "XR Master Data",
            description = "" + "CQRS API for XR Master Data.",
            version = "1.0",
            contact =
                @io.swagger.v3.oas.annotations.info.Contact(
                    name = "Retex SPA",
                    email = "",
                    url = "https://retexspa.com"),
            license =
                @io.swagger.v3.oas.annotations.info.License(
                    name = "Retex SPA",
                    url = "https://retexspa.com"))
    // servers = @Server(url = "http://localhost:8080")
    )
public class XrmsmasterdataApplication {

  public static void main(String[] args) {
    SpringApplication.run(XrmsmasterdataApplication.class, args);
  }
}
