package com.sura.cotizador.usersinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class IniciarSesionPage {
    public static final Target BTN_EMPLEADO = Target.the("Empleado").located(By.id("ctl00_ContentMain_idTabEmpleado"));
    public static final Target TXT_NOMBRE_DE_USUARIO = Target.the("Nombre de usuario").located(By.xpath("//*[@id='tabEmpleado']/div[2]/input"));
    public static final Target TXT_CONTRASENIA = Target.the("Contraseña").located(By.xpath("//*[@id='tabEmpleado']/div[3]/input"));
    public static final Target BTN_INICIAR_SESION = Target.the("Iniciar sesion").located(By.xpath("//*[@id='tabEmpleado']//div/div/input"));


}
