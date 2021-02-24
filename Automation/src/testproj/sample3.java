package testproj;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample3 {

	@Test(invocationCount=2)
	public void test1()
	{
		Reporter.log("pavan",true);
	}
	@Test(priority=1,invocationCount=2)
	public void test2()
	{
		Reporter.log("kishore",true);
	}
	@Test(enabled=true,priority=2,invocationCount=3)
	public void test3()
	{
		Reporter.log("naidu",true);
	}
	@Test(dependsOnMethods="test1")
	public void test4()
	{
		Reporter.log("kendham",true);
	}
	
}
