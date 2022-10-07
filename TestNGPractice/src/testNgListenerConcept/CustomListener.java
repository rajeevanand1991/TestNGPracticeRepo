package testNgListenerConcept;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

	}
	
	@Override
	public void onTestSuccess(ITestResult result) {

	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED Test");
		failed(result.getMethod().getMethodName()); // this will get the current method name and pass it to failed() method
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}
}