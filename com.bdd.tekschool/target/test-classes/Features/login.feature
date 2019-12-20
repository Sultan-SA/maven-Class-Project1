
#this is the name of feature
Feature: Login Action

#this is name of scenario
@test 
Scenario: Login test to TekSChool Test Environment 

Given User is TekSchool page
When User Click on Test Environment link
Then User should see Test Environment page

