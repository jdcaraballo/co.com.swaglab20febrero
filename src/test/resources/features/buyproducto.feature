Feature: Compra de producto
  Yo como usuario de la pagina
  quiero comprar producto
  para validar mi compra

  Scenario Template: Comprar producto
    Given que el inicia sesion con los datos
      |usuario  |clave  |
      |<usuario>|<clave>|

    When el compra el producto Test.allTheThings
      |name|lastName|code|
      |David|Caraballo|12345|
    Then se vera mensaje de compra exitosa




    Examples:
      |usuario      |clave       |
      |standard_user|secret_sauce|

#      |name|lastName|code|
#      |David|Caraballo|12345|

#      |orden|
#      |NAME (Z TO A)      |
#      |NAME (A TO Z)      |
#      |Price (low to high)|
#      |Price (high to low)|

