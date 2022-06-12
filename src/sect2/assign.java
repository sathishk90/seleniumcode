package sect2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.(By.xpath("//button[text()='May 23 - May 29, 2022']")).click();
		driver.findElement(By.id("ext-gen23")).click();
		 driver.findElement(By.xpath("//span[text()='19']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
