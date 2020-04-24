package com.sura.cotizador.usersinterfaces.enums;

public enum  DatosPoliza {

    FASECOLDA("05601156");

    private String datosPoliza;

    public String getDatosPoliza(){return datosPoliza;}

    DatosPoliza(String productosCotizador){
        this.datosPoliza= productosCotizador;
    }

}