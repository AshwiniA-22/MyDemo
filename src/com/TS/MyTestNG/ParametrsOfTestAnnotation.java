package com.TS.MyTestNG;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ParametrsOfTestAnnotation {

	int x=1;
	@Test(enabled = true)
	public void method2() {
		System.out.println("I am method 2");

	}
	/*
	 * It shown error bcoz successpercentage is 80 and test case is pass only 3 times 
	 */
	@Test(invocationCount = 6, successPercentage = 80)
	public void method3() {
		x++;
		System.out.println(x);
		if(x%2==0) {
			System.out.println("pass");
		}else {
			throw new AssertionError();
		}
		

	}
	

	@Test(dependsOnMethods = {"method6"})
	public void method1() {
		System.out.println("I am method 1");

	}

	
	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void method5() {
		System.out.println("I am method 5");
	}

	@Test()
public void method6() {
		System.out.println("I am method 6");
		if(x%2==0) {
			System.out.println("pass");
		}else {
			throw new AssertionError();
		}
	}

	@Test(invocationCount = 3,invocationTimeOut = 3000)
	public void method7() {
		System.out.println("I am method 7");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
@Test(timeOut = 2000)
	public void method4() throws InterruptedException {
	System.out.println("I am method 4");
		
	}

@Test(groups={"Sanity"})
	public void method8() {
		System.out.println("I am method 8");
	}

	public void method9() {
		System.out.println("I am method 9");
	}
}
