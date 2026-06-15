package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {

	WebDriver driver;

	// Constructor
	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators
	private By firstNameField = By.id("firstName-field");
	private By lastNameField = By.id("lastName-field");
	private By emailField = By.id("emailAddress-field");
	private By passwordField = By.id("password-field");
	private By continueBtn =
	        By.xpath("//span[normalize-space()='Continue']");

	// Actions
	public void enterFirstName(String firstName) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField)).sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		driver.findElement(lastNameField).sendKeys(lastName);
	}

	public void enterEmail(String email) {
		driver.findElement(emailField).sendKeys(email);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clickContinue() {

	    WebDriverWait wait =
	            new WebDriverWait(driver, Duration.ofSeconds(10));

	    wait.until(
	        ExpectedConditions.elementToBeClickable(continueBtn)
	    ).click();
	}

}
