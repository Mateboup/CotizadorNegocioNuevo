package com.sura.cotizador.tasks;

import com.sura.cotizador.usersinterfaces.IniciarSesionPage;
import com.sura.cotizador.usersinterfaces.enums.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.sura.cotizador.usersinterfaces.IniciarSesionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class  IniciarSesion implements Task {

    private String nombreDeUsuario;
    private String contrasena;

    public IniciarSesion(String nombreDeUsuario, String contrasena) {

        this.nombreDeUsuario = nombreDeUsuario;
        this.contrasena = contrasena;
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(BTN_EMPLEADO, isEnabled()),
                Click.on(BTN_EMPLEADO),
                Enter.theValue(nombreDeUsuario).into(TXT_NOMBRE_DE_USUARIO),
                Enter.theValue(contrasena).into(TXT_CONTRASENIA),
                Click.on(BTN_INICIAR_SESION)

        );
    }


public static IniciarSesion Con (String nombreDeUsuario, String  contrasena){
return instrumented (IniciarSesion.class, nombreDeUsuario, contrasena);
    }
}
