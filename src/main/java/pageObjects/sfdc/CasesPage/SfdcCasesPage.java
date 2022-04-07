package pageObjects.sfdc.CasesPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObjects.partnerportal.home.BasePage;

public class SfdcCasesPage extends BasePage {

	String pageName = this.getClass().getSimpleName();
	// Using FindBy for locating elements

	@FindBy(how = How.XPATH, using = "//*[@id=\"AllTab_Tab\"]/a")
	WebElement ALLTABBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"bodyCell\"]/div[3]/div[2]/table/tbody/tr[32]/td[1]/a")
	WebElement CASESBTN; 

	@FindBy(how = How.XPATH, using = "//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
	WebElement NEWBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"p3\"]")
	WebElement RECORDTYPE;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"p3\"]/option[2]")
	WebElement CSROPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"p3\"]/option[10]")
	WebElement TSEOPT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"bottomButtonRow\"]/input[1]")
	WebElement CONTINUEBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"cas4\"]")
	WebElement ACCNAMETXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"CF00N80000004HKR4\"]")
	WebElement PARTNERNAMETXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"CF00N2T0000061vJQ\"]")
	WebElement SRVCONTACTTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"CF00N2T0000061vJQ_autoCompleteRowId_0\"]")
	WebElement BADPRITTOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000003bQkY\"]")
	WebElement RESOWNERTYPEDRPDWN;

	@FindBy(how = How.XPATH, using = "//*[@id=\"00N34000005ZfTi\"]/option[2]")
	WebElement GBFSOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000003bQkY\"]")
	WebElement RESOWNERDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000003bQkY\"]/option[2]")
	WebElement ACCPAYABLEOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000004Xrs0\"]")
	WebElement CHANNELDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000004Xrs0\"]/option[2]")
	WebElement LIGHTCOMOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N2T000005ppKO\"]")
	WebElement FCRDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N2T000005ppKO\"]/option[2]")
	WebElement YESFCROPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N34000005kOm8\"]")
	WebElement SLADRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N34000005kOm8\"]/option[2]")
	WebElement ONEBSNSDAYOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000005Dk8s\"]")
	WebElement CATDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000005Dk8s\"]/option[2]")
	WebElement LIFEEVENTOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000005Dk8s\"]/option[7]")
	WebElement SYSTOPT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000005Dk90\"]")
	WebElement SUBCATDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000005Dk90\"]/option[2]")
	WebElement ASSOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"cas14\"]")
	WebElement SUBJTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N34000005ZfTf\"]")
	WebElement CASEDIFFDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N34000005ZfTf\"]/option[2]")
	WebElement PRODRELOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N34000005ZfTf\"]")
	WebElement LOCDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000004Ynfh\"]/option[4]")
	WebElement BOSCOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"cas5\"]")
	WebElement TYPEDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"cas5\"]/option[2]")
	WebElement INQOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000005Dk90\"]/option[10]")
	WebElement SYSISSUEOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"CF00N80000005FTXE\"]")
	WebElement PRODSELTXTBOX;

	@FindBy(how = How.XPATH, using = "//*[@id=\"new\"]/div/div[3]/div/div[2]/table/tbody/tr[3]/th/a")
	WebElement HVOPT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"cas22\"]")
	WebElement SENDNOTIFTICKBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"CF00N2T0000061akA\"]")
	WebElement ERRORCODETXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"p3\"]/option[9]")
	WebElement SYSDESOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000004Zkao\"]")
	WebElement DEPOWNDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000004Zkao\"]/option[4]")
	WebElement CUSTCAREOPT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"CF00N80000004Zkae\"]")
	WebElement PROJOWNERTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ep\"]/div[2]/div[5]/table/tbody/tr[2]/td[2]/div/span/span/a")
	WebElement REQDATEFIELD;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ep\"]/div[2]/div[5]/table/tbody/tr[3]/td[2]/div/span/span/a")
	WebElement PROMDATEFIELD;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"cas7\"]")
	WebElement STATUSDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"cas7\"]/option[2]")
	WebElement ASSGNOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000004Zkb6\"]")
	WebElement PVTYPEDRPDWN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000004Zkb6\"]/option[2]")
	WebElement SER220OPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000004ZkbI\"]")
	WebElement SYSSIZETXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000005Dk90\"]/option[5]")
	WebElement ROOFLEAKOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"p3\"]/option[6]")
	WebElement PAMOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000005Dk8s\"]/option[7]")
	WebElement DATAPLATOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000005Dk90\"]/option[2]")
	WebElement ACCMANOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"p3\"]/option[3]")
	WebElement FPOOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"cas15\"]")
	WebElement DESCTXTBOX;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"p3\"]/option[4]")
	WebElement MRKTOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"00N80000005Dk8s\"]/option[11]")
	WebElement SERVOPT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"p3\"]/option[7]")
	WebElement PSROPT;
	
	
	
	
	
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"topButtonRow\"]/input[1]")
	WebElement SAVECASEBTN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"bodyCell\"]/div[3]")
	WebElement HOVERLINKS;
	
	@FindBy(how = How.ID, using = "errorDiv_ep")
	WebElement ERRORSAVINGTXT;
	//*[@id="Case_Tab"]/a
	@FindBy(how = How.XPATH, using = "//*[@id=\"Case_Tab\"]")
	WebElement CASESTAB;
	
	@FindBy(how = How.XPATH, using = "	//*[@id=\"00N34000005kOm8\"]/option[3]")
	WebElement THREEDAYSOPT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"00N34000005kOm8\"]/option[5]")
	WebElement SIXDAYSOPT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"cas11\"]")
	WebElement CASORGDRPDWN;

	@FindBy(how = How.XPATH, using = "//*[@id=\"cas11\"]/option[6]")
	WebElement INTOPT;
	
	public SfdcCasesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean createCSRCase() throws Exception {
		
		waitForVisibleElement(driver, CASESTAB);
		click(CASESTAB, "CASESTAB");
		
		waitForVisibleElement(driver, NEWBTN);
		click(NEWBTN, "NEWBTN");
		
		waitForVisibleElement(driver, RECORDTYPE);
		click(RECORDTYPE, "RECORDTYPE");
		
		waitForVisibleElement(driver, CSROPT);
		click(CSROPT, "CSROPT");
		
		waitForVisibleElement(driver, CONTINUEBTN);
		click(CONTINUEBTN, "CONTINUEBTN");
		
		//CASE INFORMATION SECTION
		
		waitForVisibleElement(driver, ACCNAMETXTBOX);
		click(ACCNAMETXTBOX, "ACCNAMETXTBOX");
		enterText(ACCNAMETXTBOX, "ACCNAMETXTBOX", "Gabi Solar");
		
		enterText(PARTNERNAMETXTBOX, "PARTNERNAMETXTBOX", "Gabi Solar");
		
		enterText(SRVCONTACTTXTBOX, "SRVCONTACTTXTBOX", "Bad Pritt");
		waitForVisibleElement(driver, BADPRITTOPT);
		click(BADPRITTOPT, "BADPRITTOPT");
		
		click(RESOWNERDRPDWN, "RESOWNERDRPDWN");
		click(ACCPAYABLEOPT, "ACCPAYABLEOPT");
		
		click(CHANNELDRPDWN, "CHANNELDRPDWN");
		click(LIGHTCOMOPT, "LIGHTCOMOPT");
		
		click(FCRDRPDWN, "FCRDRPDWN");
		click(YESFCROPT, "YESFCROPT");
		
		
		// Time line & Resolution Section
		click(SLADRPDWN, "SLADRPDWN");
		click(ONEBSNSDAYOPT, "ONEBSNSDAYOPT");
		

		//Case Details Section
		click(CATDRPDWN, "CATDRPDWN");
		click(LIFEEVENTOPT, "LIFEEVENTOPT");
		
		click(SUBCATDRPDWN, "SUBCATDRPDWN");
		click(ASSOPT, "ASSOPT");
		
		click(SUBJTXTBOX, "SUBJTXTBOX");
		enterText(SUBJTXTBOX, "SUBJTXTBOX", "Automation - CSR Smoke Test");
		
		
		// Issue Information Section
		click(CASEDIFFDRPDWN, "CASEDIFFDRPDWN");
		click(PRODRELOPT, "PRODRELOPT");
		
		click(LOCDRPDWN, "LOCDRPDWN");
		click(BOSCOPT, "BOSCOPT");
		
		click(SAVECASEBTN, "SAVECASEBTN");
	
		Thread.sleep(2000);
		return HOVERLINKS.isDisplayed();
	}

	public boolean createTSECase() throws Exception {
		
		waitForVisibleElement(driver, CASESTAB);
		click(CASESTAB, "CASESTAB");
		
		waitForVisibleElement(driver, NEWBTN);
		click(NEWBTN, "NEWBTN");
		
		waitForVisibleElement(driver, RECORDTYPE);
		click(RECORDTYPE, "RECORDTYPE");
		
		waitForVisibleElement(driver, TSEOPT);
		click(TSEOPT, "TSEOPT");
		
		waitForVisibleElement(driver, CONTINUEBTN);
		click(CONTINUEBTN, "CONTINUEBTN");
		
		//CASE INFORMATION SECTION
		
		waitForVisibleElement(driver, ACCNAMETXTBOX);
		click(ACCNAMETXTBOX, "ACCNAMETXTBOX");
		enterText(ACCNAMETXTBOX, "ACCNAMETXTBOX", "Gabi Solar");
		
		enterText(PARTNERNAMETXTBOX, "PARTNERNAMETXTBOX", "Gabi Solar");
		
		enterText(SRVCONTACTTXTBOX, "SRVCONTACTTXTBOX", "Bad Pritt");
		waitForVisibleElement(driver, BADPRITTOPT);
		click(BADPRITTOPT, "BADPRITTOPT");
		
		click(RESOWNERDRPDWN, "RESOWNERDRPDWN");
		click(ACCPAYABLEOPT, "ACCPAYABLEOPT");
		
		click(CHANNELDRPDWN, "CHANNELDRPDWN");
		click(LIGHTCOMOPT, "LIGHTCOMOPT");
		
		click(FCRDRPDWN, "FCRDRPDWN");
		click(YESFCROPT, "YESFCROPT");
		
		click(SLADRPDWN, "SLADRPDWN");
		click(ONEBSNSDAYOPT, "ONEBSNSDAYOPT");
		
		//Case Details Section
		
		click(TYPEDRPDWN, "TYPEDRPDWN");
		click(INQOPT, "INQOPT");
		
		click(SUBCATDRPDWN, "SUBCATDRPDWN");
		click(SYSISSUEOPT, "SYSISSUEOPT");
		
		click(SUBJTXTBOX, "SUBJTXTBOX");
		enterText(SUBJTXTBOX, "SUBJTXTBOX", "Automation - TSE Smoke Test");
		
		
		//Product Information Section
		
		click(PRODSELTXTBOX, "PRODSELTXTBOX");
		enterText(PRODSELTXTBOX, "PRODSELTXTBOX", "7000HV");
		
		
		click(CASEDIFFDRPDWN, "CASEDIFFDRPDWN");
		click(PRODRELOPT, "PRODRELOPT");
		
		click(ERRORCODETXTBOX, "ERRORCODETXTBOX");
		enterText(ERRORCODETXTBOX, "ERRORCODETXTBOX", "FC - 16");
		
		
		click(SENDNOTIFTICKBOX, "SENDNOTIFTICKBOX");
		click(SAVECASEBTN, "SAVECASEBTN");
		
		Thread.sleep(2000);
		return HOVERLINKS.isDisplayed();

	}
	
	public boolean createSysDesCase() throws Exception {
	
		waitForVisibleElement(driver, CASESTAB);
		click(CASESTAB, "CASESTAB");
		
		waitForVisibleElement(driver, NEWBTN);
		click(NEWBTN, "NEWBTN");
		
		waitForVisibleElement(driver, RECORDTYPE);
		click(RECORDTYPE, "RECORDTYPE");
		
		waitForVisibleElement(driver, SYSDESOPT);
		click(SYSDESOPT, "SYSDESOPT");
		
		waitForVisibleElement(driver, CONTINUEBTN);
		click(CONTINUEBTN, "CONTINUEBTN");
		
		//CASE INFORMATION SECTION

		click(CHANNELDRPDWN, "CHANNELDRPDWN");
		click(LIGHTCOMOPT, "LIGHTCOMOPT");

		click(SLADRPDWN, "SLADRPDWN");
		click(ONEBSNSDAYOPT, "ONEBSNSDAYOPT");
		
		click(DEPOWNDRPDWN, "DEPOWNDRPDWN");
		click(CUSTCAREOPT, "CUSTCAREOPT");
		
		click(PROJOWNERTXTBOX, "PROJOWNERTXTBOX");
		enterText(PROJOWNERTXTBOX, "PROJOWNERTXTBOX", "Christian Dayao");
		
		click(RESOWNERDRPDWN, "RESOWNERDRPDWN");
		click(ACCPAYABLEOPT, "ACCPAYABLEOPT");
		
		//Design Details Section
		
		click(REQDATEFIELD, "REQDATEFIELD");
		click(PROMDATEFIELD, "PROMDATEFIELD");
		
		//Project / Review Details
		
		click(TYPEDRPDWN, "TYPEDRPDWN");
		click(INQOPT, "INQOPT");
		
		click(CATDRPDWN, "CATDRPDWN");
		click(SYSTOPT, "SYSTOPT");
		
		click(SUBCATDRPDWN, "SUBCATDRPDWN");
		click(ROOFLEAKOPT, "ROOFLEAKOPT");
		
		click(STATUSDRPDWN, "STATUSDRPDWN");
		click(ASSGNOPT, "ASSGNOPT");
		
		click(PVTYPEDRPDWN, "PVTYPEDRPDWN");
		click(SER220OPT, "SER220OPT");
		
		click(SYSSIZETXTBOX, "SYSSIZETXTBOX");
		enterText(SYSSIZETXTBOX, "SYSSIZETXTBOX", "500");
	
		//Issue Information Section
		
		click(CASEDIFFDRPDWN, "CASEDIFFDRPDWN");
		click(PRODRELOPT, "PRODRELOPT");
		
		click(LOCDRPDWN, "LOCDRPDWN");
		click(BOSCOPT, "BOSCOPT");
		
		click(SUBJTXTBOX, "SUBJTXTBOX");
		enterText(SUBJTXTBOX, "SUBJTXTBOX", "Automation - System Design Smoke Test");
		
		click(SAVECASEBTN, "SAVECASEBTN");
		
		Thread.sleep(2000);
		return HOVERLINKS.isDisplayed();
	}
	
	public boolean createPAMCase() throws Exception {
		
		waitForVisibleElement(driver, CASESTAB);
		click(CASESTAB, "CASESTAB");
		
		waitForVisibleElement(driver, NEWBTN);
		click(NEWBTN, "NEWBTN");
		
		waitForVisibleElement(driver, RECORDTYPE);
		click(RECORDTYPE, "RECORDTYPE");
		
		waitForVisibleElement(driver, PAMOPT);
		click(PAMOPT, "PAMOPT");
		
		waitForVisibleElement(driver, CONTINUEBTN);
		click(CONTINUEBTN, "CONTINUEBTN");
		
		//CASE INFORMATION SECTION
		
		click(RESOWNERDRPDWN, "RESOWNERDRPDWN");
		click(ACCPAYABLEOPT, "ACCPAYABLEOPT");
		
		click(SLADRPDWN, "SLADRPDWN");
		click(ONEBSNSDAYOPT, "ONEBSNSDAYOPT");
		
		click(TYPEDRPDWN, "TYPEDRPDWN");
		click(INQOPT, "INQOPT");
		
		click(CATDRPDWN, "CATDRPDWN");
		click(DATAPLATOPT, "DATAPLATOPT");
		
		click(SUBCATDRPDWN, "SUBCATDRPDWN");
		click(ACCMANOPT, "ACCMANOPT");
		
		click(SUBJTXTBOX, "SUBJTXTBOX");
		enterText(SUBJTXTBOX, "SUBJTXTBOX", "Automation - PAM Smoke Test");
		
		click(SAVECASEBTN, "SAVECASEBTN");
		
		Thread.sleep(2000);
		return HOVERLINKS.isDisplayed();
	}
	
	public boolean createFPOCase() throws Exception {
		
		waitForVisibleElement(driver, CASESTAB);
		click(CASESTAB, "CASESTAB");
		
		waitForVisibleElement(driver, NEWBTN);
		click(NEWBTN, "NEWBTN");
		
		waitForVisibleElement(driver, RECORDTYPE);
		click(RECORDTYPE, "RECORDTYPE");
		
		waitForVisibleElement(driver, FPOOPT);
		click(FPOOPT, "FPOOPT");
		
		waitForVisibleElement(driver, CONTINUEBTN);
		click(CONTINUEBTN, "CONTINUEBTN");
		
		//CASE INFORMATION SECTION
	
		click(CHANNELDRPDWN, "CHANNELDRPDWN");
		click(LIGHTCOMOPT, "LIGHTCOMOPT");
		
		waitForVisibleElement(driver, ACCNAMETXTBOX);
		click(ACCNAMETXTBOX, "ACCNAMETXTBOX");
		enterText(ACCNAMETXTBOX, "ACCNAMETXTBOX", "Gabi Solar");
		
		click(RESOWNERTYPEDRPDWN, "RESOWNERTYPEDRPDWN");
		click(GBFSOPT, "GBFSOPT");
		
		click(RESOWNERDRPDWN, "RESOWNERDRPDWN");
		click(ACCPAYABLEOPT, "ACCPAYABLEOPT");
		
		click(SLADRPDWN, "SLADRPDWN");
		click(ONEBSNSDAYOPT, "ONEBSNSDAYOPT");
		
		//CASE DETAILS SECTION
		
		click(SUBJTXTBOX, "SUBJTXTBOX");
		enterText(SUBJTXTBOX, "SUBJTXTBOX", "Automation - FPO Smoke Test");
		
		click(DESCTXTBOX, "DESCTXTBOX");
		enterText(DESCTXTBOX, "DESCTXTBOX", "Automation - FPO Smoke Test DESC");
		
		click(CATDRPDWN, "CATDRPDWN");
		click(LIFEEVENTOPT, "LIFEEVENTOPT");
		
		click(SUBCATDRPDWN, "SUBCATDRPDWN");
		click(ASSOPT, "ASSOPT");
		
		click(SAVECASEBTN, "SAVECASEBTN");
		
		Thread.sleep(2000);
		return HOVERLINKS.isDisplayed();
	}
	
	public boolean createMarketingCase() throws Exception {
	
		waitForVisibleElement(driver, CASESTAB);
		click(CASESTAB, "CASESTAB");
		
		waitForVisibleElement(driver, NEWBTN);
		click(NEWBTN, "NEWBTN");
		
		waitForVisibleElement(driver, RECORDTYPE);
		click(RECORDTYPE, "RECORDTYPE");
		
		waitForVisibleElement(driver, MRKTOPT);
		click(MRKTOPT, "MRKTOPT");
		
		waitForVisibleElement(driver, CONTINUEBTN);
		click(CONTINUEBTN, "CONTINUEBTN");
		
		//Case Information Section
		
		waitForVisibleElement(driver, ACCNAMETXTBOX);
		click(ACCNAMETXTBOX, "ACCNAMETXTBOX");
		enterText(ACCNAMETXTBOX, "ACCNAMETXTBOX", "Gabi Solar");
		
		enterText(PARTNERNAMETXTBOX, "PARTNERNAMETXTBOX", "Gabi Solar");
		
		click(RESOWNERDRPDWN, "RESOWNERDRPDWN");
		click(ACCPAYABLEOPT, "ACCPAYABLEOPT");
		
		click(CHANNELDRPDWN, "CHANNELDRPDWN");
		click(LIGHTCOMOPT, "LIGHTCOMOPT");
		
		click(SLADRPDWN, "SLADRPDWN");
		click(ONEBSNSDAYOPT, "ONEBSNSDAYOPT");
		
		//Case Details Section
		
		click(TYPEDRPDWN, "TYPEDRPDWN");
		click(INQOPT, "INQOPT");
		
		click(CATDRPDWN, "CATDRPDWN");
		click(SERVOPT, "SERVOPT");
		
		enterText(SUBJTXTBOX, "SUBJTXTBOX", "Automation - Marketing Smoke Test");
		
		click(SAVECASEBTN, "SAVECASEBTN");
		
		Thread.sleep(2000);
		return HOVERLINKS.isDisplayed();
	}
	
	public boolean createPSRCase() throws Exception {
		
		waitForVisibleElement(driver, CASESTAB);
		click(CASESTAB, "CASESTAB");
		
		waitForVisibleElement(driver, NEWBTN);
		click(NEWBTN, "NEWBTN");
		
		waitForVisibleElement(driver, RECORDTYPE);
		click(RECORDTYPE, "RECORDTYPE");
		
		waitForVisibleElement(driver, PSROPT);
		click(PSROPT, "PSROPT");
		
		waitForVisibleElement(driver, CONTINUEBTN);
		click(CONTINUEBTN, "CONTINUEBTN");
		
		//Case Information Section
		
		
		waitForVisibleElement(driver, CASORGDRPDWN);
		click(CASORGDRPDWN, "CASORGDRPDWN");
		click(INTOPT, "INTOPT");
		
		waitForVisibleElement(driver, ACCNAMETXTBOX);
		click(ACCNAMETXTBOX, "ACCNAMETXTBOX");
		enterText(ACCNAMETXTBOX, "ACCNAMETXTBOX", "Gabi Solar");
		
		enterText(PARTNERNAMETXTBOX, "PARTNERNAMETXTBOX", "Gabi Solar");
		
		enterText(SRVCONTACTTXTBOX, "SRVCONTACTTXTBOX", "Bad Pritt");
		waitForVisibleElement(driver, BADPRITTOPT);
		click(BADPRITTOPT, "BADPRITTOPT");
		
		click(RESOWNERTYPEDRPDWN, "RESOWNERTYPEDRPDWN");
		click(GBFSOPT, "GBFSOPT");
		
		click(RESOWNERDRPDWN, "RESOWNERDRPDWN");
		click(ACCPAYABLEOPT, "ACCPAYABLEOPT");
		
		click(CHANNELDRPDWN, "CHANNELDRPDWN");
		click(LIGHTCOMOPT, "LIGHTCOMOPT");
		
		click(SLADRPDWN, "SLADRPDWN");
		Assert.assertEquals(THREEDAYSOPT.getText(), "3 business days");
		System.out.println("3 business days option found");

		Assert.assertEquals(SIXDAYSOPT.getText(), "6 business days");
		System.out.println("6 business days option found");
		click(THREEDAYSOPT, "THREEDAYSOPT");
		
		//Case Details Section
		
		click(TYPEDRPDWN, "TYPEDRPDWN");
		click(INQOPT, "INQOPT");

		click(CATDRPDWN, "CATDRPDWN");
		click(LIFEEVENTOPT, "LIFEEVENTOPT");
		
		click(SUBCATDRPDWN, "SUBCATDRPDWN");
		click(ASSOPT, "ASSOPT");
		
		enterText(SUBJTXTBOX, "SUBJTXTBOX", "Automation - PSR Smoke Test");
		
		click(CASEDIFFDRPDWN, "CASEDIFFDRPDWN");
		click(PRODRELOPT, "PRODRELOPT");
		
		click(LOCDRPDWN, "LOCDRPDWN");
		click(BOSCOPT, "BOSCOPT");
		
		click(SAVECASEBTN, "SAVECASEBTN");
		
		Thread.sleep(2000);
		return HOVERLINKS.isDisplayed();
	}
		
}
