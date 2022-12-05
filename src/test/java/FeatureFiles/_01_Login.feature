#Senaryo;
  #1. siteyi açınız.
  #2. username ve passwordu gönderin ve login butonuna tıklayınız.
  #3. login olduğunuzu doğrulayın.

Feature: Login Functionality

  @SmokeTest
  Scenario: Login with valid username and password

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should be login succesfuly