package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.Driver;

//import new_tours.Cruises;
//import new_tours.NewTours;

public class Edit {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * Step 1 Navigate to test leaf home page Step 2 Click on Edit link Step 3
		 * Validate page header --> Work with Edit Fields Step 4 Enter you email address
		 */

		WebDriver driver = Driver.getDriver("chrome");
		driver.get("http://testleaf.herokuapp.com/");

		driver.findElement(By.linkText("Edit")).click();
		String header = driver.findElement(By.tagName("h1")).getText();

		if (header.equals("Work with Edit Fields")) {
			System.out.println("Header validation is passed");
		} else {
			System.out.println("Header validation is failed");
		}

		driver.findElement(By.id("email")).sendKeys(" world!");
		Thread.sleep(3000); // Cruises.sleep(2);
		driver.findElement(By.cssSelector("[value='Append ']")).sendKeys(" appending text");
		Thread.sleep(3000); // Cruises.sleep(2);

		String value = driver.findElement(By.name("username")).getAttribute("value");
		/*
		 * To get text out of text box, you should use getAttribute("value") method
		 */
		System.out.println(value);
		Thread.sleep(3000); // Cruises.sleep(3);
		// input[@name='username'] --> xpath
		/*
		 * // relative xpath input --> tag name name --> attribute of the element
		 * 'username' --> value of an atribute
		 */
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		Thread.sleep(3000); // Cruises.sleep(2);

		boolean isDisabled = !driver.findElement(By.cssSelector("[disabled='true']")).isEnabled();
		System.out.println(isDisabled);

		driver.quit();
		
		
	}
}
