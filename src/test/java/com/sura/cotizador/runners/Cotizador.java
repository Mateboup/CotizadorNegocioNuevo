package com.sura.cotizador.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/cotizador.feature",
        glue = {"com.sura.cotizador.stepdefinitions"}
)
public class Cotizador {}