package pratice;

import org.testng.annotations.Test;

public class Sample3 {
	@Test(groups = "smoke")
	public void test5()
	{
		System.out.println("test5 sucessfully");
	}
	@Test(groups = "regression")
	public void test6()
	{
		System.out.println("test6 sucessfully");
	}

}
