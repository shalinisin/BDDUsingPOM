Feature: Login into application
 
  Scenario: Login with correct username & password
    Given user is on login page
    Then verify title of login page
    And user enters username and password
    Then user lands on homepage
    Then quits the browser
    

  