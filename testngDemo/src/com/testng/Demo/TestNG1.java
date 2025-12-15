package com.testng.Demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestNG1 {
	
	@Test
	public void firstCase3() {
		System.out.println("This is firstCase3");
	}
	@Before
	public void firstCase4() {
		System.out.println("This is firstCase4");
	}
	@After
	public void firstCase5() {
		System.out.println("This is firstCase5");
	}

}
