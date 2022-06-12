package sect2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement deod = driver.findElement(By.xpath("//div[text()='Deodorants']"));
		Point loc=deod.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		JavascriptExecutor ks=(JavascriptExecutor) driver;
		ks.executeScript("window.scrollBy("+x+","+y+")", args);
		Thread.sleep(5000);
		deod.click();
		driver.close();
		
	}

}
