package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousHover1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement ele2 = driver.findElement(By.xpath("(//a[@href=\"https://www.ebay.com/b/Electronics/bn_7000259124\"])[2]"));
		 Actions a= new Actions(driver);
		 a.moveToElement(ele2).perform();
		 driver.findElement(By.xpath("//a[text()='Samsung']")).click();
		

	}

}
