package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http:\\www.gmail.com");
		driver.navigate().refresh();
		driver.get("http:\\www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("http:\\www.bing.com");
		driver.navigate().back();
		driver.navigate().forward();
		// driver.getCurrentUrl();
		String utl = driver.getCurrentUrl();
		if (utl.contains("google")) {

			System.out.println(utl);

			System.out.printf("Back page %s loaded successfully", utl);
		} else {

			System.out.println("google page is not loaded");
		}
		//

		driver.close();

		// driver.close();

	}

}
