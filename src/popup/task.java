package popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("xxyz.ymail.com");
		
		ArrayList<String> parent = new ArrayList<String>(driver.getWindowHandles());
	      //switch to parent window
	      driver.switchTo().window(parent.get(0));
	      
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Thread.sleep(3000);
		driver.quit();
	}

}
