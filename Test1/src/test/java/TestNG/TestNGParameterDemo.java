package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterDemo {
	@Test
	@Parameters({"i","j"})
	public void addition(int a, int b) {
		System.out.println(a+b);
	}
	@Test
	@Parameters({"i","j"})
	public void subtraction(int a, int b) {
		System.out.println(a-b);
	}
	@Test
	@Parameters({"i","j"})
	public void multiplication(int a, int b) {
		System.out.println(a*b);
	}
}
