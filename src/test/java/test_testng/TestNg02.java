package test_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg02 {
	@Test(priority = 1)
	public void testNG01() {
		System.out.println("TstNG 01");
//		Assert.assertTrue(false);
	}

	@Test(priority = 3, dependsOnMethods = "testNG01")
	public void testNG02() {
		System.out.println("Test 02");
	}

	@Test(priority=2,enabled=false)
	public void testNG03() {
		System.out.println("Test 03");
	}

	@Test( priority = 4,invocationCount=3)
	public void testNG04() {
		System.out.println("Reapeat Method");
	}
}
