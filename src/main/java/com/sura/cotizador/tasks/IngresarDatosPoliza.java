package com.sura.cotizador.tasks;

import com.sura.cotizador.usersinterfaces.DatosBasicosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sura.cotizador.usersinterfaces.DatosBasicosPage.LBL_CODIGO_ASESOR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarDatosPoliza implements Task {
    private DatosBasicosPage datosBasicosPage;
    private String codigoAsesor;
    private String medioVenta;

    public IngresarDatosPoliza (String codigoAsesor, String medioVenta){
        this.codigoAsesor=codigoAsesor;
        this.medioVenta=medioVenta;

    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_CODIGO_ASESOR,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LBL_CODIGO_ASESOR),
                Enter.theValue(codigoAsesor).into(LBL_CODIGO_ASESOR)
        );

    }
    public static IngresarDatosPoliza  datosPoliza(String codigoAsesor, String medioVenta) {
        return Tasks.instrumented(IngresarDatosPoliza.class,codigoAsesor,medioVenta);
    }
}
