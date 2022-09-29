package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:/Users/Akshay Patil/Desktop/Automation/Browser drivers/chromedriver_win32/chromedriver.exe");
//		//used to open single browser instance
//		WebDriver wd = new ChromeDriver();
//		//parent ref=new child();
//		//get()-->used to open url in current opened browser instance
//		wd.get("https://frontaccounting.com/");
//		//getTitle()-->used to capture the title of current opened page
//		
//		System.out.println("The title of current opened url : "+wd.getTitle());
//		
//		Thread.sleep(7000);
//		//used to close current single opened instance of web browser
//		wd.close();
		
		//used to close current all opened multiple instances of web browser
		//wd.quit();
		
		System.setProperty("webdriver.gecko.driver","C:/Users/Akshay Patil/Desktop/Automation/Browser drivers/geckodriver-v0.31.0-win64/geckodriver.exe");
		
		WebDriver wd = new FirefoxDriver();
		
		wd.get("http://demo.frontaccounting.eu/");
	
      		
		
		

	}

}
