package testNGscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OpenAppls {
	WebDriver wd;
  @BeforeSuite
  public void openBrwsr() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay Patil\\Desktop\\Automation\\Browser drivers\\chromedriver_win32 (1)/chromedriver.exe");		
	 wd = new ChromeDriver();
	 Thread.sleep(2000);

	}
	
  @Test
  public void openBlaze() {
	 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay Patil\\Desktop\\Automation\\Browser drivers\\chromedriver_win32 (1)/chromedriver.exe");		
		//WebDriver wd = new ChromeDriver();
		 wd.get("https://blazedemo.com/");
  }
  
  @Test
  public void openOHRM() throws InterruptedException {
	 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay Patil\\Desktop\\Automation\\Browser drivers\\chromedriver_win32 (1)/chromedriver.exe");		
		//WebDriver wd = new ChromeDriver();
	     Thread.sleep(2000);
		 wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  
  @AfterTest
  public void closebrwsr() throws InterruptedException {
	  Thread.sleep(2000);
	  wd.quit();
  }
  
  
  
}
