package popup;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidepop {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='May']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='29']")).click();
		//driver.close();
		//driver.switchTo().defaultContent();
		
	}

}