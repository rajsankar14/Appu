Feature: Login Application
  As a user
  I want to login to the application

  Scenario Outline: Valid user name and password
    Given I launch the url "https://www.fb.com"
    When I provide "<username>" and "<password>"
    And I click on login button
    Then I should see the login page

    Examples: 
      | username          | password |
      | testmail@test.com | Test@432 |
      |        987654210 | Test@432 |
      | username1          | Test@432 |
     
