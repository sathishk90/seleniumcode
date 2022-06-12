package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class net {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		driver.findElement(By.id("id_userLoginId")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("password");
		driver.findElement(By.xpath("//button [text()='Sign In']")).click();
		String actual = driver.getTitle();
		System.out.println(actual);
		if (actual.equals("Netflix"))
		{
			System.out.println("Home page successfully displayed");
		}
		else
		{
			System.out.println("check username and password");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		driver.close();
		
	}

}
