Feature: API-testing

  Scenario: 1

    When Get user info
    Then Check status code, page and first name

  Scenario: 2

    When Post user info
    Then Check status code, name and job
