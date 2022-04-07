Feature: Case Management

#Author: chdayao@sunpowercorp.com
#Date Created: 4/04/2022
#Date Modified: 
#Last Modified by:

Scenario: RT_01 Add 3 and 6 days on Res and Closure SLA picklist for PSR Case

#QA - Start New Commercial Customer Account creation
Given User navigates to Sales Force using "Chrome" browser
When User logs in SFDC QA
Then User logs in as System Administrator profile
Then User navigates to Setup
Then User navigates to the PSR Picklist

