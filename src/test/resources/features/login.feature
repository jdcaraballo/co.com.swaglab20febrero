
  Feature: Iniciar sesion
    Yo como usuario
    quiero iniciar sesión
    para validar mi cuenta

    Scenario Template: Iniciar Sesión
      Given que David abre la pagina
      When el inicia sesión con los siguientes datos
        |usuario  |clave  |
        |<usuario>|<clave>|
      Then se verá mensaje de LOGIN OK

      Examples:
      |usuario|clave|
      |standard_user|secret_sauce|
