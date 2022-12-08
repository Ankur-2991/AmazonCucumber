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
Feature: Sign In page
  I want to use this template for my feature file

  @tag11
  Scenario: Enter unregistered email in email field on sign page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    When User enters unregistered email in email mobile field
    And Click on Continue button
    Then Error should be displayed under email mobile field
    
	@tag12
  Scenario: Enter preregistered email in email field on sign page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    When User enters preregistered email in email mobile field
    And Click on Continue button
    Then user should be directed to password page
    
  @tag13
  Scenario: Enter unregistered mobile number in email field on sign page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    When User enters unregistered mobile number in email mobile field
    And Click on Continue button
    Then Error should be displayed under email mobile field
    
	@tag14
  Scenario: Enter preregistered mobile number in email field on sign page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    When User enters preregistered mobile number in email mobile field
    And Click on Continue button
    Then user should be directed to password page
    
   @tag15
  Scenario: Keep me signin functionality on sign page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    When Keep me signin checkbox is clickable
    And Click on signin button
    Then user should be directed to homepage

    @tag16
  Scenario: your account page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    When User hover on Hello name
    And Clicks on Your Account page
    Then User should be directed to Account page
    
    
    
    