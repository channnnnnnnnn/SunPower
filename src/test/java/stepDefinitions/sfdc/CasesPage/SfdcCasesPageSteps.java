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
	
	@Then("^User creates new System Design Case$")
	public void user_creates_System_Design_case() throws Exception {
		SfdcCasesPage sfdccasepage = new SfdcCasesPage();
		sfdccasepage.createSysDesCase();
	}
	
	@Then("^User creates new PAM Case$")
	public void user_creates_PAM_case() throws Exception {
		SfdcCasesPage sfdccasepage = new SfdcCasesPage();
		sfdccasepage.createPAMCase();
	}
	
	@Then("^User creates new FPO Case$")
	public void user_creates_FPO_case() throws Exception {
		SfdcCasesPage sfdccasepage = new SfdcCasesPage();
		sfdccasepage.createFPOCase();
	}
	
	@Then("^User creates new Marketing Case$")
	public void user_creates_Marketing_case() throws Exception {
		SfdcCasesPage sfdccasepage = new SfdcCasesPage();
		sfdccasepage.createMarketingCase();
	}
	
	@Then("^User creates new PSR Case$")
	public void user_creates_PSR_case() throws Exception {
		SfdcCasesPage sfdccasepage = new SfdcCasesPage();
		sfdccasepage.createPSRCase();
	}
}
