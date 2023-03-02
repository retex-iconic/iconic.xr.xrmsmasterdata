package com.retexspa.xr.masterdata.articolo.commands.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ArticoloAddFornitoreDTO {

  private String fornitoreId;

  public String getFornitoreId() {
    return fornitoreId;
  }

  public void setFornitoreId(String fornitoreId) {
    this.fornitoreId = fornitoreId;
  }
}
