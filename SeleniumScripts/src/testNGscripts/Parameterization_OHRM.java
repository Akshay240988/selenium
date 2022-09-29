package testNGscripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class Parameterization_OHRM {
	WebDriver wd;
	
	  @BeforeSuite
	  public void openBrwsr() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay Patil\\Desktop\\Automation\\Browser drivers\\chromedriver_win32 (1)/chromedriver.exe");		
			 wd = new ChromeDriver();
			 Thread.sleep(2000);
	  }
	
	
  @Test(dataProvider = "dp")
  public void loginOHRM(String un, String pwd) throws InterruptedException {
	 // System.out.println(un+"    "+pwd); 
      wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(2000);
	  wd.findElement(By.name("username")).sendKeys(un);
      wd.findElement(By.name("password")).sendKeys(pwd);
      Thread.sleep(3000);
      wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
      
      Thread.sleep(2000);
	  wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[4]/a[1]")).click();	
	  
  }
  
//  @AfterMethod
//  public void logoutOHRM() throws InterruptedException {
//	  try
//	  {
//	  Thread.sleep(2000);
//	  wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]")).click();
//	  Thread.sleep(2000);
//	  wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[4]/a[1]")).click();	  
//	  }
//	  catch(Exception e)
//	  {
//		  System.out.println("Invalid Credentials");
//	  }
//  }
  
  @AfterSuite
  public void closeBrwsr() throws InterruptedException {
	  Thread.sleep(2000);
	  wd.quit();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Admin123", "admin123" },
      new Object[] { "Admin", "admin123" }
    };
  }
}
