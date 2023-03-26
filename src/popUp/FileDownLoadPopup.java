package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownLoadPopup {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/downloads/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[text()='4.7.2']")).click();
    driver.close();

	
	
	
	

	}

}
