#language: es

Característica: Login incorrecto

  @TEST-1237
  Escenario: Hacer login incorrecto
    Dado que el usuario ingresa a la home
    Cuando quiere hacer login en la pagina
    Y rellena los campos con datos invalidos para hacer login
    Entonces no se loguea correctamente
