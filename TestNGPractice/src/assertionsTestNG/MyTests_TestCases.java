package assertionsTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyTests_TestCases {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void test1() {
		System.out.println("Open Browser");
		//Assert.assertEquals(true, false); //Hard Assertion, This will not continue next line, if the condition is failed
		
		System.out.println("enter Username");
		System.out.println("enter password");
		System.out.println("click on sign in button");
		
		//Assert.assertEquals(true, false); //Hard Assertion
		
		System.out.println("validate Home Page");
		softAssert.assertEquals(true, false, "home page title is missing"); //Soft Assertion
		
		System.out.println("go to deals page");
		System.out.println("create a deal");
		softAssert.assertEquals(true, false, "not able to create a deal"); //Soft Assertion
		
		System.out.println("go to contacts page");
		System.out.println("create a contacts");
		softAssert.assertEquals(true, false, "not able to create a contacts"); //Soft Assertion
		
		softAssert.assertAll(); //This will consolidate the soft assertion failure and mark testcase as failed and continue all lines of code as well
	}
	
	@Test
	public void test2() {
		System.out.println("logout");
		softAssert.assertEquals(true, false);
		softAssert.assertAll(); //This line will consolidate the soft assertion for test2() method
	}
}