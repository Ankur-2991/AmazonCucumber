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
Feature: Signup page

  @tag1
  Scenario: Clicking on Signup button on Homepage
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    When User click on Start Here button
    Then User should be directed to SignUp page

  @tag2
  Scenario: Leave Name field empty on Register page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And User click on Start Here button
    When User leaves name field empty
    And Click on Continue button
    Then Error should be displayed under Name field

  @tag3
  Scenario: Leave Name field empty on Register page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And User click on Start Here button
    When User enters name in name field
    And Click on Continue button
    Then Error should not be displayed under Name field

  @tag4
  Scenario: Leave Mobile field empty on Register page
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And User click on Start Here button
    And User enters name in name field
    When User does not enters mobile number in mobile field
    And Click on Continue button
    Then Error should not be displayed under mobile field

  @tag5
  Scenario: Mobile number is entered and verify mobile button get activated
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And User click on Start Here button
    And User enters name in name field
    When User enters mobile number in mobile field
    And Click on password field
    Then verify mobile button should be active

  @tag6
  Scenario: Email is entered and verify email button get activated
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And User click on Start Here button
    And User enters name in name field
    When User enters email in mobile field
    And Click on password field
    Then verify email button should be active

  @tag7
  Scenario: Entering wrong password in password field
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And User click on Start Here button
    And User enters name in name field
    And User enters email in mobile field
    When User type wrong <password> in password field
    And Click on Continue button
    Then Error should be displayed under password field
      | password |
      | Ankur    |
      | Bansal   |

  @tag8
  Scenario: Entering right password in password field
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And User click on Start Here button
    And User enters name in name field
    And User enters email in mobile field
    When User type correct password in password field
    And Click on Continue button
    Then Error should not be displayed under password field
   
   @tag9
  Scenario: Entering same password in password again field
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And User click on Start Here button
    And User enters name in name field
    And User enters email in mobile field
    And User type correct password in password field
    When User type same password in reenter password field
    And Click on Continue button
    Then Error should not be displayed under reenter password field 
    
    @tag10
  Scenario: Entering different password in password again field
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And User click on Start Here button
    And User enters name in name field
    And User enters email in mobile field
    And User type correct password in password field
    When User type different password in reenter password field
    And Click on Continue button
    Then Error should be displayed under reenter password field 
    
  

    
    
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
