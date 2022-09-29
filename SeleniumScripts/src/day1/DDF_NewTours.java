package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF_NewTours {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay Patil\\Desktop\\Automation\\Browser drivers\\chromedriver_win32 (1)/chromedriver.exe");		
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.guru99.com/test/newtours/");
		

	}

}
