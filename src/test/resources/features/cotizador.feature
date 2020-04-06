#language: es
Característica:Yo como asesor
  Deseo realizar la cotización de una póliza de autos individual con características específicas desde cotizador
  Para verificar que se genere un valor de prima y un número de cotización para la póliza


  Esquema del escenario: Generación de valor de cotización y número de transacción
    Dado que un asesor se encuentra en cotizador
    Cuando cotice una póliza de autos individual para un tomador identificado con <tipoDocumento> <numeroDocumento>
    Y realice la cotizacion de la póliza con un asesor <tipoAsesor>
    Y seleccione un plan <tipoPlan> con <cantidadDias> días para <vencerse/expedirse> y un vehículo de tipo <tipoVehiculo> <estadoVehiculo>
    Entonces se genera un valor de prima y un numero de cotizacion

    Ejemplos:
      |tipoAsesor   |tipoDocumento |numeroDocumento|tipoPlan |cantidadDias|vencerse/expedirse|tipoVehiculo|estadoVehiculo |
      |independiente|CEDULA        |10258666       |Global   |0           |expedirse        |Automovil   |cero kilometros|
