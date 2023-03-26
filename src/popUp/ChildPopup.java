package popUp;//case1:opening the application in new tab

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfc.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	driver.switchTo().newWindow(WindowType.TAB);
	
		driver.navigate().to("https://www.amazon.com/");
		Set<String> childaddress = driver.getWindowHandles();
		System.out.println(childaddress);
		driver.quit();
		
	
		
		
		

	}

}
