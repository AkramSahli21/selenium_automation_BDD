@tag
Feature: Authentification
  As a user i want to sign in

  @Valid_Connxion
  Scenario: Authentification avec identifiants valides
    Given I navigate to the application
    When I enter the correct username
    And I enter the correct password
    And I click to the button
    Then I connect to the dashbord page

 @Invalid_Connxion
  Scenario: Authentification avec identifiants invalides
    Given I navigate to the application
    When I enter an invalid username
    And I enter an invalid password
    And I click to the button
    Then I got an erreur message

  @Identifiants_Vide
  Scenario: Authentification avec identifiants vide
    Given I navigate to the application
    When I leave the fields empty username
    And I leave the fields empty password
    And I click to the button
    Then I received an error message