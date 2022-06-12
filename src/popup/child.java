package popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class child {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		//new window
		driver.switchTo().newWindow(WindowType.WINDOW);

		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child=driver.getWindowHandles();
		System.out.println(child);
		driver.quit();

	}

}
