package test_testng;

import org.testng.annotations.Test;

public class TestNgMetGrp {
@Test (groups={"Sanity"})
public void Test_case01() {
	System.out.println("Test case 1");
}
@Test (groups={"Sanity"})
public void Test_case02() {
	System.out.println("Test Case 2");
}
@Test (groups={"Regression"})
public void Test_case03() {
	System.out.println("Test case 03");
}
@Test(groups={"Regression"})
public void Test_case04() {
	System.out.println("Tase Case 04");
}
@Test (groups={"Function"})
public void Test_case05() {
	System.out.println("Test case 05");
}
}
