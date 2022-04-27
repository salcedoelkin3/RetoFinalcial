#language:en
#Autor: Elkin Salcedo

@historia
Feature: como usuario quiero registrarme en la pagina automation demo site

  @escenario
  Scenario Outline: realizar registro de usuario
    Given que Elkin quiere registrarse en la pagina
    When el realiza el registro en la pagina
      | name   | last   | addres   | email   | phone   | password   | confirm   |
      | <name> | <last> | <addres> | <email> | <phone> | <password> | <confirm> |
    Then verifica que se presente en pantalla el mensaje Double Click on Edit icon to EDIT the Table Row
      | verificar   |
      | <verificar> |
    Examples:
      | name  | last    | addres    | email       | phone      | password | confirm | verificar                                       |
      | Elkin | Salcedo | kr3 12-20 | ekn@hot.com | 3000001111 | xxyz     | xxyz    | Double Click on Edit icon to EDIT the Table Row |