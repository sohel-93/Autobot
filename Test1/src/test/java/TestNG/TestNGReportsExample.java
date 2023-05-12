package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGReportsExample {
	@Test
	public void testMethod1() {
		System.out.println("Test Method1....");
		Reporter.log("Test Method1 passed...");
	}
	@Test
	public void testMethod2() {
		System.out.println("Test Method2....");
		Reporter.log("Test Method2 passed...");
	}
	@Test
	public void testMethod3() {
		System.out.println("Test Method3....");
		Reporter.log("Test Method3 passed...");
	}
	@Test
	public void testMethod4() {
		System.out.println("Test Method4....");
		Reporter.log("Test Method 4passed...");
	}
}
