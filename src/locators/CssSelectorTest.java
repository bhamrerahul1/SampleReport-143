package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://m.facebook.com/");
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("rahulbhamre1137@gmail.com");
		driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("Rahul@123078956456");
		driver.findElement(By.cssSelector("button[name=\"login\"]")).click();
	
		
		
		
	}

}
