package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators
	private By getStartedBtn = By.xpath("//button[normalize-space()='Get started for free']");

	// Actions
	public void clickGetStarted() {
	    driver.findElement(getStartedBtn).click();
	}
}
