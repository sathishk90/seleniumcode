import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bar {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Create")).click();
		//driver.manage().window().maximize();
		//driver.get("https://demoapp.skillrary.com/");
		//driver.findElement(By.linkText("LOGIN")).click();
		//driver.findElement(By.id("email")).sendKeys("abc@xyz.com");
		//driver.findElement(By.id("password")).sendKeys("abcd");
		//driver.findElement(By.id("last")).click();
	
		
		
		

	}

}
