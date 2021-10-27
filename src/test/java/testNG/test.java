package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	
	@AfterSuite	
private void test1() {
	
System.out.println("@AfterSuite");	
}
		@AfterTest
	private void test2() {
		
			
		System.out.println("@AfterTest");	
		}
@AfterClass
	private void test3() {
		
		System.out.println("@AfterClass");	
		}
@AfterMethod
	private void test4() {
		
		System.out.println("@AfterMethod");	
		}
@BeforeSuite
private void test5() {
	
System.out.println("@BeforeSuite");	
}
@BeforeTest
private void test6() {
	
System.out.println("@BeforeTest");	
}
@BeforeClass
private void test7() {
	
System.out.println("@BeforeClass");	
}
@BeforeMethod
private void test8() {
	
System.out.println("@BeforeMethod");	
}

@Test
private void test9() {
	
System.out.println("@Test2");	
}
@Test
private void test10() {
	
System.out.println("@Test1");	
}
}

