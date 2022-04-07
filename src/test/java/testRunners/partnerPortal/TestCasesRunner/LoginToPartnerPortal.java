package testRunners.partnerPortal.TestCasesRunner;
	
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {
				
				//"src/main/resources/features/spwr/CustomerCare/RegressionTests/CaseManagement/RT_01_PSR_Update_SLA_picklist.feature"
				"src/main/resources/features/spwr/CustomerCare/SmokeTests/ST_01_All_Case_Creation_Smoke_Test.feature"
				//"src/main/resources/features/spwr/CustomerCare/SmokeTests/ST_08_Sys_Des_Case_Creation.feature"
				//"src/main/resources/features/spwr/CustomerCare/SmokeTests/ST_07_PSR_Case_Creation.feature"
				//"src/main/resources/features/spwr/CustomerCare/SmokeTests/ST_06_Marketing_Case_Creation.feature"
				//"src/main/resources/features/spwr/CustomerCare/SmokeTests/ST_05_FPO_Case_Creation.feature"
				//"src/main/resources/features/spwr/CustomerCare/SmokeTests/ST_04_PAM_Case_Creation.feature"
				//"src/main/resources/features/spwr/CustomerCare/SmokeTests/ST_03_CSR_Case_Creation.feature"
				//"src/main/resources/features/spwr/CustomerCare/SmokeTests/ST_02_TSE_Case_Creation.feature"
				
	
			
				//"src/main/resources/features/spwr/TestCaseFeatures/TS_01_Partner_Portal_End_to_End_Account_to_Manual_Quoting_Cash.feature",
				//"src/main/resources/features/spwr/TestCaseFeatures/TS_02_Partner_Portal_End_to_End_Account_to_Manual_Quoting_Loan.feature",
				//"src/main/resources/features/spwr/TestCaseFeatures/TS_03_Partner_Portal_End_to_End_Account_to_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/TestCaseFeatures/TS_04_Partner_Portal_End_to_End_Account_to_Manual_Signing_Cash.feature",
				//"src/main/resources/features/spwr/TestCaseFeatures/TS_05_Partner_Portal_End_to_End_Account_to_Manual_Signing_Loan.feature",
				//"src/main/resources/features/spwr/TestCaseFeatures/TS_06_Partner_Portal_End_to_End_Account_to_Manual_Signing_Lease.feature"
				
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_01_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_02_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_03_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_04_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_05_UAT_ND_Eddie_Manual_Quoting_Lease.feature"
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_06_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_07_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_08_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_09_UAT_ND_Eddie_Manual_Quoting_Lease.feature",
				//"src/main/resources/features/spwr/UATNDLeaseTestCasesEddieFinEng/TS_10_UAT_ND_Eddie_Manual_Quoting_Lease.feature"
				},
		glue = {"stepDefinitions"},
		stepNotifications = true,
		dryRun = false,
		plugin = {"pretty", /*"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"*/},
		monochrome = true
		)

public class LoginToPartnerPortal {
	
	@AfterClass	
	public static void tearDown() throws Exception {

	}
}

