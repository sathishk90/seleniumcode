package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class size {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://www.facebook.com/");
	      WebElement sear=driver.findElement(By.name("login"));
	      Dimension d=sear.getSize();
	      System.out.println(d.getHeight());
	      System.out.println(d.getWidth());
	      Thread.sleep(3000);
	      driver.close();

	}

}
