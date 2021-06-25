package seleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SecondTest01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(Data.Key, Data.Value);
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
		List<WebElement> allcheckboxs =   driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = allcheckboxs.size();
		System.out.println(count);		
		for(int i =0;i <count;i++){
			allcheckboxs.get(i).click();
			}
		
		WebElement drpdown = driver.findElement(By.xpath("//select[@id='selectProductSort']"));
		Select selc = new Select(drpdown);
		selc.selectByVisibleText("Price: Highest first");
		Thread.sleep(5000);
		//driver.quit();
		
		Actions act = new Actions(driver);
		
		
		
    
	
		
		

		
		
	}
}
