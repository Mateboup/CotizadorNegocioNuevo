package com.sura.cotizador.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosBasicosPage {

    public static final Target BTN_CONTINUAR = Target.the("Continuar").located(By.xpath("//*[@class='mat-button-wrapper'][contains(text(),'Continuar')]"));
    public static final Target LBL_CODIGO_ASESOR  = Target.the("Ingresar Codigo de Asesor").located(By.xpath("//div[@class='responsive-layout end-gt-xs layout maincontainer style-scope componente-asesor']//paper-input[@id='codigoAsesor']//div[@class='label-and-input-container style-scope paper-input-container']"));
    public static final Target LST_MEDIO_VENTA  = Target.the("Seleccionar Medio de venta").located(By.xpath("//*[@id=\"trigger\"]/div/paper-input/paper-input-container/div[2]/iron-icon"));
    public static final Target IMG_PLAN  = Target.the("Seleccionar plan ").located(By.xpath("//div[@class='card-content']//div[@class='horizontal layout wrap responsive-layout']//div[contains(text(),'{0}')]"));
    public static final Target TXT_INICIO_VIGENCIA  = Target.the("Ingresar inicio de vigencia").located(By.xpath("//custom-datepicker-light[@id='feInicioVigencia']//div[@class='label-and-input-container style-scope paper-input-container']"));
    public static final Target TXT_PLACA = Target.the("Ingresar placa").located(By.xpath("//div[@class='responsive-layout']//paper-input[@id='placa']//div[@class='label-and-input-container style-scope paper-input-container']"));
    public static final Target LST_MODELO = Target.the("Lista de modelos de autos ").located(By.xpath(""));
    public static final Target TXT_MODELO = Target.the("Ingresar placa").located(By.xpath("//paper-item[@class='style-scope dropdown-list x-scope paper-item-0'][contains(.,'{0}')]"));
    public static final Target TXT_CIUDAD = Target.the("Ingresar Ciudad  ").located(By.xpath("//combo-box[@label='Ciudad']//div[@class='label-and-input-container style-scope paper-input-container']"));

}
