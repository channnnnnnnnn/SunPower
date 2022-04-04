package pageObjects.sfdc.CasesPage;

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

public class SfdcCasesPage extends BasePage {

	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
	WebElement NEWBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"p3\"]")
	WebElement RECORDTYPE;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"p3\"]/option[2]")
	WebElement CSROPTION;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"bottomButtonRow\"]/input[1]")
	WebElement CONTINUEBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"cas4\"]")
	WebElement ACCNAMETXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"CF00N80000004HKR4\"]")
	WebElement PARTNERNAMETXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"CF00N2T0000061vJQ\"]")
	WebElement SRVCONTACTTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"CF00N2T0000061vJQ_autoCompleteRowId_0\"]")
	WebElement BADPRITTOPTION;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000003bQkY\"]")
	WebElement RESOWNERDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000003bQkY\"]/option[2]")
	WebElement ACCPAYABLEOPTION;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000004Xrs0\"]")
	WebElement CHANNELDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000004Xrs0\"]/option[2]")
	WebElement LIGHTCOMOPTION;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N2T000005ppKO\"]")
	WebElement FCRDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N2T000005ppKO\"]/option[2]")
	WebElement YESFCROPTION;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N34000005kOm8\"]")
	WebElement SLADRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N34000005kOm8\"]/option[2]")
	WebElement ONEBSNSDAYOPTION;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000005Dk8s\"]")
	WebElement CATDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000005Dk8s\"]/option[2]")
	WebElement LIFEEVENTOPTION;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000005Dk90\"]")
	WebElement SUBCATDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000005Dk90\"]/option[2]")
	WebElement ASSOPTION;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"cas14\"]")
	WebElement SUBJTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N34000005ZfTf\"]")
	WebElement CASEDIFFDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N34000005ZfTf\"]/option[2]")
	WebElement PRODRELOPTION;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N34000005ZfTf\"]")
	WebElement LOCDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000004Ynfh\"]/option[4]")
	WebElement BOSCOPTION;
	
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"topButtonRow\"]/input[1]")
	WebElement SAVECASEBTN;
	
	

	public SfdcCasesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createCSRCase() throws Exception {
		waitForVisibleElement(driver, NEWBTN);
		click(NEWBTN, "NEWBTN");
		
		waitForVisibleElement(driver, RECORDTYPE);
		click(RECORDTYPE, "RECORDTYPE");
		
		waitForVisibleElement(driver, CSROPTION);
		click(CSROPTION, "CSROPTION");
		
		waitForVisibleElement(driver, CONTINUEBTN);
		click(CONTINUEBTN, "CONTINUEBTN");
		
		//CASE INFORMATION SECTION
		
		waitForVisibleElement(driver, ACCNAMETXTBOX);
		click(ACCNAMETXTBOX, "ACCNAMETXTBOX");
		enterText(ACCNAMETXTBOX, "ACCNAMETXTBOX", "Gabi Solar");
		
		enterText(PARTNERNAMETXTBOX, "PARTNERNAMETXTBOX", "Gabi Solar");
		
		enterText(SRVCONTACTTXTBOX, "SRVCONTACTTXTBOX", "Bad Pritt");
		waitForVisibleElement(driver, BADPRITTOPTION);
		click(BADPRITTOPTION, "BADPRITTOPTION");
		
		click(RESOWNERDRPDWN, "RESOWNERDRPDWN");
		click(ACCPAYABLEOPTION, "ACCPAYABLEOPTION");
		click(CHANNELDRPDWN, "CHANNELDRPDWN");
		click(LIGHTCOMOPTION, "LIGHTCOMOPTION");
		click(FCRDRPDWN, "FCRDRPDWN");
		click(YESFCROPTION, "YESFCROPTION");
		
		
		// Timeline & Resolution Section
		click(SLADRPDWN, "SLADRPDWN");
		click(ONEBSNSDAYOPTION, "ONEBSNSDAYOPTION");
		

		//Case Details Section
		click(CATDRPDWN, "CATDRPDWN");
		click(LIFEEVENTOPTION, "LIFEEVENTOPTION");
		
		click(SUBCATDRPDWN, "SUBCATDRPDWN");
		click(ASSOPTION, "ASSOPTION");
		
		click(SUBJTXTBOX, "SUBJTXTBOX");
		enterText(SUBJTXTBOX, "SUBJTXTBOX", "Automation - CSR Smoke Test");
		
		
		// Issue Information Section
		click(CASEDIFFDRPDWN, "CASEDIFFDRPDWN");
		click(PRODRELOPTION, "PRODRELOPTION");
		
		click(LOCDRPDWN, "LOCDRPDWN");
		click(BOSCOPTION, "BOSCOPTION");
		
		click(SAVECASEBTN, "SAVECASEBTN");
	}

}
