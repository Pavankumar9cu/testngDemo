package com.depends.grouping;

import org.testng.annotations.Test;

public class Group {
	
	
	@Test(groups= {"sanity"})
	void m1() {
		System.out.println("This is sanity group.....");
	}
	
	
	@Test(groups= {"sanity"})
	void m2() {
		System.out.println("This is sanity group.....");
		
	}
	
	
	@Test(groups= {"sanity"})
	void m3() {
		
		System.out.println("This is sanity group.....");
	}
	

}
