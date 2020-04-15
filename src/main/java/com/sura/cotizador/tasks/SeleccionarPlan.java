package com.sura.cotizador.tasks;

import com.sura.cotizador.usersinterfaces.DatosBasicosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SeleccionarPlan implements Task {

    private DatosBasicosPage datosBasicosPage;
    private String tipoPlan;
    private String inicioVigencia;

    public SeleccionarPlan(String tipoPlan,String inicioVigencia){
        this.tipoPlan=tipoPlan;
        this.inicioVigencia=inicioVigencia;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(datosBasicosPage.IMG_PLAN),
            Enter.theValue(inicioVigencia).into(datosBasicosPage.TXT_INICIO_VIGENCIA)

    );

    }
    public static SeleccionarPlan datosPlan(String tipoPlan, String inicioVigencia) {
        return Tasks.instrumented(SeleccionarPlan.class,tipoPlan,inicioVigencia);
    }
}
