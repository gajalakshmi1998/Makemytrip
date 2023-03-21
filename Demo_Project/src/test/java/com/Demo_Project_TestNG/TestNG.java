package com.Demo_Project_TestNG;

import org.testng.annotations.Test;

public class TestNG {
	@Test(priority = 1)
	
	public void collegeName() {
	System.out.println("Panimalar eng college");

	}
	@Test(priority = 0)
	
	public void passedOutYear() {
		System.out.println("2019");

	}
	@Test(priority = -1)
	
	public void course() {
		System.out.println("b.tech it");
	

	}

}
