package sect2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class youtube {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("pathala pathala video");
		driver.findElement(By.id("search-icon-legacy")).click();
	driver.findElement(By.id("video-title")).click();
		//Actions a= new Actions(driver);
	     //a.moveToElement(ele).perform();

	}

}
