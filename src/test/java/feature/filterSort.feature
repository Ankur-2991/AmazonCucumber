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
Feature: User should be able to Filter and Sort products
  I want to use this template for my feature file

  @tag43
  Scenario: Guest should be able to Sort products on the bases of New Arrival
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And Click on search and enter computer
	  And Click on search button
	  When User click on New Arrival
	  Then User should be directed to result page
  
  @tag44
  Scenario: Guest should be able to Sort products on the bases of Customer Rating
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And Click on search and enter computer
	  And Click on search button
	  When User click on three or plus star
	  Then User should be directed to result page
	  
	@tag45
  Scenario: Guest should be able to Sort products on the bases of percentage discount
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And Click on search and enter computer
	  And Click on search button
	  When User click on discounted option
	  Then User should be directed to result page
	  
	@tag46
  Scenario: Guest should be able to Sort products on the bases of brand
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And Click on search and enter computer
	  And Click on search button
	  When User click on dell brand to apply filter
	  Then User should be directed to result page
	  
	 @tag47
  Scenario: Guest should be able to Sort products on the bases of price
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And Click on search and enter computer
	  And Click on search button
	  When User click on price range to apply filter
	  Then User should be directed to result page
	  
	 @tag48
  Scenario: Guest should be able to Sort products on the bases of availability
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And Click on search and enter computer
	  And Click on search button
	  When User click on availability to apply filter
	  Then User should be directed to result page
	  
	  @tag49
  Scenario: Guest should be able to Sort products on the bases of New Arrival
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And Click on search and enter computer
	  And Click on search button
	  When User select new arrival from sort list
	  Then User should be directed to result page
	  
	  @tag50
  Scenario: Guest should be able to Sort products on the bases of Avg. Customer Review
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And Click on search and enter computer
	  And Click on search button
	  When User select Avg. Customer Review from sort list
	  Then User should be directed to result page
	  
	  @tag51
  Scenario: Guest should be able to Sort products on the bases of Featured
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And Click on search and enter computer
	  And Click on search button
	  When User select Featured from sort list
	  Then User should be directed to result page
	  
	  @tag52
  Scenario: Guest should be able to Sort products on the bases of New Arrival filter on the bases of price
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And Click on search and enter computer
	  And Click on search button
	  When User select Featured from sort list
	  And User click on price range to apply filter
	  Then User should be directed to result page
	  
	  @tag53
  Scenario: Guest should be able to Sort products on the bases of New Arrival filter on the bases of price and pagination
    Given User must be on homepage by clicking on url "https://www.amazon.com/"
	  And Click on search and enter computer
	  And Click on search button
	  When User select Featured from sort list
	  And User click on price range to apply filter
	  And click on next button to check next page
	  Then User should be directed to result page