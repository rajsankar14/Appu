Feature: to check the user enter details 
@tag
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
