package com.sura.cotizador.stepdefinitions;

import com.sura.cotizador.tasks.DatosBasicos;
import com.sura.cotizador.tasks.IngresarDatosPoliza;
import com.sura.cotizador.tasks.IniciarNuevaCotizacion;
import com.sura.cotizador.tasks.IniciarSesion;
import com.sura.cotizador.usersinterfaces.enums.Credenciales;
import com.sura.cotizador.usersinterfaces.enums.Urls;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Dati;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

//import static com.sura.cotizador.utils.ValoresConstantes.CARLPASE;
//import static com.sura.cotizador.utils.ValoresConstantes.COTIZADOR_URL;
import static com.sura.cotizador.usersinterfaces.enums.Credenciales.CONTRASEÑA_COTIZADOR;
import static com.sura.cotizador.usersinterfaces.enums.Credenciales.USUARIO_COTIZADOR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CotizadorStepDefinitions {

    @Given("^que un asesor se encuentra en cotizador$")
    public void que_un_asesor_se_encuentra_en_cotizador(){
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Urls.COTIZADOR.getUrl()));
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.Con(USUARIO_COTIZADOR.getCredencial(),CONTRASEÑA_COTIZADOR.getCredencial()));
    }

    @When("^cotice una póliza de autos individual para un tomador identificado con (.*) (.*)$")
    public void cotice_una_pliza_de_autos_individual_para_un_tomador_identificado_con_(String tipoDocumento, String numeroDocumento) {
        theActorInTheSpotlight().attemptsTo(
                IniciarNuevaCotizacion.polizaAutos(tipoDocumento,numeroDocumento));
    }
    @And("^realice la cotizacion de la póliza con un asesor (.*) y medio de venta (.*)$")
    public void realice_la_cotizacion_de_la_poliza_con_un_asesor(String codigoAsesor, String medioVenta){

        theActorInTheSpotlight().attemptsTo(IngresarDatosPoliza.datosPoliza(codigoAsesor,medioVenta));

    }

    @And("^seleccione un plan (.*) con fecha de inicio (.*) de vigencia$")
    public void seleccione_un_Global_con_días_expedirse_y_un_vehículo_de_tipo_Automovil_nuevo(String tipoPlan, String inicioVigencia)  {
    }

    @And("^ingrese la placa (.*), modelo (.*),ciudad de circulacion (.*) y vehiculo cero km (.*)$")
    public void ingrese_placa_modelo_ciudad_y_vechiculo_si_es_0_km(String placa, String modelo,String ciudad, String ceroKm)  {

    }


    @Then("^se genera un valor de prima y un numero de cotizacion$")
    public void se_genera_un_valor_de_prima_y_un_numero_de_cotizacion(){
    }


}
