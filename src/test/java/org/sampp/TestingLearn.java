package org.sampp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingLearn {
	
	@BeforeClass
 private void beforeclass() {
	System.out.println("@beforeclass");

}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("@beforemethod");

	}
	
	@AfterMethod
	
	private void aftermethod() {
		System.out.println("@aftermethod");

	}
	@Test
    private void testing() {
		System.out.println("@testing");

	}
	
	
	@BeforeTest
	private void beforetest() {
		System.out.println("@beforetest");

	}
	

	}
	
	

