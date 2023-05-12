package TestNG;

import org.testng.annotations.Test;

public class GroupAttribute {
	@Test(groups = "software company")
	public void infosys() {
		System.out.println("Infosys...");
	}
	@Test(groups ="software company")
	public void wipro() {
		System.out.println("Wipro...");
	}
	@Test(groups = "Automobile")
	public void tata() {
		System.out.println("Tata...");
	}
	@Test(groups = "Automobile")
	public void maruti() {
		System.out.println("Maruti...");
	}

}
