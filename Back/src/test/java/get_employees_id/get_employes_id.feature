#Author: epalacios@sistecredito.com

Feature: get employee for id
  Like a user I want get employee
  to confirm operation

  Background: set environment
    * url url

  @GetOneEmployee
  Scenario: Get one employee

    Given path 'employee/1'
    When method get
    Then status 200
    Then response.data == '#[]'

    * def employeesTypeSchema = read('classpath:get_employees_id/employees_types.json')
    And match response.data == employeesTypeSchema
