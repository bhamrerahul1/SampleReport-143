package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeDriver {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-2nsib7r/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actitime a= new Actitime(driver);
		a.usertextbox("admin");
		a. passwordextbox("manager");
		a.loginbutton();
		

	}

}
