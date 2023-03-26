package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void demo()
	{
		Reporter.log("hello world",true);
		Reporter.log("hello selenium trainer",false );
		
		}

}
