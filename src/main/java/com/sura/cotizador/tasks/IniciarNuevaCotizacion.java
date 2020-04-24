package com.sura.cotizador.tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isSelected;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.sura.cotizador.usersinterfaces.CotizadorPage.*;


import com.sura.cotizador.usersinterfaces.CotizadorPage;
import com.sura.cotizador.usersinterfaces.enums.ProductosCotizador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;


public class IniciarNuevaCotizacion implements Task {

  private String tipoIdentificacion;
  private String  numeroIdentificacion;


  public IniciarNuevaCotizacion(String tipoIdentificacion, String numeroIdentificacion){
    this.tipoIdentificacion= tipoIdentificacion;
    this.numeroIdentificacion = numeroIdentificacion;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    actor.attemptsTo(
            //WaitUntil.the(SPN_COTIZADOR, isVisible()),
            WaitUntil.the(BTN_MENU_PRODUCTOS, isPresent()),
            Click.on(BTN_MENU_PRODUCTOS),
            Click.on(LST_MENU_PRODUCTOS.of(ProductosCotizador.SOLUCIONES.getProductosCotizador())),
            Click.on(LST_MENU_PRODUCTOS.of(ProductosCotizador.SEGUROS_AUTOS.getProductosCotizador())),
            Click.on(LST_MENU_PRODUCTOS.of(ProductosCotizador.NUEVO.getProductosCotizador())));

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(LST_TIPO_DOCUMENTO.of(tipoIdentificacion).getCssOrXPathSelector());
    actor.attemptsTo(
            WaitUntil.the(SPN_COTIZADOR, isNotVisible()),
            WaitUntil.the(BTN_TIPO_DOCUMENTO, isCurrentlyEnabled()),
            Click.on(BTN_TIPO_DOCUMENTO),

            Click.on(LST_TIPO_DOCUMENTO.of(tipoIdentificacion)),
            Enter.theValue(numeroIdentificacion).into(TXT_NUMERO_DOCUMENTO),
            Click.on(BTN_ACEPTAR_DATOS_TOMADOR),
            WaitUntil.the(SPN_COTIZADOR, isNotVisible()).forNoMoreThan(10).seconds(),
            Scroll.to(BTN_CONTINUAR),
            Click.on(BTN_CONTINUAR)

    );



  }

  public static IniciarNuevaCotizacion polizaAutos(String tipoIdentificacion, String numeroIdentificacion) {
      return Tasks.instrumented(IniciarNuevaCotizacion.class, tipoIdentificacion, numeroIdentificacion);
  }
}
