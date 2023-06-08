#Author: epalacios@sistecredito.com

Feature: update employee
  Like a user I want update employee
  to confirm operation

  Background: set environment

    * url url

  @UpdateEmployee
  Scenario: update  employee
    Given path 'update/21'
    And param id = 25
    And request { "name": "test","salary": "123","age": "23"}
    When method put
    Then status 200
    And match response == read('classpath:put_employess/update_response.json')


