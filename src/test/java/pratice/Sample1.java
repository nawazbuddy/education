package pratice;

import org.testng.annotations.Test;

public class Sample1 {
	@Test(groups = "smoke")
	public void test1()
	{
		System.out.println("test1 sucessfully");
	}
	@Test(groups = "regression")
	public void test2()
	{
		System.out.println("test2 sucessfully");
	}


}
