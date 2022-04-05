package stepDefinitions.sfdc.CasesPage;

import io.cucumber.java.en.Then;
import pageObjects.sfdc.CasesPage.SfdcCasesPage;

public class SfdcCasesPageSteps {
	
	@Then("^User creates new CSR Case$")
	public void user_creates_CSR_case() throws Exception {
		SfdcCasesPage sfdccasepage = new SfdcCasesPage();
		sfdccasepage.createCSRCase();
	}
	
	@Then("^User creates new TSE Case$")
	public void user_creates_TSE_case() throws Exception {
		SfdcCasesPage sfdccasepage = new SfdcCasesPage();
		sfdccasepage.createTSECase();
	}
}
