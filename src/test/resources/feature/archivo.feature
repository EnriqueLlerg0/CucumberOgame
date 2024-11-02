Feature: Proyecto automatizacion de ogames

  Background:
    Given user navigates to google
    When user accept the cookies
    Then user navigates to the page "OGame - ¡El juego de navegador con más éxito del universo!" "Ogame"
    Then user enters his username "enrique.llergo@atmira.com"
    And user enters his password "Usuario1234567890"
    And user clicks on the login button
    And user clicks on the button to access the game

  @testnumero1
  Scenario: prueba1 Recompensas
    Then user select options
    And We inspect the content of the icon with a question mark
    And We claim the reward

  @testnumero2
  Scenario: prueba2 Vision general
    Then user select options "Visión general"
    And We enter each of the options "Mina de cristal"

  @testnumero3
  Scenario: prueba3 Forma de vida
    Then user select options "Forma de vida"
    And improve a building "Sector Residencial"

  @testnumero4
  Scenario:
    Then user select options menuTable

  @testnumero5
  Scenario:
    Then user select options "Instalaciones"
    And user improve a building "Laboratorio de investigación"

  @testnumero6
  Scenario:
    Then user select options "Mercader"
    And user go to Mercado de recursos
    And user go to Subastador
    And user go to Chatarrero
    And user go to ImportExport

  @testnumero7
  Scenario:
    Then user select options "Investigación"
    And user improve "Investigación básica" "Tecnología de hiperespacio"

  @testnumero8
  Scenario:
    Then user select options "Hangar"
    And user builds a "Naves de batalla" "Cazador ligero" "1"

  @testnumero9
  Scenario:
    Then user select options "Defensa"
    And user builds "Cúpula grande de protección" "1"

  @testnumero10
  Scenario:
    Then user select options "Flota"




