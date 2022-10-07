package TestNGPractice;

import org.testng.annotations.Test;

public class TestNGDependency {
	
	//if method 1 is Failed Then method 2 will be skipped
	//if method 1 is Passed Then method 2 will be executed
	@Test
	public void method1() {
		System.out.println("method 1");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = {"method1"})
	public void method2() {
		System.out.println("method 2");
	}
}