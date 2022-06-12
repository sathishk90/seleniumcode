package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
	
		static {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
		}

		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.id("username"));
		ele.clear();
		Thread.sleep(2000);
		ele.sendKeys("Sathish");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(2000);
		driver.close();
		}
		
	}

