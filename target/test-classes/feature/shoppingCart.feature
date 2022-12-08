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
Feature: Shopping Cart module
  I want to use this template for my feature file

 @tag54
  Scenario: User should be able to check out by selecting product
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And Click on search and enter computer
	  And Click on search button
	  And User should select any product
	  When User clicks on add in cart button
	  And User clicks move to carts
	  And User should click on proceed on checkout
	  Then User should be directed to checkout page
	  
	   @tag55
  Scenario: verify product details in the cart
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And Click on search and enter computer
	  And Click on search button
	  And User should select any product
	  When User clicks on add in cart button
	  And User clicks move to carts
	  Then verify details of the product in cart 
	  
	   @tag56
  Scenario: Add same product again in the cart
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And Click on search and enter computer
	  And Click on search button
	  And User should select any product
	  And User clicks on add in cart button
	  And Click on search and enter computer
	  And Click on search button
	  And User should select any product
	  And User clicks on add in cart button
	  When User clicks move to carts
	  Then quantity should be increased
	  
	   @tag57
  Scenario: Add different products in the cart
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And Click on search and enter computer
	  And Click on search button
	  And User should select any product
	  And User clicks on add in cart button
	  And Click on search and enter computer
	  And Click on search button
	  And User should select different product
	  And User clicks on add in cart button
	  When User clicks move to carts
	  Then User should be directed to checkout page
	  
	  @tag58
  Scenario: products should be in the cart even after closing the website
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And Click on search and enter computer
	  And Click on search button
	  And User should select any product
	  And User clicks on add in cart button
	  And Click on search and enter computer
	  And Click on search button
	  And User should select different product
	  And User clicks on add in cart button
	  And User clicks move to carts
	  When User closes the browser
	  And User opens website again
	  And User checks the cart
	  Then Cart should contain products
	  
	  @tag59
  Scenario: Remove all products in the cart
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And Click on search and enter computer
	  And Click on search button
	  And User should select any product
	  And User clicks on add in cart button
	  And Click on search and enter computer
	  And Click on search button
	  And User should select different product
	  And User clicks on add in cart button
	  And User clicks move to carts
	  When Delete all the products in the cart
	  Then Cart should be empty
	  
	  
	  
	  
	  