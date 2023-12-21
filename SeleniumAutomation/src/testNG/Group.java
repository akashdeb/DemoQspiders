package testNG;

import org.testng.annotations.Test;

public class Group {
	
	@Test(groups = "smoke")
	public void eatFood() {
		System.out.println("Eat Food");
	}
	
	@Test(groups = "smoke")
	public void wearCloths() {
		System.out.println("Wear Cloths");
	}
	
	@Test(groups = "smoke")
	public void education() {
		System.out.println("Education");
	}
	
	@Test(groups = "reg")
	public void buyCar() {
		System.out.println("Buy a Car");
	}
	
	@Test(groups = "reg")
	public void goVacation() {
		System.out.println("Go To Vacation");
	}

}
