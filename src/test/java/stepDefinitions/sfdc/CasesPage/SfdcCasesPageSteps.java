package stepDefinitions.sfdc.CasesPage;

import io.cucumber.java.en.Then;
import pageObjects.sfdc.CasesPage.SfdcCasesPage;

public class SfdcCasesPageSteps {
	
	@Then("^User creates new CSR Case$")
	public void user_navigates_to_cases() throws Exception {
		SfdcCasesPage sfdccasepage = new SfdcCasesPage();
		sfdccasepage.createCSRCase();
	}
	
}
