package popup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement upload_file = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		upload_file.sendKeys("C:\\Users\\GSK\\Downloads\\r.docx");
		//driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		//Runtime.getRuntime().exec("C:\\Users\\GSK\\Documents\\fileuploadpopup.au4.au3");

	}

}
