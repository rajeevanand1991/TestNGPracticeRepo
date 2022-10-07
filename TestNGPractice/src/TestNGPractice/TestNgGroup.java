package TestNGPractice;

import org.testng.annotations.Test;

public class TestNgGroup {
	
	@Test(groups = "Inbox")
	public void method1Test() {
		System.out.println("MT1");
	}
	
	@Test(groups = "Search")
	public void method2Test() {
		System.out.println("MT2");
	}
	
	@Test(groups = "SentItems")
	public void method3Test() {
		System.out.println("MT3");
	}
	
	@Test(groups = "Search")
	public void method4Test() {
		System.out.println("MT4");
	}
}