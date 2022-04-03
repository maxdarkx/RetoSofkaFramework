# language: es
  @FeatureName:AddToCart
  Característica: Añadir al carrito de compras
    como cliente registrado de la pagina
    necesito añadir al carrito de compras
    para comprar productos de la pagina
  @ScenarioName:AñadirAlCarritoDesdeLaPaginaPrincipal
    Escenario: Añadir al carrito desde la pagina principal
      Dado que el cliente se encuentra en la pagina de inicio y ha hecho login en su cuenta
      Cuando el cliente selecciona algunos articulos y estos se agregan al carrito de compras
      Y el cliente hace checkout
      Entonces el cliente adquiere los articulos

    @ScenarioName:AñadirAlCarritoDesdeLasVistasAuxiliares
    Escenario: Añadir al carrito desde las vistas auxiliares
      Dado que el cliente se encuentra en la pagina de inicio y ha hecho login en su cuenta
      Cuando el cliente selecciona algunos articulos desde sus vistas detalladas y estos se agregan al carrito de compras
      Y el cliente hace checkout
      Entonces el cliente adquiere los articulos