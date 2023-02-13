package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	public static void OpenBrouser() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   

	}

	public static void LaunchUrl( String url) {
		driver.get(url);
	  

	}
	
	public static void PassValue(WebElement w , String u) {
		w.sendKeys(u);
		

	}
	
	public static void PassWord(WebElement e,String p) {
		e.sendKeys(p);
		

	}
	
	public static void Click(WebElement t) {
		t.click();
		

	}
	
	
	public static void CloseTheBrouser() {
		driver.close();
		

	}
	
	
	public static void Maximize() {
		driver.manage().window().maximize();

	}
	
	public static String GetCurrentUrl() {
	 String url = driver.getCurrentUrl();
return url;
	}
	
	
	
}
