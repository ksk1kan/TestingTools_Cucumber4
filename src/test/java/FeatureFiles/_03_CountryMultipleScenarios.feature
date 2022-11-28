Feature: Country Multi Scenario

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should be login succesfuly
    And Navigate to country page

  Scenario: Create Country
    When create a country
    Then Success message should be displayed

  Scenario: Create a country parameter data
    When Create a country name as "birkanf" code as "ksk1kan35.5"
    Then Success message should be displayed