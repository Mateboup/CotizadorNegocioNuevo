#language: es
Característica:Yo como asesor
  Deseo realizar la cotización de una póliza de autos individual con características específicas desde cotizador
  Para verificar que se genere un valor de prima y un número de cotización para la póliza


  Esquema del escenario: Generación de valor de cotización y número de transacción
    Dado que un asesor se encuentra en cotizador
    Cuando cotice una póliza de autos individual para un tomador identificado con <tipoDocumento> <numeroDocumento>
    Y realice la cotizacion de la póliza con un asesor <codigoAsesor> y medio de venta <medioVenta>
    Y seleccione un plan <tipoPlan> con fecha de inicio <fechaInicio> de vigencia
    Y ingrese la placa <placa>, modelo <modelo>,ciudad de circulacion <ciudad> y vehiculo cero km <ceroKm>
    Entonces se genera un valor de prima y un numero de cotizacion

    Ejemplos:
      |codigoAsesor   |tipoDocumento |numeroDocumento|tipoPlan |fechaInicio| medioVenta |placa |modelo|        ciudad        |ceroKm|
      |10808          |CEDULA        |10258666       |Global   |07/04/2020 | Asesor     |MAT001|2020  |Medellin - ( Antioquia)|SI   |
