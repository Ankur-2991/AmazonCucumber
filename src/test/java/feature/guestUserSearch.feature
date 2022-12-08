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
Feature: User should be search and check out products as Guest User
  I want to use this template for my feature file

  @tag37
  Scenario: Guest should be able to browse through products
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    When Click on all button
    And Select comptuer from side menu
    And Select computer components from side menu
    Then Result page should be displayed

  @tag38
  Scenario: Guest should be able to buy products
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    And Click on all button
    And Select comptuer from side menu
    And Select computer components from side menu
    When User should select any product
    And User should be able to click on Buy Now button
    Then User should be directed to checkout page

  @tag39
  Scenario: Search products with keywords
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
    When Click on search and enter <keywords>
    And Click on search button
    Then User should be directed to result page
      | keywords                |
      | Computer                |
      | Ryzen 5 5625U processor |
      | hard dri                |
      |            064132031103 |
      |                 0641320 |

	@tag40
	  Scenario: Search products with computer keyword and details of product should be displayed
	    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	    When Click on search and enter computer
	    And Click on search button
	    Then User should be directed to result page
			And Details of the product should be displayed
	    
	@tag41
	  Scenario: To check number of products displayed on the search page
	    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	    When Click on search and enter computer
	    And Click on search button
	    Then User should be directed to result page
			And Check number of product of displayed
	    
	@tag42
	  Scenario: To check pagination on the search page
	    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	    When Click on search and enter computer
	    And Click on search button
	    And User should be directed to result page
	    Then click on next button to check next page
			And Check number of product of displayed on second page   
	    