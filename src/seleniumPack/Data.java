package seleniumPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Data {

	
	 static String URL = "https://demo.actitime.com";
	 static String username = "admin";
	 static String Password ="manager";
	 static String Key ="webdriver.chrome.driver";
	 static String Value ="C:\\selenium\\chromedriver.exe";
	 
	 public void test() {
		 
		 
	 }
	
	 
	 //https://www.browserstack.com/guide/action-class-in-selenium
	// http://demo.guru99.com/test/simple_context_menu.html
		 
		 
	 
	 
	 /* driver.manage().window().maximize();		
		
		WebElement CustID = driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement SubmitBtn = driver.findElement(By.xpath("//input[@name='submit']"));
		CustID.sendKeys("53920");
		SubmitBtn.click();	
		
		// Switching to Alert        
         Alert alert = driver.switchTo().alert();        
         String capturedtext = driver.switchTo().alert().getText();
         System.out.println(capturedtext);
         alert.accept();
         String capturedtext02 = driver.switchTo().alert().getText();
         System.out.println(capturedtext02);
         alert.accept();*/
	//https://www.browserstack.com/guide/read-data-from-excel-using-selenium
	// https://www.guru99.com/all-about-excel-in-selenium-poi-jxl.html
}
