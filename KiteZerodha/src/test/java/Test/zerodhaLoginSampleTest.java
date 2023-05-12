package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class zerodhaLoginSampleTest {
	@Test(priority =1,timeOut=1000)
	public void testa() throws InterruptedException {//4
		Thread.sleep(0);
		System.out.println("testa executed");
	}
	@Test(invocationCount = 3)
	public void testb() {//7
		System.out.println("testb executed");
	}
	@Test(enabled=false)
	public void testc() {//7
		System.out.println("testc executed");
	}
	@Test(dependsOnMethods= {"testa"})
	public void testd() {//7
		System.out.println("testd executed");
	}
	@BeforeClass
	public void beforeClass() {//2
		System.out.println("Beforeclass is executed");
	}
	@AfterClass
	public void afterClass() {//9
		System.out.println("Afterclass is executed");
	}
	@BeforeMethod
	public void beforeMethod() {//3,6
		System.out.println("BeforeMethod is executed");
	}
	@AfterMethod
	public void afterMethod() {//5,8
		System.out.println("AfterMethod is executed");
	}
	@BeforeTest
	public void beforeTest() {//1
		System.out.println("BeforeTest is executed");
	}
	@AfterTest
	public void afterTest() {//10
		System.out.println("AfterTest is executed");
	}

}
