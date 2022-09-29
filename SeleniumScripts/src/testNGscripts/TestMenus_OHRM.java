package testNGscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMenus_OHRM {
	WebDriver wd;
	
  @BeforeSuite
  public void openBrwsr() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay Patil\\Desktop\\Automation\\Browser drivers\\chromedriver_win32 (1)/chromedriver.exe");		
		 wd = new ChromeDriver();
		 Thread.sleep(2000);
  }
  
  @BeforeTest
  public void openOHRM() {
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  
  @BeforeClass
  public void loginOHRM() throws InterruptedException {
	  Thread.sleep(2000);
	  
	  wd.findElement(By.name("username")).sendKeys("Admin");
      wd.findElement(By.name("password")).sendKeys("admin123");
      Thread.sleep(3000);
      wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
	  
  }
	
  @Test (priority=1)
  public void clkLeave() throws InterruptedException {
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/span[1]")).click();
  }
  
  
  @Test (priority=5)
  public void clkDirectory() throws InterruptedException {
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[9]/a[1]/span[1]")).click();
	  
  }
  
  
  @AfterClass
  public void logoutOHRM() throws InterruptedException {
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]")).click();
	  wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[4]/a[1]")).click();	  
	  
  }
  
  
  @AfterSuite
  public void closeBrwsr() throws InterruptedException {
	  Thread.sleep(2000);
	  wd.quit();
  }
  
  
  
}
