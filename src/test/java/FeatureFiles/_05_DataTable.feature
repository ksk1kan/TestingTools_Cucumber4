Feature: Datatable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should be login succesfuly

    Scenario: Create Country
      And Click on the element in left nav
        | setupOne   |
        | parameters |
        | countries  |

      And Click on the element in the Dialog
        | addButton   |

      And User sending the keys in Dialog content
        | nameInput   | Birkan191211 |
        | codeInput   | 1912Birkan11 |

      And Click on the element in the Dialog
        | saveButton   |

      And Success message should be displayed

      And User delete the item from Dialog
        | Birkan191211 |

      Scenario: Create a Nationality
        And Click on the element in left nav
          | setupOne   |
          | parameters |
          | nationalities  |

        And Click on the element in the Dialog
          | addButton   |

        And User sending the keys in Dialog content
          | nameInput   | Birkan19121 |

        And Click on the element in the Dialog
          | saveButton   |

        And Success message should be displayed

        And User delete the item from Dialog
          | Birkan19121 |

        #TODO : Creat a fee & delete fee