package com.testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	void m1() {
		
		System.out.println("This will print @BeforeSuite.....");
		
		
	}
	
	@BeforeTest
	void m2() {
		
		System.out.println("This will print @BeforeTest.....");
		
	}
	
	@BeforeClass
	void m3() {
		
		System.out.println("This will print @BeforeClass.....");
		
	}
	
	@BeforeMethod
	void m4() {
		
		System.out.println("This will print @BeforeMethod.....");
		
	}
	
	@Test(priority=1)
	void m5() {
		
		System.out.println("This will print @Test1.....");
		
	}
	
	@Test(priority=2)
	void m6() {
		
		System.out.println("This will print @Test2.....");
		
	}
	
	
	@AfterMethod
	void m10() {
		
		System.out.println("This will print @AfterMethod.....");
		
	}
	
	@AfterClass
	void m9() {
		
		System.out.println("This will print @AfterClass.....");
		
	}
	@AfterTest
	void m8() {
		
		System.out.println("This will print @AfterTest.....");
		
	}


	@AfterSuite
	void m7() {
		
		System.out.println("This will print @AfterSuite.....");
		
		
	}
}
