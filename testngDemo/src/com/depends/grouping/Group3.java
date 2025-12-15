package com.depends.grouping;

import org.testng.annotations.Test;

public class Group3 {
	
	
	@Test(groups= {"sanity","regression","functional"})
	void m1() {
		System.out.println("This is functional group.....");
	}
	
	
	@Test(groups= {"sanity","regression","functional"})
	void m2() {
		System.out.println("This is functional group.....");
		
	}
	
	
	@Test(groups= {"sanity","regression","functional"})
	void m3() {
		
		System.out.println("This is functional group.....");
	}
	

}
