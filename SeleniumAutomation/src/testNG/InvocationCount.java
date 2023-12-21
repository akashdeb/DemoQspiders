package testNG;

import org.testng.annotations.Test;
//How to run a script multiple times using same data
//Using Invocation Count
public class InvocationCount {
	
	@Test(priority = 1)
	public void a() {
		System.out.println("Hello");
	}
	
	@Test(priority = 4, invocationCount = 3)
	public void b() {
		System.out.println("Bye");
	}
	
	@Test(priority = 2)
	public void c() {
		System.out.println("How r u");
	}
	
	@Test(priority = 3)
	public void d() {
		System.out.println("Movie");
	}


}
