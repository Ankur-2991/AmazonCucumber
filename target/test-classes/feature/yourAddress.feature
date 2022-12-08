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
Feature: Your Address page
  I want to use this template for my feature file

 @tag22
  Scenario: Your address page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    When Clicks on Your Adddress page 
    Then User should be directed to Adddress page 
 
 @tag23
  Scenario: Add address page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And Clicks on Your Adddress page
    When Clicks on add Adddress 
    Then User should be directed to add Adddress page   
    
	@tag24
  Scenario: City and empty Name on Add Address page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And Clicks on Your Adddress page
    And Clicks on add Adddress
    When Country should be selected Canada
    And Full name should be empty
    And click on add address
    Then error should be displayed under name   
    
  @tag25
  Scenario: Name on Add Address page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And Clicks on Your Adddress page
    And Clicks on add Adddress
    And Country should be selected Canada
    When Full name should be entered in name field 
    And Phone number should be left empty
    And click on add address
    Then error should be displayed under phone number  
    
  @tag26
  Scenario: Phone number on Add Address page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And Clicks on Your Adddress page
    And Clicks on add Adddress
    And Country should be selected Canada
    And Full name should be entered in name field
    When Phone number should be entered in phone field  
    And leave address field empty
    And click on add address
    Then error should be displayed under address
    
 @tag27
  Scenario: Address on Add Address page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And Clicks on Your Adddress page
    And Clicks on add Adddress
    And Country should be selected Canada
    And Full name should be entered in name field
    And Phone number should be entered in phone field
    When enter address in address field empty  
    And leave city field empty
    And click on add address
    Then error should be displayed city
 
 @tag28
  Scenario: city on Add Address page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And Clicks on Your Adddress page
    And Clicks on add Adddress
    And Country should be selected Canada
    And Full name should be entered in name field
    And Phone number should be entered in phone field
    And enter address in address field empty
    When entry city in city field   
    And enter province in province field
    And click on add address  
    
 @tag29
  Scenario: Postal code field empty on Add Address page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And Clicks on Your Adddress page
    And Clicks on add Adddress
    And Country should be selected Canada
    And Full name should be entered in name field
    And Phone number should be entered in phone field
    And enter address in address field empty
    And entry city in city field
    And enter province in province field
    When leave postal field empty
    And click on add address
    Then error should be displayed on postal field
    
 @tag30
  Scenario: Mark as default address option on Add Address page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And Clicks on Your Adddress page
    And Clicks on add Adddress
    And Country should be selected Canada
    And Full name should be entered in name field
    And Phone number should be entered in phone field
    And enter address in address field empty
    And entry city in city field
    And enter province in province field
    When postal code entered in postal field
    And check make address default 
    And click on add address
    
    
 	@tag31
  Scenario: Delivery Instructions on Add Address page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And Clicks on Your Adddress page
    And Clicks on add Adddress
    And Country should be selected Canada
    And Full name should be entered in name field
    And Phone number should be entered in phone field
    And enter address in address field empty
    And entry city in city field
    And enter province in province field
    And postal code entered in postal field
    And check make address default
    When Call box Instructions
    And  Weekend Delivery
    And click on add address
    Then Address should be saved
    
  @tag32
  Scenario: Delivery Instructions on Add Address page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And user clicks on singin button
    And User enters preregistered mobile number in email mobile field
    And Click on Continue button
    And user enters correct password in password field
    And Keep me signin checkbox is clickable
    And Click on signin button
    And User hover on Hello name
    And Clicks on Your Account page
    And Clicks on Your Adddress page
    And Clicks on add Adddress
    And Country should be selected Canada
    And Full name should be entered in name field
    And Phone number should be entered in phone field
    And enter address in address field empty
    And entry wrong city in city field
    And enter province in province field
    And postal code entered in postal field
    And check make address default
    When Call box Instructions
    And  Weekend Delivery
    And click on add address
    Then suggestions for Address should be provided
    
    
    
    
      