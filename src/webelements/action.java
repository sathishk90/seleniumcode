package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dr=driver.findElement(By.id("username"));
		dr.sendKeys("raja");
		dr.clear();
		WebElement drr=driver.findElement(By.id("password"));
		drr.sendKeys("rajaaa");
	
		drr.clear();
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(3000);
	}
}
		


