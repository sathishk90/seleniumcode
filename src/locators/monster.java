package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class monster {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/rio/login");
		driver.findElement(By.id("signInName")).sendKeys("rajakumar");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("signInbtn")).click();
		String actual = driver.getTitle();
		System.out.println(actual);
		if (actual.equals("Jobseeker's Sign in - Search & Apply to Latest Jobs Online | MonsterIndia"))
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
