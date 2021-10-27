package testNG;

import org.testng.annotations.Test;

public class Testsuite2 {
	
	@Test
	private void suite4() {
		
	System.out.println("@Test - @Test6");	
	}
	@Test
	private void suite5() {
		
	System.out.println("@Test - @Test7");	
	}
	@Test(priority= 100)
	private void suite6() {
		
	System.out.println("@Test - @Test8");
	}
}
