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
Feature: Login and Security Page
  I want to use this template for my feature file

  
  @tag33
  Scenario: Navigation to login and security page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    When User click on login and security tab
    Then User is directed to login and security page
    
  @tag34
  Scenario: Edit name on login and security page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And User click on login and security tab
    When User clicks on edit besides the name field
    And User is directed to change the name page
    And Change the name and clicks save
    Then Name is changed on the Account
    
  @tag35
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
    And User click on login and security tab
    When User clicks on edit besides the password field
    And User is directed to change the password page
    And Change the password and clicks save
    Then password is changed on the Account
    
  