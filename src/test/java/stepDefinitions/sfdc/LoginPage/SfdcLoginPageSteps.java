package stepDefinitions.sfdc.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.partnerportal.home.BasePage;
import pageObjects.sfdc.LoginPage.SfdcLoginPage;
import utils.Constant;

public class SfdcLoginPageSteps {
	
	@Given("^User navigates to Sales Force using \"([^\"]*)\" browser$")
	public void user_navigates_to_SunPower_Partner_Portal_using_browser(String browser) throws Exception {
		BasePage.initialize(browser, Constant.sfdc);
	}
	
	@When("^User logs in SFDC QA$")
	public void user_logs_in_as_an_indirect_partner_in_qa() throws Exception {
		SfdcLoginPage sfdcloginPage = new SfdcLoginPage();
		sfdcloginPage.loginSfdcQA(Constant.sfdcUsernameQA, Constant.sfdcPassword);
	}
	
	
}
