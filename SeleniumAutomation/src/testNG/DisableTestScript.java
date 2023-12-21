package testNG;

import org.testng.annotations.Test;

public class DisableTestScript {
	
	@Test(priority = 1)
	public void a() {
		System.out.println("Hello");
	}
	
	@Test(priority = 4)
	public void b() {
		System.out.println("Bye");
	}
	
	@Test(priority = 2)
	public void c() {
		System.out.println("How r u");
	}
	
	@Test(priority = 3, enabled = false)
	public void d() {
		System.out.println("Movie");
	}

}
