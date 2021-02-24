package testproj;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void test1()
	{
		Reporter.log("1",true);
	}
    @Test
    public void test2()
    {
    	Reporter.log("2",true);
    }
}
