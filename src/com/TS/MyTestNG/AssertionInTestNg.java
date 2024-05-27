package com.TS.MyTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNg {

	/*
	 * HardAssert Ashwini Avhad
	 */
	public void A() {

		Assert.assertEquals("Hi", "Hello");
		Assert.assertEquals("hi", "hi");

	}

	/*
	 * SoftAssert Ashwini Avhad
	 */

	@Test
	public void B() {
		SoftAssert softly = new SoftAssert();
		softly.assertEquals("hi", "hello");
		softly.assertEquals("hi", "hi");
		softly.assertEquals("hi", "hey");
		softly.assertAll();
	}

}
