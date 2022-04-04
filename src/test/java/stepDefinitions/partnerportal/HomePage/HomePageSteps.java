package stepDefinitions.partnerportal.HomePage;

import io.cucumber.java.en.Then;
import pageObjects.partnerportal.HomePage.HomePage;

public class HomePageSteps {
	
	@Then("^Partner Portal Homepage is displayed$")
	public void partner_Portal_Homepage_is_displayed() throws Exception {
		HomePage homepage = new HomePage();
		homepage.isHomeMenuBtnDisplayed();

	}
}
