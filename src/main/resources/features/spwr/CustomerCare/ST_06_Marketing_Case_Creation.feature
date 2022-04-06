Feature: Smoke Test Case Creation

#Author: chdayao@sunpowercorp.com
#Date Created: 4/05/2022
#Date Modified: 
#Last Modified by:

Scenario: ST_06 Marketing Case Creation

#QA - Start New Commercial Customer Account creation
Given User navigates to Sales Force using "Chrome" browser
When User logs in SFDC QA
Then User navigates to create a Case
Then User creates new Marketing Case
Then User ends the test scenario

