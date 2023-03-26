package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
	@Test
	public void call()
	{
		Reporter.log("call",true);
	}
	@Test(priority=-1,enabled=false)
	public void chat()
	{
		Reporter.log("chat",true);
	}
	@Test(priority=-1)
	public void setting()
	{
		Reporter.log("setting",true);
		}

}
