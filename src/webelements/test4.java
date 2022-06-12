package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("username"));
		int height=ele.getSize().getHeight();
		System.out.println(height);
		int width=ele.getSize().getHeight();
		System.out.println(width);
		
		int x=ele.getLocation().getX();
		System.out.println(x);
		int y=ele.getLocation().getY();
		System.out.println(y);
		Thread.sleep(2000);
		driver.close();

	}

}
