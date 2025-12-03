#language: es

Característica: Crear cuenta incorrecta

  @TEST-1238
  Escenario: Crear cuenta
    Dado que el usuario ingresa a la home
    Y el usuario ingresa a registrar una cuenta
    Cuando el usuario no completa el formulario
    Entonces se verifica que la cuenta no se creo correctamente
