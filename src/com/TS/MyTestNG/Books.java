package com.TS.MyTestNG;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Books {

	
	public void math() {
		System.out.println("Math");

	}
	public void science() {
		System.out.println("Science");
	}
	@Test
	public void english() {
		System.out.println("english");
	}
	public void hindi() {
		System.out.println("Hindi");
	}
}
