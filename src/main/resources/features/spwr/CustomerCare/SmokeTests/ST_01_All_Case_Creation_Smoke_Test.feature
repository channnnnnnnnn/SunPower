Feature: Smoke Test Case Creation

#Author: chdayao@sunpowercorp.com
#Date Created: 4/04/2022
#Date Modified: 
#Last Modified by:

Scenario: ST_01 Smoke Test All Cases Creation

#Can log in to QA or UAT
Given User navigates to Sales Force using "Chrome" browser
When User logs in SFDC QA
Then User creates new TSE Case
Then User creates new CSR Case
Then User creates new PAM Case
Then User creates new FPO Case
Then User creates new Marketing Case
Then User creates new PSR Case
Then User creates new System Design Case

