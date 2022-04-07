package pageObjects.sfdc.LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pageObjects.partnerportal.home.BasePage;
import utils.Constant;

public class SfdcLoginPage extends BasePage {
	
	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements
	
	@FindBy(how = How.ID, using = "username" ) 
	WebElement USERNAMETXTBOX;

	@FindBy(how = How.ID, using = "password" ) 
	WebElement PASSWORDTXTBOX;
	
	@FindBy(how = How.ID, using = "Login" ) 
	WebElement LOGINBTN;
	
	public SfdcLoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void load(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());}
	}

	public boolean isUsernameTextBoxVisible() {
		objExists(pageName, USERNAMETXTBOX, "USERNAMETXTBOX", true);
		return USERNAMETXTBOX.isDisplayed();
	}
	
	

	
	public void loginSfdcQA(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.sfdcUsernameQA);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.sfdcPassword);
		click(LOGINBTN, "LOGINBTN");
	}	
	
	public void loginSfdcUAT(String username, String password) throws Exception {
		waitForVisibleElement(driver, USERNAMETXTBOX);
		enterText(USERNAMETXTBOX, "USERNAMETXTBOX", Constant.sfdcUsernameUAT);
		enterText(PASSWORDTXTBOX, "PASSWORDTXTBOX", Constant.sfdcPassword);
		click(LOGINBTN, "LOGINBTN");
	}	
}
