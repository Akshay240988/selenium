package day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alert_FA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Akshay Patil/Desktop/Automation/Browser drivers/chromedriver_win32/chromedriver.exe");	
	    WebDriver wd = new ChromeDriver();	
	    wd.get("http://demo.frontaccounting.eu/");
	    Thread.sleep(5000);
	    wd.findElement(By.xpath("//body[1]/div[1]/form[1]/center[2]/input[1]")).click();
	    wd.findElement(By.linkText("Sales Quotation Entry")).click();
	    Select sel = new Select(wd.findElement(By.id("customer_id")));
	    sel.selectByIndex(2);
	    Thread.sleep(5000);
	    wd.findElement(By.xpath("//body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/form[1]/center[3]/button[2]/span[1]")).click();
	    Thread.sleep(5000);
	    
	    //Alert interface instance
	    Alert alt = wd.switchTo().alert();
	    
	    System.out.println("Text of alert --- "+alt.getText());
	    
	    //ok button on confirmative alert
	    alt.accept();
	    Thread.sleep(5000);
	    wd.close();
	    
	    
	    
	    
	}

}
