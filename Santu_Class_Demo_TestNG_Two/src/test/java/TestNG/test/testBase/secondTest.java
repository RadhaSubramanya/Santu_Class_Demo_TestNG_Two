package TestNG.test.testBase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class secondTest {
	@Test
	public void assertTrue() {
		Assert.assertTrue(true);
		System.out.println("Running Assert True");
	}
	

}
