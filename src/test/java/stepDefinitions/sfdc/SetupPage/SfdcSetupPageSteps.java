package stepDefinitions.sfdc.SetupPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObjects.partnerportal.HomePage.HomePage;
import pageObjects.partnerportal.LoginPage.LoginPage;
import pageObjects.partnerportal.home.BasePage;
import pageObjects.sfdc.CasesPage.SfdcCasesPage;
import pageObjects.sfdc.HomePage.SfdcHomePage;
import pageObjects.sfdc.LoginPage.SfdcLoginPage;
import pageObjects.sfdc.SetupPage.SfdcSetupPage;
import utils.Constant;

public class SfdcSetupPageSteps {
	
	@Then("^User navigates to the PSR Picklist$")
	public void user_navigates_to_cases() throws Exception {
		SfdcSetupPage sfdcsetuppage = new SfdcSetupPage();
		sfdcsetuppage.navigateToPSRPicklist();
	}
	
}
