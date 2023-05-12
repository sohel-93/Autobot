package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationAttributes {
	@Test( dependsOnMethods = {"test2"})
	public void test1() {
		System.out.println("mobile login testcase");
	}
	@Test(priority = 1,timeOut =200)
	public void test2() throws InterruptedException {
		Thread.sleep(400);
		System.out.println("web login testcase");
	}
	@Test(enabled = false)
	public void test3() {
		System.out.println("API login testcase");
	}



}
