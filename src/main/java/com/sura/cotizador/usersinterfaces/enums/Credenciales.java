package com.sura.cotizador.usersinterfaces.enums;

public enum Credenciales {

    USUARIO_COTIZADOR("carlpase"),
    CONTRASEÑA_COTIZADOR("carlpase"),
    USUARIO_POLICY("suragwsu"),
    CONTRASEÑA_POLICY("sura2017");


    private String credencial;


    public String getCredencial() {
        return credencial;
    }

    Credenciales(String credencial){
        this.credencial= credencial;
    }

}
