package com.sura.cotizador.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.sura.cotizador.usersinterfaces.DatosBasicosPage.BTN_CONTINUAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DatosBasicos implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                WaitUntil.the(BTN_CONTINUAR, isVisible()),
                Click.on(BTN_CONTINUAR)
        );


    }

    public static DatosBasicos cliente(){
        return instrumented (DatosBasicos.class);
    }
}
