Feature: PartnerPortal_E2E_AccountToManualQuoting_Cash_01

#Author: chdayao@sunpowercorp.com
#Date Created: 4/06/2020
#Date Modified: 
#Last Modified by:

Scenario: TS_01 Helix Regression

#QA - Start New Commercial Customer Account creation
Given User navigates to SunPower Partner Portal using "Chrome" browser
When User logs in as Eugene Buen in QA
Then Partner Portal Homepage is displayed
When User navigates to the Accounts page
And User clicks the New Account button
And User creates a Commercial Customer account

