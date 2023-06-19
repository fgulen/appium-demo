@wip
Feature: Login feature

  Scenario: Login with etsy credentials (positive)
    Given use clicks on get started
    When user logs in with etsy credentials
    Then user verifies that etsy logo is displayed