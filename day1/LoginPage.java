package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
	      //Create obj //
			ChromeDriver driver = new ChromeDriver();
			// size of window //
			driver.manage().window().maximize();
	       // get for website //
			driver.get("https://www.facebook.com/login");
			// input values in attribute value username & case sensitive
	         driver.findElement(By.id("email")).sendKeys("DemoSalesManager");
	 		// input values in attribute value username & case sensitive
	         driver.findElement(By.id("pass")).sendKeys("crmsfa");
	      // input values in attribute value password & case sensitive
	         driver.findElement(By.name("login")).click();
	         // input values in attribute value password & case sensitive
	         driver.findElement(By.linkText("Forgotten password?")).click();
	         // printing the title using string
	       String title = driver.getTitle();
	       System.out.println("title Shown");
		}

}