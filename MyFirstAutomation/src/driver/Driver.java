package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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

		System.setProperty("webdriver.chrome.driver", "/Users/abduvokhidismailov/Downloads/chromedriver");
		return  new ChromeDriver();
		}

			private static FirefoxDriver getFirefoxDriver() {
				System.setProperty("webdriver.gecko.driver", "/Users/abduvokhidismailov/Downloads/geckodriver");

				return new FirefoxDriver();
			}

		}
