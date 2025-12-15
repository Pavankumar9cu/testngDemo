package com.depends.grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	void m1() {
		System.out.println("This is method.....");

		Assert.assertEquals("a", "a");

	}

	@Test(dependsOnMethods = "m1")
	void m2() {
		System.out.println("This is depends on method.....");
		Assert.assertEquals("a", "b");

	}

	@Test(dependsOnMethods = "m2")
	void m3() {
		System.out.println("This is depends on method.....");
		Assert.assertEquals("a", "a");

	}

	@Test(dependsOnMethods = "m3")
	void m4() {

		System.out.println("This is depends on method.....");
		Assert.assertEquals("a", "b");

	}

	@Test(dependsOnMethods = "m4")

	void m5() {

		System.out.println("This is depends on method.....");
		Assert.assertTrue(false);

	}

	@Test(dependsOnMethods = "m5")
	void m6() {

		System.out.println("This is depends on method.....");
		Assert.fail();

	}

}
