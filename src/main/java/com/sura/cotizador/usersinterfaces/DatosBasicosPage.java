package com.sura.cotizador.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosBasicosPage {

    public static final Target BTN_CONTINUAR = Target.the("Continuar").located(By.xpath("//*[@class='mat-button-wrapper'][contains(text(),'Continuar')]"));

}
