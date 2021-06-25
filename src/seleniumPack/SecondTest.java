package seleniumPack;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {


	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		System.setProperty(Data.Key, Data.Value);
		WebDriver driver = new ChromeDriver();
	//	driver.get("");
		driver.navigate().to(Data.URL);		
		driver.findElement(By.id("username")).sendKeys(Data.username);
		driver.findElement(By.name("pwd")).sendKeys(Data.Password);
		driver.findElement(By.id("loginButton")).click();	
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("logo_aT")).isDisplayed();
		Thread.sleep(3000);
		while(true)
		{
		try
		{
		driver.findElement(By.id("logoutLink")).click();		
		System.out.println("Validation is success");
		break;
		}
		catch(NoSuchElementException e)
		{
		}
		}		
	}
}
