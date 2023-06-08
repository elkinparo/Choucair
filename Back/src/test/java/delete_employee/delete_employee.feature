#Author: epalacios@sistecredito.com

Feature: delete employee
  Like a user I want delete employee
  to confirm operation

  Background: set environment
    * url url
  @DeleteEmployee
  Scenario: delete employee
    Given path 'delete/2'
    When method delete
    Then status 200
    And match response == read('classpath:delete_employee/delete_response.json')


