package seleniumPack;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		System.setProperty(Data.Key, Data.Value);
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);		
		driver.get("https://www.tutorialspoint.com/tutorialslibrary.htm");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
         
         
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); 
		// switch to popup window
		
		driver.findElement(By.xpath("//a[@class='txt-rgh']")).click();

		// Now you are in the popup window, perform necessary actions here

		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		
		
		
				
		
		//a[@class='txt-rgh']
	}

}
