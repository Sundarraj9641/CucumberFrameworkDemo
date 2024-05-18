Feature: Login Action
#gherkin syntax bdd framework 
Scenario: Successful Login with Valid Credentials
Given User is on Registration Page
When User able to enter details
And User enters UserName and Password
Then Message displayed Login Successfully
Scenario: Successful Logout
When User Logout from the Application
Then Message displayed Logout Successfully