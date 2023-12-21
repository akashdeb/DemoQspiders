package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
	
	@Test
	public void demo() {
		int a = 420;
		int b = 143;
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(a, b);
		
		System.out.println("Line before assertion");
		sa.assertAll();
		System.out.println("Line After assertion");
}

}
