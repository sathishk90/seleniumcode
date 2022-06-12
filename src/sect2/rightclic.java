package sect2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://www.amazon.com/");
	      WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	      Actions a= new Actions(driver);
	      a.contextClick(search).perform();
	      Thread.sleep(2000);
	      driver.close();

	}

}
