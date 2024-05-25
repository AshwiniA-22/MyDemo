package com.TS.MyTestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Colors {


	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");

	}
	public void pink() {
		System.out.println("I am pink");

	}
	
	public void Green() {
		System.out.println("I am green");
	}
}
