package testNGscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IFrameDemo {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver","C:/Users/Akshay Patil/Desktop/Automation/Browser drivers/geckodriver-v0.31.0-win64/geckodriver.exe");			
	    WebDriver wd = new FirefoxDriver();	
	    Thread.sleep(2000);
	    wd.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    Thread.sleep(2000);
	   // wd.switchTo().frame(0);//by index
	  //  wd.switchTo().frame("");//by name
	    wd.switchTo().frame(wd.findElement(By.xpath("//*[@id=\"courses-iframe\"]")));//by web element
	    Thread.sleep(2000);
	    wd.findElement(By.linkText("Courses")).click();
	    //wd.switchTo().defaultContent();
	    wd.switchTo().parentFrame();
	    Thread.sleep(2000);
	    wd.findElement(By.id("mousehover")).click();
	    
	  
	  
  }
}
