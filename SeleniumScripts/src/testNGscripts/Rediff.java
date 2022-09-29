package testNGscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Rediff {
	
	
	
	
  @Test
  public void rediff() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver","C:/Users/Akshay Patil/Desktop/Automation/Browser drivers/geckodriver-v0.31.0-win64/geckodriver.exe");			
	    WebDriver wd = new FirefoxDriver();	
	    Thread.sleep(2000);
	    wd.get("https://www.rediff.com/");
	    Thread.sleep(2000);
	    wd.switchTo().frame(wd.findElement(By.xpath("//*[@id=\"moneyiframe\"]")));
	    Thread.sleep(2000);
	    wd.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys("rediff");
	    Thread.sleep(2000);
	    wd.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/form/input[2]")).click();
	    
  }
}

