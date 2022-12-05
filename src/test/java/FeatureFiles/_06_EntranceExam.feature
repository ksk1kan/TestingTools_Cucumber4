#Senaryo :
#  Exam Formunun Çalışmasını test ediniz
#Senaryo :
#  Exam Formunun Çalışmasını test ediniz
#  1 sınav girişi yapıp
#  sonrasında silmesini yapınız
Feature: Exam Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should be login succesfuly

  Scenario: Create and Delete a Exam
    And Click on the element in left nav
      | entranceExamsOne |
      | setupTwo         |
      | entranceExamsTwo |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | BirkanEx11 |

    And Click on the element in the Form Content
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel      |
      | gradeLevel2     |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And Click on the element in left nav
      | entranceExamsOne |
      | setupTwo         |
      | entranceExamsTwo |

    And User delete the item from Dialog
      | BirkanEx11 |

    Then Success message should be displayed