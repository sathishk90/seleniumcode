package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.name("q")).sendKeys("qspiders", Keys.ENTER);
	
	Thread.sleep(2000);
	driver.close();

	}

}
