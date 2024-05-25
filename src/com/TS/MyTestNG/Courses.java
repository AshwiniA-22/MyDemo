package com.TS.MyTestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Courses {

	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");

	}
	@BeforeClass
	public void selenium() {
		System.out.println("selenium");

	}
	@Test
	public void java() {
		System.out.println("Java");

	}
	
	
	
	public void sql() {
		System.out.println("SQL");
	}
	
	
	public void js() {
		System.out.println("js");
	}
}
