package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("SATHISH");
		Thread.sleep(2000);
		driver.close();
	}

}
