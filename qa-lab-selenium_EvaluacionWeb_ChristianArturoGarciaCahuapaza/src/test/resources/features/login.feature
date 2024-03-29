#language: es
@testfeature
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Escenario: Iniciar sesión
    Dado que me encuentro en la página de login de Saucedemo
    Cuando inicio sesión con las credenciales usuario: "standard_user" y contraseña: "secret_sauce"
    Entonces valido que debería aparecer el título de "PRODUCTS"
    Y también valido que al menos exista un item
    Y agrego un item al carrito de compras
    Y reviso que el carrito de compras tenga un item agregado
    Y valido que el item agregado se llama "Sauce Labs Bike Light"


