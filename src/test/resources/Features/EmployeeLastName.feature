Feature: lastname

  @Ridvan
  Scenario:Search for employee last name
    When user enters a valid email and password
    And click on Login Button
    And use logged in successfully
    When user clicks on PIM option
    And user clicks on add Employee option
    And user enters firstname
    And user enters lastname
    And user clicks on save button
    Then employee should be added successfully



