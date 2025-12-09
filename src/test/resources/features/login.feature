#language: es

@regression
Característica: Login

  @TEST-1236
  Escenario: Hacer login existoso
    Dado que el usuario ingresa a la home
    Cuando quiere hacer login en la pagina
    Y rellena los campos para hacer login
    Entonces se loguea correctamente

  @TEST-1237
  Escenario: Hacer login incorrecto
    Dado que el usuario ingresa a la home
    Cuando quiere hacer login en la pagina
    Y rellena los campos con datos invalidos para hacer login
    Entonces no se loguea correctamente