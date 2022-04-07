package pageObjects.sfdc.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pageObjects.partnerportal.home.BasePage;

public class SfdcHomePage extends BasePage {

	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"AllTab_Tab\"]/a")
	WebElement ALLTABBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"bodyCell\"]/div[3]/div[2]/table/tbody/tr[32]/td[1]/a")
	WebElement CASESBTN; 

	@FindBy(how = How.XPATH, using = "//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
	WebElement NEWBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"phSearchInput\"]")
	WebElement SRCHBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ext-gen5\"]")
	WebElement PPLOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"User_body\"]/table/tbody/tr[2]/th/div/div/a")
	WebElement MJANEOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"moderatorMutton\"]")
	WebElement MENUDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"USER_DETAIL\"]")
	WebElement USRDTLOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"topButtonRow\"]/input[4]")
	WebElement LOGINBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"userNav-arrow\"]")
	WebElement PROFDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"userNav-menuItems\"]/a[2]")
	WebElement SETUPOPT;
	
	public SfdcHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToCases() throws Exception {
		
		waitForVisibleElement(driver, ALLTABBTN);
		click(ALLTABBTN, "ALLTABBTN");
		
		waitForVisibleElement(driver, ALLTABBTN);
		click(CASESBTN, "CASESBTN");
	}
	
	
	public void navigateToCreateCase() throws Exception {
		
		waitForVisibleElement(driver, ALLTABBTN);
		click(ALLTABBTN, "ALLTABBTN");
		
		waitForVisibleElement(driver, ALLTABBTN);
		click(CASESBTN, "CASESBTN");
		
		waitForVisibleElement(driver, NEWBTN);
		click(NEWBTN, "NEWBTN");
	}

	public void logInAsSysAdmin() throws Exception {
		
		waitForVisibleElement(driver, SRCHBOX);
		enterText(SRCHBOX, "SRCHBOX", "Mary Jane Talha");
		SRCHBOX.submit();
		
		waitForVisibleElement(driver, PPLOPT);
		click(PPLOPT, "PPLOPT");
		
		waitForVisibleElement(driver, MJANEOPT);
		click(MJANEOPT, "MJANEOPT");
		
		Thread.sleep(4000);
		click(MENUDRPDWN, "MENUDRPDWN");
		
		waitForVisibleElement(driver, USRDTLOPT);
		click(USRDTLOPT, "USRDTLOPT");
		
		waitForVisibleElement(driver, LOGINBTN);
		click(LOGINBTN, "LOGINBTN");
	}
	
	
	public void navigateToSetup() throws Exception {
		
		waitForVisibleElement(driver, PROFDRPDWN);
		click(PROFDRPDWN, "PROFDRPDWN");
		
		waitForVisibleElement(driver, SETUPOPT);
		click(SETUPOPT, "SETUPOPT");
	}

	
}
