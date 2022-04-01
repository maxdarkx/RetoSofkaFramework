# language: es
# @Regression
  @FeatureName:crearMensajeBasico
  Característica: crear un mensaje para soporte tecnico
  como cliente del sitio
  necesito enviar un mensaje a soporte tecnico
  para poner una queja

  @ScenarioName:CrearUnMensajeBasico
  Escenario: Crear un mensaje basico
    Dado que el cliente se encuentra en la pagina de inicio
    Cuando el cliente navega hacia la pagina de contacto y escribe su email, selecciona un destinatario y escribe un mensaje
    Entonces el cliente recibe un mensaje de confirmacion de que su mensaje se ha enviado con exito.