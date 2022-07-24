
  Feature: Cerrar sesion
    Yo como usuario
    quiero cerrar sesión
    para validar mi cuenta

    Scenario Template: Iniciar Sesión
      Given que David abre la pagina e inicia Sesion con los siguientes datos
        |usuario  |clave  |
        |<usuario>|<clave>|
      When el cierrra sesión

      Then se verá mensaje de LOGOUT OK

      Examples:
      |usuario|clave|
      |standard_user|secret_sauce|
