import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.Driver;

public class Cruises {

	public static void main(String[] args) {
		// command F for search box
		/**
		 * Navigate to New Tours Home page Click on Cruises link on the left navigation
		 * bar Validate URL and Page title getCurrentURL(), getTitle()
		 * 
		 * URL --> http://newtours.demoaut.com/mercurycruise.php Title --> Cruises:
		 * Mercury Tours
		 */

		// System.setProperty("webdriver.chrome.driver",
		// "/Users/abduvokhidismailov/Downloads/chromedriver");

		// ChromeDriver driver = new ChromeDriver();

		WebDriver driver = Driver.getDriver("chrome"); // getDriver();
		driver.get("http://newtours.demoaut.com/");
//		driver.navigate().to("http://newtours.demoaut.com/");
		sleep(2);

		driver.findElement(By.xpath("(//a)[5]")).click();

		sleep(3);

		String actualTitle = driver.getTitle();
		String actualURL = driver.getCurrentUrl();

		if (actualTitle.equals("Cruises: Mercury Tours")) {
			System.out.println("Title check: pass");
		} else {
			System.out.println("Title check: fail");
		}

		if (actualURL.contains("http://newtours.demoaut.com/mercurycruise.php")) {
			System.out.println("URL check: pass");
		} else {
			System.out.println("URL check: fail! Actual URL: " + actualURL);
		}

		sleep(5);
		driver.quit();
	}

//	private static ChromeDriver getDriver() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private static ChromeDriver getDrive() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
