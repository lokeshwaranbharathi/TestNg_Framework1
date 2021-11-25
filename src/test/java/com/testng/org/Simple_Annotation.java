package com.testng.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {

	@BeforeSuite
	private void setUp() {
		System.out.println("Browser setup");
	}

	@BeforeTest
	private void browser_Setup() {
		System.out.println("Chrome Launch");
	}

	@BeforeClass
	private void get_Url() {
		System.out.println("Amazon Launch");
	}

	@BeforeMethod
	private void log_In() {
		System.out.println("Login");
	}

	@Test
	private void mobileSearch() {
		System.out.println("Iphone search");
	}

	@Test
	private void earPhone() {
		System.out.println("Skull Candy");
	}

	@AfterMethod
	private void verify_HomePage() {
		System.out.println("Amazon Homepage");
	}

	@AfterClass
	private void log_Out() {
		System.out.println("Logout");
	}

	@AfterTest
	private void Browser_Close() {
		System.out.println("Close browser");
	}

	@AfterSuite
	private void delete_Cookies() {
		System.out.println("Delete Cookies");
	}

}
