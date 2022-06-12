package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		Thread.sleep(3000);
		Alert a=driver.switchTo().alert();
		a.dismiss();
		Thread.sleep(3000);
		driver.close();
				

	}

}
