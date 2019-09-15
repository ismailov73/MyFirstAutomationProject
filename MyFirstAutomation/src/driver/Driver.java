package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public static WebDriver getDriver(String browserType) {
		WebDriver driver = null;

		switch (browserType) {
		case "chrome":
			driver = getChromeDriver();
			break;
		case "firefox":
			driver = getFirefoxDriver();
			break;
		default:
			System.out.println("Browser type " + browserType + " invalid");
			break;
		}
		return driver;
	}

	private static ChromeDriver getChromeDriver() {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "/Users/abduvokhidismailov/Downloads/chromedriver");
		return new ChromeDriver();
	}

	private static FirefoxDriver getFirefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
//		System.setProperty("webdriver.gecko.driver", "/Users/abduvokhidismailov/Downloads/geckodriver");
		return new FirefoxDriver();
	}

}
