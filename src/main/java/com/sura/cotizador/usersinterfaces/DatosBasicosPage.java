package com.sura.cotizador.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class DatosBasicosPage {

    public static final Target BTN_CONTINUAR = Target.the("Continuar").located(By.xpath("//*[@class='mat-button-wrapper'][contains(text(),'Continuar')]"));
    public static final Target TXT_CODIGO_ASESOR = Target.the("Ingresar Codigo de Asesor").located(By.xpath("*//paper-input[@id='codigoAsesor']//input[@id='input']"));
    public static final Target LST_MEDIO_VENTA  = Target.the("Desplegar lista Medio de venta").located(By.xpath("//*[@id='mediosVenta']//*[@class='style-scope paper-dropdown-menu x-scope iron-icon-1']"));
    //public static final Target TXT_MEDIO_VENTA  = Target.the("Seleccionar Medio de venta").located(By.xpath("//paper-listbox//paper-item[contains(text(),'{0}')]"));
    public static final Target TXT_MEDIO_VENTA  = Target.the("Sin parametrizar Medio de venta").located(By.xpath("//*[@id=\'listbox\']/paper-item[8]"));
    public static final Target IMG_PLAN  = Target.the("Seleccionar plan ").located(By.xpath("//div[@class='card-content']//div[@class='horizontal layout wrap responsive-layout']//div[contains(text(),'Global')]"));
    public static final Target TXT_INICIO_VIGENCIA  = Target.the("Ingresar inicio de vigencia").located(By.xpath("//*[@id=\"feInicioVigencia\"]//*[@id=\"input\"]"));
    public static final Target TXT_PLACA = Target.the("Ingresar placa").located(By.xpath("//div[@class='card-content']//input[@aria-labelledby='paper-input-label-42']"));
    public static final Target LST_MODELO = Target.the("Lista de modelos de autos ").located(By.xpath("//*[@id=\"modelo\"]//*[@id=\"trigger\"]/div/paper-input/paper-input-container/div[2]/iron-icon"));
    public static final Target TXT_MODELO = Target.the("Ingresar placa").located(By.xpath("//paper-item[@class='style-scope dropdown-list x-scope paper-item-0'][contains(text(),'{0}')]"));
    public static final Target TXT_FASECOLDA=Target.the("Ingresar Fasecolda").located(By.xpath("//div[@class='card-content']//input[@aria-labelledby='paper-input-label-44']"));
    public static final Target LST_TIPO_SERVICIO = Target.the("Desplegar lista de tipo de servicio").located(By.xpath("//div[@class='card-content']//input[@aria-labelledby='paper-input-label-47']"));
    public static final Target TXT_TIPO_SERVICIO = Target.the("Seleccionar tipo de servicio").located(By.xpath(""));
    public static final Target TXT_CIUDAD = Target.the("Ingresar Ciudad  ").located(By.xpath("//combo-box[@label='Ciudad']//div[@class='label-and-input-container style-scope paper-input-container']"));

}
