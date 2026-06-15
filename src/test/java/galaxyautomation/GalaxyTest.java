package galaxyautomation;

import java.time.Duration;
import pages.LoginPage;
import pages.SignupPage;
import pages.VerificationPage;
import base.BaseTest;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import utilities.ExtentManager;

public class GalaxyTest extends BaseTest {

	// Extent Report object
	ExtentReports extent;

	// Individual test report object
	ExtentTest test;

	@BeforeSuite
	public void setupReport() {

		// Creates Extent Report before test execution
		extent = ExtentManager.getReportInstance();
	}

	@Test
	public void openWebsiteTest() {

		// Create test entry in Extent Report
		test = extent.createTest("Open Galaxy AI Website");

		LoginPage loginPage = new LoginPage(driver);

		// Log success message in Extent Report
		test.pass("Galaxy AI website opened successfully");

		// Explicit Wait:
		// Waits up to 15 seconds for a specific element condition
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Dynamic locator for Got it button
		// normalize-space handles extra spaces in button text
		By gotItBtn = By.xpath("//button[normalize-space()='Got it']");

		// Wait until Got it button is clickable
		WebElement gotItButton = wait.until(ExpectedConditions.elementToBeClickable(gotItBtn));

		// JavaScript click:
		// Used when normal Selenium click is blocked by popup/overlay
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", gotItButton);

		System.out.println("Popup closed successfully");

		loginPage.clickGetStarted();
		System.out.println("Clicked Get Started");

		SignupPage signupPage = new SignupPage(driver);

		System.out.println("Entering First Name");

		signupPage.enterFirstName("Dipali");
		System.out.println("Entering Last Name");

		signupPage.enterLastName("Sonawane");
		System.out.println("Entering Email");

		signupPage.enterEmail("dipalinsonawane1999@gmail.com");
		System.out.println("Entering Password");

		signupPage.enterPassword("Dipali@Galaxy.ai26");

		// Wait until Continue button is clickable
		signupPage.clickContinue();

		System.out.println("Clicked on Continue button successfully");
		test.pass("Signup form submitted successfully");

//		VerificationPage verificationPage = new VerificationPage(driver);
//		System.out.println(driver.getPageSource());
//		Assert.assertTrue(
//			    driver.getTitle().contains("Sign Up")
//			);

		driver.quit();
	}

	@AfterSuite
	public void tearDownReport() {

		// Saves report after execution
		extent.flush();
	}
}
