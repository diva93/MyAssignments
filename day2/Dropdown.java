package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dropdown {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// load the url
		driver.get("https://www.telerik.com/contact");
		//finding dropdown webelement
		WebElement dd = driver.findElement(By.id("Dropdown-1"));
		//select method 
		Select options = new Select (dd);
		options.selectByVisibleText("General Inquiries");
		//finding dropdown webelement
		WebElement ds = driver.findElement(By.id("Dropdown-2"));
		//select method 
		Select option1 = new Select (ds);
		option1.selectByIndex(10);
		//finding dropdown webelement
		WebElement dm = driver.findElement(By.id("Country-1"));
		//select method 
		Select option2 = new Select (dm);
		option2.selectByValue("Canada");
	}

}