package com.TS.MyTestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Fruits {

	@BeforeSuite
	public void apple() {
		System.out.println("I am apple");

	}
	
	public void mango() {
		System.out.println("I am mango");


	}
	@Test
	public void orange() {
		System.out.println("I am orange");

	}
	public void banana() {
		System.out.println("I am banana");

	}
}
