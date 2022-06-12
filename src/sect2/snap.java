package sect2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snap {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a= new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("username")).sendKeys("123456789");
		driver.findElement(By.id("close-pop")).click();
		;
		driver.switchTo().defaultContent();
		
		driver.findElement(By.name("keyword")).sendKeys("phone");
		
		//Thread.sleep(3000);
		driver.close();

	}

}
