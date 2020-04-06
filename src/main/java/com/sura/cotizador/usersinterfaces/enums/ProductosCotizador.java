package com.sura.cotizador.usersinterfaces.enums;

public enum ProductosCotizador {

  INICIO("Inicio"),
  SOLUCIONES("Soluciones"),
  MIS_NEGOCIOS("Mis Negocios"),
 SEGUROS_AUTOS("Seguros Autos"),
  NUEVO("Nuevo"),
  MODIFICACIONES("Modificaciones");

  private String productosCotizador;


  public String getProductosCotizador() {
    return productosCotizador;
  }

  ProductosCotizador(String productosCotizador){
    this.productosCotizador= productosCotizador;
  }

}