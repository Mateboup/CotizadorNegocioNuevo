package com.sura.cotizador.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CotizadorPage {

  public static final Target BTN_MENU_PRODUCTOS = Target.the("Desplegar lista de productos").located(By.xpath("//button[@id='dropdownMenuButton']"));
  public static final Target SPN_COTIZADOR = Target.the("Spiner Cotizador").located(By.xpath("//div[@class='loader']"));
  public static final Target LST_MENU_PRODUCTOS = Target.the("Seleccionar producto de la lista").locatedBy("//div[@class='dropdown-menu scrollable-menu show']//a[contains(text(),'{0}')]");
  public static final Target BTN_TIPO_DOCUMENTO = Target.the("Desplegar tipos de documento").located(By.xpath("//span[@class='mat-select-placeholder ng-tns-c30-6 ng-star-inserted'][contains(text(),'Tipo de Documento')]"));
  public static final Target LST_TIPO_DOCUMENTO = Target.the("Seleccionar tipo de documento").locatedBy("//span[@class='mat-option-text'][contains(text(),'{0}')]");
  public static final Target TXT_NUMERO_DOCUMENTO = Target.the("Escribir numero de documento").located(By.xpath("//*[@id='numDocumento']//input"));
  public static final Target BTN_ACEPTAR_DATOS_TOMADOR = Target.the("Aceptar datos tomador").located(By.xpath("//span[@class='mat-button-wrapper'][contains(.,'Aceptar')]"));
  public static final Target BTN_CONTINUAR=Target.the("Boton Continuar").located(By.xpath(""));
  
}

