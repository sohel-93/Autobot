package batchTesting;

import org.testng.annotations.Test;

public class HomeScreenTest {
	@Test
	public void launchApplication() {
		System.out.println("application successfully launched...");
	}
	@Test
	public void verifyTitle() {
		System.out.println("verify Title method...");
	}
	@Test
	public void verifyLogo() {
		System.out.println("verify Logo method...");
	}

}
