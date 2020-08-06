#Author: Mark Boz.email@your.domain.com

@sprintAI-3
Feature: Add Employee Dependents

 Background: 
    Given user is logged with valid admin credentials
    And user navigates to employee List
    
    Scenario Outline: Adding employee dependents
    And user click on Dependents section
    When user click on Add button
    And user add dependents
    Then "<Name>", "<Relationship>" and "<DOB>" is added successfully

    Examples: 
      | Name         | Relationship | DOB        |
      | Mark Boz     | Child        | 12.10.2015 |
      | Micheal Boz  | Child        | 12.10.2010 |
      | Angelina Boz | Wife         | 01.01.1990 |
