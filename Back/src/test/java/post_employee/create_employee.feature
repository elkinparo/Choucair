#Author: epalacios@sistecredito.com

Feature: create employee
  Like a user I want create employee
  to confirm operation

  Background: set environment

    * url url

  @CreateEmployee
  Scenario: create new employee
    * print url
    Given path 'create'
    And request { "name": "test","salary": "123","age": "23"}
    And method post
    Then status 200
    And match response == read('classpath:post_employee/create_response.json')


