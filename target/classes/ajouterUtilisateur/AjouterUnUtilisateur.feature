Feature: Add user
  As an admin i want to add a new user

  Background: Authentification
    Given I navigate to the application
    When I enter the correct username
    And I enter the correct password
    And I click to the button
    Then I connect to the dashbord page
    Given I click to admin button
    When I click to the add button
    And Add user page displayed


  @Add_User
  Scenario: Add user
    Given I click to admin button
    When I click to the add button
    And Add user page displayed
    And I choose the role of the user
    And I put the Name
    And I put the Username
    And I choose the status
    And I put the password
    And I confirm the password
    And I click to the Save button
    Then I got a Succefully message

 
