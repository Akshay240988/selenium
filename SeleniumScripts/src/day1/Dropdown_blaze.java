package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_blaze {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Akshay Patil/Desktop/Automation/Browser drivers/chromedriver_win32/chromedriver.exe");	
	    WebDriver wd = new ChromeDriver();	
	    wd.get("https://blazedemo.com/");
	    Thread.sleep(5000);
	    Select sel = new Select(wd.findElement(By.xpath("//body[1]/div[3]/form[1]/select[1] ")));
	    //sel.selectByIndex(1);
         //sel.selectByValue("Portland");
	    sel.selectByVisibleText("São Paolo");
	}

}
