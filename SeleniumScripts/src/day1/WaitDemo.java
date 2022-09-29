package day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Akshay Patil/Desktop/Automation/Browser drivers/chromedriver_win32/chromedriver.exe");	
	    WebDriver wd = new ChromeDriver();	
	    wd.get("https://opensource-demo.orangehrmlive.com/");
	    Thread.sleep(5000);
	    
	    TakesScreenshot ts = (TakesScreenshot) wd;
	    File fs = ts.getScreenshotAs(OutputType.FILE);
	    File df = new File("./screen1.png");
	    FileHandler.copy(fs, df);
	    
	}
}
	    
	    //1) Implicit wait
	   // wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	    //2) Explicit wait
//	    WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(10));
//	    
//	    wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
//	    //username - by id locator
// 	    wd.findElement(By.name("username")).sendKeys("Admin");
////	    //password - by name locator
//	    wd.findElement(By.name("password")).sendKeys("admin123");
//	    //Thread.sleep(3000);
//	    wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
//	   // Thread.sleep(3000);
//	}


