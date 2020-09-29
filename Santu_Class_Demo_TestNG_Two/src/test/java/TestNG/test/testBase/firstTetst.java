package TestNG.test.testBase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class firstTetst extends TestBase{
	// @DataProvider
	// public Object[][] dp() {
	// return new Object[][] {
	// new Object[] { 1, "a" },
	// new Object[] { 2, "b" },
	// };
	// }
	@Test
	public void plain() {
		System.out.println("Running Plain Test");
	}
	
	// @Test(dataProvider = "dp")
	// public void f1(Integer n, String s) {
	// System.out.println("Running dataprovider Test1 n="+n+" s="+s);
	// }
	//
	// @Test(dataProvider = "dp")
	// public void f2(Integer n, String s) {
	// System.out.println("Running dataprovider Test2 n="+n+" s="+s);
	// }

}
