package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SoftwareCompany {
	
	@Test
	@Parameters({"SoftwarecompanyName"})
	public void Testcase1(String name) {
		System.out.println(name);
	}

}
