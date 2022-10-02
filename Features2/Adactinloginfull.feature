@tag
Feature: Login functionality
  

  @tag1
  Scenario: To verify the login functionality
    Given To launch the  browser
    And To launch Adactinhotel booking user  login page 
    When user enter the username
    And  user enter the password
    And  To click the login option
    Then naviagte the search hotel page 
    
    @tag2
    Scenario: User  search the hotel
    Given user select the location of hotel 
    And user select the hotel name
    And To select the roomtype
    And To select the no of rooms 
    When user enter the check in date
    And user enter the check out date 
    And To select the Adults per room
    And To select the children per room 
    And click on the search button 
    
    @tag3
    Scenario: I  select the booked hotel
    Given user select the hotel 
    When user click the continue button 
    Then It should naviagte the Book a hotel page dashboard 
    
    @tag4
    Scenario: To user enter the personals details
    Given user enter the first name 
    And User enter the lastname
    And user To enter the Billing address
    And To enter the credit card number 
    And To select the card type
    And select the expiry month
    And select the expiry date 
    And user enter the CVV nummber
    And click the booknow button
    Then It should navigate the booking confirmation page 
    
    
    @tag5
    
    Scenario: user take screenshot to evaluvate 
    When user take screen shot 
    Then user close the driver 
    
