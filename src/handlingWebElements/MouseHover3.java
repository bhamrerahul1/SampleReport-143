package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firelawn.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 WebElement ele2 = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
		 Thread.sleep(3000);
		 Actions a= new Actions(driver);
		 a.moveToElement(ele2).perform();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//a[text()='Tops'])[2]")).click();
		

	}

}
