package com.sura.cotizador.tasks;

import com.sura.cotizador.usersinterfaces.DatosBasicosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.SendKeys;

import static com.sura.cotizador.usersinterfaces.CotizadorPage.LST_TIPO_DOCUMENTO;
import static com.sura.cotizador.usersinterfaces.CotizadorPage.SPN_COTIZADOR;
import static com.sura.cotizador.usersinterfaces.DatosBasicosPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class    IngresarDatosAsesor implements Task {
    private DatosBasicosPage datosBasicosPage;
    private String codigoAsesor;
    private String medioVenta;

    public IngresarDatosAsesor(String codigoAsesor, String medioVenta){
        this.codigoAsesor=codigoAsesor;
        this.medioVenta=medioVenta;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo( WaitUntil.the(TXT_CODIGO_ASESOR, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TXT_CODIGO_ASESOR),
                (Enter.theValue(codigoAsesor).into(TXT_CODIGO_ASESOR)),
                (Click.on(LST_MEDIO_VENTA)),
                WaitUntil.the(TXT_MEDIO_VENTA, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LST_MEDIO_VENTA.of(medioVenta)));
                //(Click.on(TXT_MEDIO_VENTA)),
                //Click.on(TXT_MEDIO_VENTA));

    }
    public static IngresarDatosAsesor datosPoliza(String codigoAsesor, String medioVenta) {
        return Tasks.instrumented(IngresarDatosAsesor.class,codigoAsesor,medioVenta);
    }
}
