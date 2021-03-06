package com.sura.cotizador.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CotizadorPage {

  public static final Target BTN_MENU_PRODUCTOS = Target.the("Desplegar lista de productos").located(By.xpath("//button[@id='dropdownMenuButton']"));
  public static final Target SPN_COTIZADOR = Target.the("Spiner Cotizador").located(By.xpath("//div[@class='loader']"));
  public static final Target LST_MENU_PRODUCTOS = Target.the("Seleccionar producto de la lista").locatedBy("//div[@class='dropdown-menu scrollable-menu show']//a[contains(text(),'{0}')]");
  public static final Target BTN_TIPO_DOCUMENTO = Target.the("Desplegar tipos de documento").located(By.xpath("//*[@id=\"mat-select-0\"]/div/div[2]"));
  public static final Target LST_TIPO_DOCUMENTO = Target.the("Seleccionar tipo de documento").locatedBy("//div[@class='ng-trigger ng-trigger-transformPanel ng-tns-c17-3 mat-select-panel mat-primary ng-star-inserted']//span[contains(text(),'{0}')]");
  public static final Target TXT_NUMERO_DOCUMENTO = Target.the("Escribir numero de documento").located(By.xpath("//input[@id='mat-input-1']"));
  public static final Target BTN_ACEPTAR_DATOS_TOMADOR = Target.the("Aceptar datos tomador").located(By.xpath("//span[@class='mat-button-wrapper'][contains(.,'Aceptar')]"));
  public static final Target BTN_CONTINUAR = Target.the("Continuar Juanes").located(By.xpath("//div[@class=\"container-fluid container-cliente\"]/button"));

}
