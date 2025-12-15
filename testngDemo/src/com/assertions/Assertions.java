package com.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	@Test
	void m1() {
		System.out.println("This is assertion hard pass");
		
		Assert.assertEquals(1==1, 1==1);
		
	}
	
	@Test
	void m2() {
		
        System.out.println("This is assertion soft pass");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1==1, 1==1);
		
		sa.assertAll();
		
	}
	
	@Test
	void m3() {
		
        System.out.println("This is assertion hard fail");
		
		Assert.assertEquals(1==1, 1==3);
		
		System.out.println("This is assertion soft failed");
		
	}
	
	@Test
	void m4() {
		
       System.out.println("This is assertion soft fail");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1==1, 1==3);
		
		System.out.println("This is assertion soft failed");
		sa.assertAll();
		
		
	}
	
	@Test
	void m5() {
		
		System.out.println("Assertions are completed.....");
		
	}

}
