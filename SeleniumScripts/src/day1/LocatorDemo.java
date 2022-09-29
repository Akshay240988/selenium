package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:/Users/Akshay Patil/Desktop/Automation/Browser drivers/chromedriver_win32/chromedriver.exe");		
//	    WebDriver wd = new ChromeDriver();
//	    wd.get("http://demo.frontaccounting.eu/");
//	    wd.findElement(By.name("user_name_entry_field")).sendKeys("demouser");
		
		System.setProperty("webdriver.gecko.driver","C:/Users/Akshay Patil/Desktop/Automation/Browser drivers/geckodriver-v0.31.0-win64/geckodriver.exe");			
	    WebDriver wd = new FirefoxDriver();	
	    wd.get("http://demo.frontaccounting.eu/");
	    //username
	    wd.findElement(By.name("user_name_entry_field")).sendKeys("demouser");
	    //password
	    WebElement pass=wd.findElement(By.name("password"));
	    pass.clear();
	    Thread.sleep(2000);
	    pass.sendKeys("password");
	    //Click on Login Button
	    wd.findElement(By.name("SubmitUser")).click();
	    Thread.sleep(5000);
	    wd.findElement(By.linkText("Logout")).click();
	    Thread.sleep(5000);
	    wd.close();

	}

}
