Feature: Smoke Test Case Creation

#Author: chdayao@sunpowercorp.com
#Date Created: 4/042022
#Date Modified: 
#Last Modified by:

Scenario: ST_01 CSR Case Creation

#QA - Start New Commercial Customer Account creation
Given User navigates to Sales Force using "Chrome" browser
When User logs in SFDC QA
Then User navigates to Cases
Then User creates new CSR Case


