package methodsofWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d1= new ChromeDriver();
		d1.manage().window().maximize();//default statement to maximize the page...................
		d1.get("https://www.amazon.com/");
		Thread.sleep(4000);
		
		d1.navigate().to("https://skillrary.com/");
		d1.navigate().back();//backward page
		Thread.sleep(3000); 
		
		d1.navigate().forward();// forward page
		Thread.sleep(3000);
		
		d1.navigate().refresh();// refresh the page 
		

	}

}
