#language: es

@regression
Característica: Log-out

  @TEST-1239
  Escenario: Hacer log-out existoso
    Dado que el usuario ingresa a la home
    Cuando quiere hacer login en la pagina
    Y rellena los campos para hacer login
    Y vuelve al dropdown para desloguearse
    Entonces se realiza el logout correctamente