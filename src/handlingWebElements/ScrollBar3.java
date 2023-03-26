package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar3 {

	public static void main(String[] args) throws InterruptedException {
	      
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,7000)");
	      Thread.sleep(3000);
	      js.executeScript("window.scrollBy(0,-7000)");
	      
		
	
		

	}

}
