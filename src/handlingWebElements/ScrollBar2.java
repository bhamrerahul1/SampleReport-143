package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollBar2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element1 = driver.findElement(By.xpath("//img[@alt='For your Fitness Needs']"));
		Thread.sleep(3000);
		
		
		Point p = element1.getLocation();
		
		
		int x= p.getX();
		int y= p.getY();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		element1.click();
		Thread.sleep(3000);
		
	//	to perform click action by using javascriptexecutor
	//js.executeScript("arguments[0].click();",element1);
		
	//
		
		
		
		
		
	}

}
