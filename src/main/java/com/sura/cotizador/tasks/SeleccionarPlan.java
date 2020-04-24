package com.sura.cotizador.tasks;

import com.sura.cotizador.usersinterfaces.DatosBasicosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sura.cotizador.usersinterfaces.CotizadorPage.LST_TIPO_DOCUMENTO;
import static com.sura.cotizador.usersinterfaces.DatosBasicosPage.IMG_PLAN;
import static com.sura.cotizador.usersinterfaces.DatosBasicosPage.TXT_INICIO_VIGENCIA;

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
        System.out.println(IMG_PLAN);
    actor.attemptsTo(Click.on(IMG_PLAN));
    actor.attemptsTo(Click.on(TXT_INICIO_VIGENCIA));
    actor.attemptsTo(Enter.theValue(inicioVigencia).into(TXT_INICIO_VIGENCIA));


    }
    public static SeleccionarPlan datosPlan(String tipoPlan, String inicioVigencia) {
        return Tasks.instrumented(SeleccionarPlan.class,tipoPlan,inicioVigencia);
    }
}
