package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
		String actual = driver.getTitle();
		System.out.println(actual);
		String expected = "actiTIME - Enter Time-Track";
		if (actual.equals(expected))
		{
			System.out.println("Home page successfully displayed");
		}
		else
		{
			System.out.println("check username and password");
		}
		Thread.sleep(5000);
		driver.close();
		
	}
}
		
		
	


