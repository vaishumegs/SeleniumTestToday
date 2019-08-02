Feature: Login

This feature file describes about the login information....

Background:
Given enduser is on the login page

Scenario: Successful login
When enduser enters the valid credentials and click on submit button
Then user does successfull login


Scenario: unSuccessful login
When enduser enters invalid credentials and click on submit button
Then error page is loaded




