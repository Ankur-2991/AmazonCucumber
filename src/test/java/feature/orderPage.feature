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
Feature: Order page
  I want to use this template for my feature file

@tag17
  Scenario: your order page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    When Clicks on Your Order page
    Then User should be directed to Order page

@tag18
  Scenario: past order of this year
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And Clicks on Your Order page
    When Select this year from dropdown 
    Then User should be displayed past orders from this year

@tag19
  Scenario: past order that are Archieved
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And Clicks on Your Order page
    When Select Archived order from dropdown 
    Then User should be displayed Archived orders    
    
@tag20
  Scenario: Buy Again module in order page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And Clicks on Your Order page
    When Select Buy Again 
    Then User should be products under buy again tab     
    
@tag21
  Scenario: Not Yet Shipped module in order page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And Clicks on Your Order page
    When Select Not Yet Shipped 
    Then User should be products under Not Yet Shipped tab         
    
@tag22
  Scenario: Cancelled Order module in order page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And Clicks on Your Order page
    When Select Cancelled Order 
    Then User should be products under Cancelled Order tab         
    
    
    
    
    
    