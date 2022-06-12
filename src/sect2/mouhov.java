package sect2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouhov {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://www.myntra.com/");
	      WebElement ele=driver.findElement(By.xpath("//a[@class='desktop-main'][1]"));
	      Actions a= new Actions(driver);
	      a.moveToElement(ele).perform();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//a[text()='Jeans']")).click();
	      driver.close();

	}

}
