package com.TS.MyTestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class MyTestCases {

	
	@Test
	public void m1() {
		System.out.println("I am from m1");

	}@Test
	public void m2() {
		System.out.println("I am from m2");
		Assert.assertEquals("hi", "Hello");

	}
	@Test
	public void m3() {
		System.out.println("I am from m3");

	}
	@Test
	public void m4() {
		System.out.println("I am from m4");

	}
	@Test
	public void m5() {
		System.out.println("I am from m5");

	}
}
