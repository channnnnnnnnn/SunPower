package pageObjects.sfdc.SetupPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObjects.partnerportal.home.BasePage;

public class SfdcSetupPage extends BasePage {

	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"setupSearch\"]")
	WebElement QFINDSRCHBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"CaseRecords_font\"]")
	WebElement RCRDTYPESOPT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"RecordTypeList_body\"]/table/tbody/tr[10]/th/a")
	WebElement PSROPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"bodyCell\"]/div[4]/div[1]/div/div[2]/table/tbody/tr[100]/td[1]/a")
	WebElement RESANDCLOSEDTBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"duel_select_1\"]/option[2]")
	WebElement THREEDAYSOPT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"duel_select_1\"]/option[4]")
	WebElement SIXDAYSOPT;
	
	public SfdcSetupPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToPSRPicklist() throws Exception {
		waitForVisibleElement(driver, QFINDSRCHBOX);
		enterText(QFINDSRCHBOX, "QFINDSRCHBOX", "Case");
		
		waitForVisibleElement(driver, RCRDTYPESOPT);
		click(RCRDTYPESOPT , "RCRDTYPESOPT");
	
		waitForVisibleElement(driver, PSROPT);
		click(PSROPT , "PSROPT");
		
		scrollPageDownBy1500();
		
		waitForVisibleElement(driver, RESANDCLOSEDTBTN);
		click(RESANDCLOSEDTBTN , "RESANDCLOSEDTBTN");
		
		waitForVisibleElement(driver, THREEDAYSOPT);
		Assert.assertEquals(THREEDAYSOPT.getText(), "3 business days");
		System.out.println("3 business days option found");

		Assert.assertEquals(SIXDAYSOPT.getText(), "6 business days");
		System.out.println("6 business days option found");
	}
	
	

	
}
