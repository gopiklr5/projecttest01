package seleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty(Data.Key, Data.Value);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http:\\www.google.com") ;
					
		List<WebElement> alllinks =  driver.findElements(By.xpath("//a"));	
		int countlinks= alllinks.size();		
		System.out.println(countlinks);		
		int j =0;		
		for(int i =0 ;i < countlinks ;i++){			
		WebElement link = alllinks.get(i);
		
		String linktext = link.getText();
		int linksize = linktext.length();
		// System.out.println(linktext);
		if(linksize >0){
		j+=1 ;
		System.out.println(linktext);
		}
		}
		System.out.println(j);
		driver.close();


	}

}
