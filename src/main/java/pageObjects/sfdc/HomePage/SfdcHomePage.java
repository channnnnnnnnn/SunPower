package pageObjects.sfdc.HomePage;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObjects.partnerportal.home.BasePage;
import utils.Constant;

public class SfdcHomePage extends BasePage {

	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"AllTab_Tab\"]/a")
	WebElement ALLTABBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"bodyCell\"]/div[3]/div[2]/table/tbody/tr[32]/td[1]/a")
	WebElement CASESBTN; 

	
	public SfdcHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToCases() throws Exception {
		waitForVisibleElement(driver, ALLTABBTN);
		click(ALLTABBTN, "ALLTABBTN");
		
		waitForVisibleElement(driver, ALLTABBTN);
		click(CASESBTN, "CASESBTN");
	}

}
