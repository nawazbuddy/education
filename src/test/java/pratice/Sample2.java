package pratice;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(groups = "regression")
	public void test3()
	{
		System.out.println("test3 sucessfully");
	}
	@Test(groups = "smoke")
	public void test4()
	{
		System.out.println("test4 sucessfully");
	}

}
