# elkin.palacios.qa@gmail.com


Feature: as a quality analyst
  I want to test the purchase flow of the page www.exito.com
  to confirm its correct operation

  @Purchase
  Scenario: Purchase of many products
    Given  actor enters the page
    When select "5" different products
    Then I see the information correct of the purchase
