#  language: es
# @Regression
  @FeatureName:CrearNuevaCuenta
  Característica: crear Nueva Cuenta
  Como cliente en linea
  necesito crear una cuenta
  para poder realizar compras en linea

  @ScenarioName:CrearUnaCuenta
  Escenario: Crear una cuenta
    Dado que el cliente esta en la pagina de inicio
    Cuando el cliente registra sus datos para una cuenta en linea de forma exitosa
    Entonces como resultado el usuario quedara logueado dentro de su respectiva sesion per se.