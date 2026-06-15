package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void setup() {

		WebDriverManager.chromedriver().setup();

//		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--headless=new"); //Runs Chrome without opening browser window.
		options.addArguments("--no-sandbox"); //Required on Linux runners.
		options.addArguments("--disable-dev-shm-usage"); //Prevents Chrome crashes in CI/CD.
		options.addArguments("--window-size=1920,1080");

		driver = new ChromeDriver(options);

//		driver.manage().window().maximize();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.galaxy.ai");
	}

	@AfterMethod
	public void tearDown() {

		if (driver != null) {
//			driver.quit();
		}
	}
}