#Author: epalacios@sistecredito.com

Feature: get all employee
  Like a user I want get employee
  to confirm operation

  Background: set environment
    * url url

  @GetAllEmployees
  Scenario: Get all employees created

    Given path 'employees'
    When method get
    Then status 200
    Then response.data == '#[]'

    * def employeesTypeSchema = read('classpath:get_employees/employees_types.json')
    And match response == read('classpath:get_employees/service_response.json')
    And match response.data[0] == employeesTypeSchema