import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/abduvokhidismailov/Downloads/chromedriver");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.google.com");

		Thread.sleep(2000);

		webDriver.findElement(By.name("q")).sendKeys("Selenium tutorials");

		webDriver.findElement(By.xpath("(//*[@name='btnK'])[2]")).click();

		Thread.sleep(3000);

		/**
		 * do some logic with browser
		 */

		webDriver.quit();
	}

}
