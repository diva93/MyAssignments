package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException{
		// open the browser using object with chrome driver import statement
		//ctrl + shift + o - shortcut for import statement
		ChromeDriver driver = new ChromeDriver();
		
	    //opening browser
		driver.manage().window().maximize();
		
		//loading url
		driver.get("https://www.facebook.com/");
		
		//keep browser alive for sometime
		Thread.sleep(3000);
		
		//closing the window
		driver.close();

	}

}