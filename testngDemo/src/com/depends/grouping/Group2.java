package com.depends.grouping;

import org.testng.annotations.Test;

public class Group2 {
	
	
	@Test(groups= {"regression"})
	void m1() {
		System.out.println("This is regression group.....");
	}
	
	
	@Test(groups= {"regression"})
	void m2() {
		System.out.println("This is regression group.....");
		
	}
	
	
	@Test(groups= {"regression"})
	void m3() {
		
		System.out.println("This is regression group.....");
	}
	

}
