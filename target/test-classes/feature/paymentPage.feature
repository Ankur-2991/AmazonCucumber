#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Payment Module
  I want to use this template for my feature file

  @tag36
  Scenario: Change password on login and security page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And User click on Your Payment tab
   	When User clicks on add payment method
   	And User click add credit or debit card
   	And User should type card number in card number field
   	And User should type name in card name field
   	And User should enter expiry date
   	And User should enter CVV in the cvv field
    And click on add card button
    And click on Add default
    Then click on save card button
    And Card should be saved in the Account
    
    
    