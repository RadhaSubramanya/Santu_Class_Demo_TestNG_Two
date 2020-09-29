package TestNG.test.testBase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Running Before Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Before Test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Running After Method");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Running Before Class");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("Running After Class");

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Running Before Method");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("Running After Test");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Running After Suite");

	}
}