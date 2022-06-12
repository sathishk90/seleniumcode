package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameloc {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("file:///C:/Users/GSK-PC/Desktop/dummy.html");
		Thread.sleep(2000);
		driver.findElement(By.name("n3")).click();
		String dr = driver.getTitle();
		System.out.println(dr);
		Thread.sleep(2000);
		driver.close();
	}

}
