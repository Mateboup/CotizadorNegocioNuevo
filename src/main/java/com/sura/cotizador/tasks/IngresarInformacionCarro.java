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
import static com.sura.cotizador.usersinterfaces.DatosBasicosPage.*;

public class IngresarInformacionCarro implements Task {

    private IngresarInformacionCarro ingresarInformacionCarro;
    private String placa;
    private String modelo;
    private String ciudad;
    private String ceroKm;

    public IngresarInformacionCarro(String placa,String modelo ,String ciudad, String ceroKm){
        this.placa=placa;
        this.modelo=modelo;
        this.ciudad=ciudad;
        this.ceroKm=ceroKm;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(placa).into(TXT_PLACA));
        actor.attemptsTo(Click.on(LST_MODELO));
        //actor.attemptsTo(Click.(""));
        actor.attemptsTo(Enter.theValue(DatosPoliza.FASECOLDA.getDatosPoliza()).into(DatosBasicosPage.TXT_FASECOLDA));
        actor.attemptsTo(Click.on(TXT_CIUDAD));
        actor.attemptsTo(Enter.theValue("Medellín - (Antioquia)").into(TXT_CIUDAD));


        actor.attemptsTo(Enter.theValue(modelo).into(DatosBasicosPage.TXT_MODELO));

        actor.attemptsTo(Enter.theValue(ciudad).into(DatosBasicosPage.TXT_CIUDAD));




    }

    public static IngresarInformacionCarro datosCarro(String placa, String modelo, String ciudad, String ceroKm) {
        return Tasks.instrumented(IngresarInformacionCarro.class,placa,modelo,ciudad,ceroKm);
    }
}
