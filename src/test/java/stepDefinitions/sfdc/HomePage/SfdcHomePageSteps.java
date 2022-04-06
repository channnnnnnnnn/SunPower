package stepDefinitions.sfdc.HomePage;

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
import utils.Constant;

public class SfdcHomePageSteps {
	
	@Then("^User navigates to Cases$")
	public void user_navigates_to_cases() throws Exception {
		SfdcHomePage sfdchomepage = new SfdcHomePage();
		sfdchomepage.navigateToCases();
	}
	
	@Then("^User navigates to create a Case$")
	public void user_navigates_to_create_case() throws Exception {
		SfdcHomePage sfdchomepage = new SfdcHomePage();
		sfdchomepage.navigateToCreateCase();
	}
}
