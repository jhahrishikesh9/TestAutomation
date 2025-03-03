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
Feature: Validate the Login scenarios
  

  @TC01 @Login @SuccesfullLogin
  Scenario Outline: Login Successfully to the application with correct ID and Password
    Given Launch the browser and the website with correct URL
    And Validate the correct website launched successfully
    And Click on the Login/Signup button successfully 
    When button is clicked validate the new page opens with option to enter email and password
    And Enter correct "<email_id>" and "<password>" click on login button
    Then I validate the login is sucessfull and username is reflected on the page successfully 
    Then Exit the browser
    
    Examples: 
      | email_id  | password |
      | hrishikeshjha2000@gmail.com |     abcd1234 |
      #|email|  pass |
 
