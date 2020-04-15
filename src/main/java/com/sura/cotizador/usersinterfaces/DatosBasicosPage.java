package com.sura.cotizador.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosBasicosPage {

    public static final Target BTN_CONTINUAR = Target.the("Continuar").located(By.xpath("//*[@class='mat-button-wrapper'][contains(text(),'Continuar')]"));
    public static final Target TXT_CODIGO_ASESOR = Target.the("Ingresar Codigo de Asesor").located(By.xpath("*//paper-input[@id='codigoAsesor']//input[@id='input']"));
    public static final Target LST_MEDIO_VENTA  = Target.the("Desplegar lista Medio de venta").located(By.xpath("//*[@id='mediosVenta']//*[@class='style-scope paper-dropdown-menu x-scope iron-icon-1']"));
    public static final Target TXT_MEDIO_VENTA  = Target.the("Seleccionar Medio de venta").located(By.xpath("//paper-listbox//paper-item[contains(text(),'{0}')]"));
    public static final Target IMG_PLAN  = Target.the("Seleccionar plan ").located(By.xpath("//div[@class='card-content']//div[@class='horizontal layout wrap responsive-layout']//div[contains(text(),'{0}')]"));
    public static final Target TXT_INICIO_VIGENCIA  = Target.the("Ingresar inicio de vigencia").located(By.xpath("//custom-datepicker-light[@id='feInicioVigencia']//div[@class='label-and-input-container style-scope paper-input-container']"));
    public static final Target TXT_PLACA = Target.the("Ingresar placa").located(By.xpath("//div[@class='responsive-layout']//paper-input[@id='placa']//div[@class='label-and-input-container style-scope paper-input-container']"));
    public static final Target LST_MODELO = Target.the("Lista de modelos de autos ").located(By.xpath(""));
    public static final Target TXT_MODELO = Target.the("Ingresar placa").located(By.xpath("//paper-item[@class='style-scope dropdown-list x-scope paper-item-0'][contains(text(),'{0}')]"));
    public static final Target TXT_FASECOLDA=Target.the("Ingresar Fasecolda").located(By.xpath("//*[@id='fasecolda']//div[@class='label-and-input-container style-scope paper-input-container']"));
    public static final Target TXT_CIUDAD = Target.the("Ingresar Ciudad  ").located(By.xpath("//combo-box[@label='Ciudad']//div[@class='label-and-input-container style-scope paper-input-container']"));

}
