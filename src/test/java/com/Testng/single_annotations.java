package com.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class single_annotations {
	  @Test
	  
	  public void fruit() {
		  System.out.println("apple");
	  }
	  @BeforeMethod
	  public void Engineering1() {
		  System.out.println("Automobile");
	  }

	  @AfterMethod
	  public void Engineering() {
		  System.out.println("Civil engineering");
	  }

	  @BeforeClass
	  public void games1() {
		  System.out.println("outdoor games");
	  }

	  @AfterClass
	  public void games() {
		  System.out.println("indoor games");
	  }

	  @BeforeTest
	  public void cinemas() {
		  System.out.println("Bollywood");
	  }

	  @AfterTest
	  public void cinemas1() {
		  System.out.println("Hollywood");
	  }

	  @BeforeSuite
	  public void food() {
		  System.out.println("non_veg");
	  }

	  @AfterSuite
	  public void food1() {
		  System.out.println("veg");
		  
	  }

	}

