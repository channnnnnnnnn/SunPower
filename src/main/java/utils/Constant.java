package utils;


import org.openqa.selenium.WebDriver;

public class Constant {
			
		public static final String ProjectPath = System.getProperty("user.dir");	
		public static final String DriversPath = ProjectPath + "\\src\\main\\java\\drivers\\";
		public static final String TestDataFilePath = ProjectPath + "\\src\\main\\java\\testData\\";
		public static final String DownloadPath = System.getProperty("user.home") + "\\Downloads\\";
		
		//QA_TPS
		public static final String QATPSUser = "tpsqa.test@tpsgabisolar.com.qa";
		public static final String QATPSPass = "Solar12347";
		
		//QA_IndirectPartner
		public static final String QAIndirectPartnerGabiSolarUser = "bad.pritt@gabisolar.com.qa";
		public static final String QAIndirectPartnerGabiSolarPass = "qLpTk4LooFwz6AR";
		public static final String QAIndirectPartnerEugeneBuenUser = "eugene.buen@pe.com.qa";
		public static final String QAIndirectPartnerEugeneBuenPass = "Solar0903212";
		
		//UAT_TPS
		public static final String UATNDGabiTPSUser = "tpsqa.test@tpsgabisolar.com.uat";
		public static final String UATNDGabiTPSPass = "P5v4vk394SsnsP";
		
		//UAT_IndirectPartner
		public static final String UATIndirectPartnerGabiSolarUser = "bad.pritt@gabisolar.com.uat";
		public static final String UATIndirectPartnerGabiSolarPass = "DgQEhz2J6Q";
		
		public static final String GmailApp = "http://mail.google.com";
		public static final String GmailInbox = "https://mail.google.com/mail/u/0/#inbox";
		public static final String StackOverflowApp = "https://stackoverflow.com/";
		public static final String UsernameGmailApp = "dumdum11990@gmail.com";
		public static final String PasswordGmailApp = "cizar1996";
		public static final String PartnerUsernameGmailApp = "qatestingspwr@gmail.com";
		public static final String PartnerPasswordGmailApp = "Solar123";
		public static String agreementName = "";
		public static String filePath = "target/screenshots/testScreenshot.png";

		public static boolean isEndStepReached = false;
		public static final int defaultBrowserTimeOut = 60;
		public static boolean DefaultoptionalFlag = true;
		public static String ScreenshotFolderName = null;
		public static String locator = null;
		public static String RecentScreenshot = null;
		public static String PageName = null;
		public static WebDriver driver = null;
		public static String prodSpwrSDS = "https://us.sunpower.com/";
		public static String qaPartnerPortal = "https://qa-sunpower1.cs196.force.com/CommunityLogin";
		public static String UATPartnerPortal = "https://uat-sunpower1.cs40.force.com/"; //Updated as of 02/04/2021
		
		
		public static String sfdc = "https://test.salesforce.com/";
		public static String sfdcUsernameQA = "christianfrancis.dayao@sunpowercorp.com.qa";
		public static String sfdcUsernameUAT = "christianfrancis.dayao@sunpowercorp.com.uat";
		public static String sfdcPassword = "12345Solar";

		}