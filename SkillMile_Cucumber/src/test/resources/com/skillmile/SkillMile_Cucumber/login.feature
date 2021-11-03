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
@Regression
Feature: Validate Login functionality
  I want to validate login functionality

  @login
  Scenario: I want to login with valid login and valid password
    Given User is on walmart page
    When User clicks on Sign in
    Then User enters username "dan@gmail.com" and password "test@1234"
    Then User click on sign in
   @LoginData
  Scenario Outline: Title of your scenario outline
    Given User is on walmart site
    When User clicks on Sign in
    Then User lands on Signin page
    Then User enters "<username>" and password "<password>" 
    Then user click Signin Button

    Examples: 
      | username  | password |
      | name1@gmail.com |     436d36e38e | 
      | name2@gmail.com |     7569954ee  |
