package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{
	public void onTestStart(ITestResult result) {
	    System.out.println("Invoked each time before a test will be invoked");
	  }
	public void onTestSuccess(ITestResult result) {
		System.out.println("Invoked each time a test succeeds"+ result.getName());
	  }
	public void onTestFailure(ITestResult result) {
		System.out.println("Invoked each time a test fails"+ result.getName());
	  }
	public void onTestSkipped(ITestResult result) {
		System.out.println("Invoked each time a test is skipped"+ result.getName());
	  }
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Invoked each time a method fails but has been annotated with successPercentage ");
	  }
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	    System.out.println("Invoked each time a test fails due to a timeout");
	  }
	public void onStart(ITestContext context) {
		System.out.println("Invoked before running all the test methods belonging to the classes");
	  }
	public void onFinish(ITestContext context) {
		System.out.println("Invoked after all the test methods belonging to the classes have been called");
	  }


}
