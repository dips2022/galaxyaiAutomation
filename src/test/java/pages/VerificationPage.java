package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationPage {
	WebDriver driver;

	public VerificationPage(WebDriver driver) {
		this.driver = driver;
	}

	private By verifyHumanText = By.xpath("//span[contains(text(),'Verify you are human')]");

	public boolean isVerificationDisplayed() {

		return driver.findElement(verifyHumanText).isDisplayed();
	}

}
