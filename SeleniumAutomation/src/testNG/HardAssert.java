package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void demo() {
		int a = 420;
		int b = 143;
		
		Assert.assertEquals(a, b, "Fail--Demo1");
		System.out.println("Pass--Demo");

}
	
	@Test
	public void demo2() {
		String a = "Qspiders";
		String b = "octopus";
		
		Assert.assertTrue(a.contains(b), "Fail--Demo2");
		System.out.println("Pass--Demo2");

}
}