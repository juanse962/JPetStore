# author: Juan Gomez
# date: 20/09/2023

@Pet
Feature: Pet Store

  I as a customer of the store
  I want to search for a pet on the site
  To know what the pet looks like

  Scenario: Validate pet
    Given The user enters the page
    When We are looking for the pet in the store
    Then You should see the pets main page
