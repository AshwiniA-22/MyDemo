package com.TS.MyTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	
	@AfterTest
	public void m1() {
		System.out.println("I am m1");

	}
	
	@Test
	public void m2() {
		System.out.println("I am m2");

	}
	@Test
	public void m3() {
		System.out.println("I am m3");

	}
	@Test
	public void m4() {
		System.out.println("I am m4");

	}
	@BeforeMethod
	public void m5() {
		System.out.println("I am m5");

	}
	
	public void m6() {
		System.out.println("I am m6");

	}
	@Test
	public void m7() {
		System.out.println("i am m7");

	}

}
