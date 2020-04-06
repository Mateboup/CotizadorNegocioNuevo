package com.sura.cotizador.stepdefinitions;

import com.sura.cotizador.tasks.IniciarSesion;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class Hooks {
	
	@Managed(driver="chrome")
	private WebDriver suNavegador;

	
	@Before
	public void configuracionInicial() {

		OnStage.setTheStage(new OnlineCast());
		theActorCalled("Asesor");
    }
}
