@activity1
  Feature: Opening a Webpage

  Scenario: User want to search something
    Given User is on Google homePage
    When  User types in Cheese and hits ENTER
    Then  Show how many search results were shown
    And   Close the browser