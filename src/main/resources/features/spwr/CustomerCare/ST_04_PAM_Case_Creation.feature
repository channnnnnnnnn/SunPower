Feature: Smoke Test Case Creation

#Author: chdayao@sunpowercorp.com
#Date Created: 4/05/2022
#Date Modified: 
#Last Modified by:

Scenario: ST_04 PAM Case Creation

#QA - Start New Commercial Customer Account creation
Given User navigates to Sales Force using "Chrome" browser
When User logs in SFDC QA
Then User creates new PAM Case
Then User ends the test scenario

