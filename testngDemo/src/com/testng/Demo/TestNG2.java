package com.testng.Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test(priority = 3)
	public void firstCase3() {
		System.out.println("This is firstCase3");
	}
	@Test(priority = 1)
	public void firstCase4() {
		System.out.println("This is firstCase4");
	}
	@Test(priority = 0)
	public void firstCase5() {
		System.out.println("This is firstCase5");
	}
	@Test(enabled = false)
	public void firstCase6() {
		System.out.println("This is firstCase6");
	}

}
