#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız.
#Daha sonra Bilgileri siliniz
#Yukarıdaki işlemleri Parameter yöntemi ile yapınız.

Feature: Citizenship with scenario Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should be login succesfuly
    And Navigate to CitizenShip page

  Scenario Outline: CitizenShip Create
    When User a CitizenShip name as "<Name>" short name as "<ShortName>"
    Then Success message should be displayed

    When User a CitizenShip name as "<Name>" short name as "<ShortName>"
    Then Already exist message should be displayed

    #When User delete.... TODO
    #Then Success message should be displayed

    Examples:
      | Name      | ShortName |
      | vatBir111 | vatBir11  |
      | vatBir211 | isVat12   |
      | vatBir311 | vatBir13  |
      | vatBir411 | vatBir14  |