package TestNG;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class InvocationCountDemo {
	@Test(invocationCount = 3)
	public void testMethod1(ITestContext context) {
		int currentinvocation = context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Executing:"+ currentinvocation);
		System.out.println("Test Method1....");
	}
	@Test
	public void testMethod2(ITestContext context) {
		int currentinvocation = context.getAllTestMethods()[1].getCurrentInvocationCount();
		System.out.println("Executing:"+ currentinvocation);
		System.out.println("Test Method2....");
	}
	

}
