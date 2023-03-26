package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://luxire.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement ele2 = driver.findElement(By.xpath("//button[@class='drawerbtn']"));
		 Actions a= new Actions(driver);
		 a.moveToElement(ele2).perform();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//a[text()='Suits'])[2]")).click();
		 
		 
		 
		
		 
		 

	}

}
