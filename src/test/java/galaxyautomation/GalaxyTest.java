package galaxyautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GalaxyTest {

	@Test
	public void openWebsiteTest() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.galaxy.ai");

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

		// Dynamic locator for Sign in button
		// We use nav + button text because Sign in is inside navigation menu
		By signInBtn = By.xpath("//nav//button[normalize-space()='Sign in']");

		// Wait until Sign in button is visible
		WebElement signInButton = wait.until(ExpectedConditions.visibilityOfElementLocated(signInBtn));

		// Scroll to Sign in button
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signInButton);

		// Click Sign in button using JavaScript
		// This helps if normal click is blocked by popup or overlay
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", signInButton);

		System.out.println("Clicked on Sign in button successfully");

		// Dynamic locator for Sign up link
		// It checks link text "Sign up" and href contains "sign-up"
		By signUpLink = By.xpath("//a[normalize-space()='Sign up' and contains(@href,'sign-up')]");

		// Wait until Sign up link is clickable
		WebElement signUpButton = wait.until(ExpectedConditions.elementToBeClickable(signUpLink));

		// Click Sign up link
		signUpButton.click();

		System.out.println("Clicked on Sign up link successfully");

		// Wait and enter First Name
		WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName-field")));
		firstNameField.sendKeys("Dipali");

		// Wait and enter Last Name
		WebElement lastNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName-field")));
		lastNameField.sendKeys("Sonawane");

		// Wait and enter Email
		WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailAddress-field")));
		emailField.sendKeys("dipalinsonawane1999@gmail.com");

		// Wait and enter Password
		WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password-field")));
		passwordField.sendKeys("Dipali@Galaxy.ai2026");

		System.out.println("Signup details entered successfully");

		// Dynamic locator for Continue button
		// It finds button which has span text "Continue"
		By continueBtn = By.xpath("//button[.//span[normalize-space()='Continue']]");

		// Wait until Continue button is clickable
		WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(continueBtn));

		// Click Continue button
		continueButton.click();

		System.out.println("Clicked on Continue button successfully");

//		driver.quit();
	}
}
