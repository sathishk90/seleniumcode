package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:\\Users\\GSK\\Desktop\\dummy.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.className("c1")).click();
		//driver.findElement(By.id("a1")).click();
		//driver.findElement(By.name("n1")).click();
		//driver.findElements(By.tagName("a"),By.className("c1"),By.id("a1"),By.name("n1")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
