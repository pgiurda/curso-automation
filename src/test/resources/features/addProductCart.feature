#language: es

  Característica: Agregar producto al carrito

    @TEST-1240
    Escenario: Agregar producto al carrito correctamente
      Dado que el usuario ingresa a la home
      Cuando quiere hacer login en la pagina
      Y rellena los campos para hacer login
      Y busca un producto
      Y lo agrega al carrito
      Entonces se verifica que el producto se haya agregado correctamente
      Y se continua con la compra
