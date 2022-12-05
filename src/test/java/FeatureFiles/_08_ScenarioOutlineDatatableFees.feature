#  Daha önceki Create a Fee, delete Fee Senaryosunu
#  Aşağıdaki 5 farklı değerler için çalıştırınız.

Feature: Fee Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should be login succesfuly

    @Regression
  Scenario Outline: Create a Fee, delete Fee

    And Click on the element in left nav
      | setupOne   |
      | parameters |
      | feesSetup  |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intCode>  |
      | priorityCode    | <priority> |

    And Click on the element in the Dialog
      | toggleBar |
      | saveButton |

    And Success message should be displayed

    And User delete the item from Dialog
      | <name> |

    And Success message should be displayed

    Examples:
      | name      | code    | intCode   | priority |
      | BirkanFee1 | 0300001 | paypal    | 79009      |
      | BirkanFee2 | 0300420 | applePay  | 79008      |
      | BirkanFee3 | 0570002 | googlePay | 79007      |