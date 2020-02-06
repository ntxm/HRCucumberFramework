@login
Feature: Login Page


@inProgress
Scenario: Login into system with valid credential

When User enter valid username and password
And User click on login button
Then Dashboard should be opened



