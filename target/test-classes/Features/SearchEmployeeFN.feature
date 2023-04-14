Feature: Search employee first name

  @Regina
  Scenario: Search employee by first name
    #Given the user navigates to the url
    When user enters a valid email and password
    And click on Login Button
    And use logged in successfully
    When user clicks on PIM option
    And search employee by first name
    #And close the browser
