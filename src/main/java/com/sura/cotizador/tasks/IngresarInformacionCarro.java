package com.sura.cotizador.tasks;

import com.sura.cotizador.usersinterfaces.DatosBasicosPage;
import com.sura.cotizador.usersinterfaces.enums.DatosPoliza;
import com.sura.cotizador.usersinterfaces.enums.ProductosCotizador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sura.cotizador.usersinterfaces.CotizadorPage.LST_MENU_PRODUCTOS;

public class IngresarInformacionCarro implements Task {

    private IngresarInformacionCarro ingresarInformacionCarro;
    private String placa;
    private String modelo;
    private String ciudad;
    private String ceroKm;

    public IngresarInformacionCarro(String placa,String modelo ,String ciudad, String ceroKm){
        this.placa=placa;
        this.placa=modelo;
        this.placa=ciudad;
        this.placa=ceroKm;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(placa).into(DatosBasicosPage.TXT_PLACA),
                Enter.theValue(modelo).into(DatosBasicosPage.TXT_MODELO),
                Enter.theValue(DatosPoliza.FASECOLDA.getDatosPoliza()).into(DatosBasicosPage.TXT_FASECOLDA),
                Enter.theValue(ciudad).into(DatosBasicosPage.TXT_CIUDAD)
        );




    }

    public static IngresarInformacionCarro datosCarro(String placa, String modelo, String ciudad, String ceroKm) {
        return Tasks.instrumented(IngresarInformacionCarro.class,placa,modelo,ciudad,ceroKm);
    }
}
