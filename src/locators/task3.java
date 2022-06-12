package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys("books");
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
