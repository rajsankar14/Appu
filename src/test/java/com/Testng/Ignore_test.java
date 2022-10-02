package com.Testng;

import org.junit.Ignore;
import org.testng.annotations.Test;

public class Ignore_test {
	@Ignore
	@Test
	public void Banking () {
		System.out.println("public sector banking ");
	}

	@Test
	public void Powersector() {
		System.out.println("power grid ");

	}
	@Test(enabled=false)
	private void Railways() {
		System.out.println("Indian_railways");

	}
	@Test
	private void Agriculure() {
		System.out.println("Fertilizer");
	}}
//}
//  @BeforeMethod
//  public void Engineering1() {
//	  System.out.println("Automobile");
//  }
//
//  @AfterMethod
//  public void Engineering() {
//	  System.out.println("Civil engineering");
//  }
// 
//  @BeforeClass
//  public void games1() {
//	  System.out.println("outdoor games");
//  }
//  
//  @AfterClass
//  public void games() {
//	  System.out.println("indoor games");
//  }
//
//  @BeforeTest
//  public void cinemas() {
//	  System.out.println("Bollywood");
//  }
//
//  @AfterTest
//  public void cinemas1() {
//	  System.out.println("Hollywood");
//  }
//
//  @BeforeSuite
//  public void food() {
//	  System.out.println("non_veg");
//  }
//
//  @AfterSuite
//  public void food1() {
//	  System.out.println("veg");
//	  
//  }

//}

