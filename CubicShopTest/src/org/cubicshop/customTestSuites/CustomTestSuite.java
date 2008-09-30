package org.cubicshop.customTestSuites;

import org.cubictest.exporters.selenium.SeleniumRunner;
import org.junit.Test;

/**
* Custom setUp and tearDown logic can be used in this class, see JUnit 4 documentation.
*/
public class CustomTestSuite {

	
	@Test
	public void runTests() {
		
		SeleniumRunner runner = new SeleniumRunner();
		
		//run all tests in the "/test suites" folder:
		runner.runTests("/test suites");
		
		
		//alternatively, run single tests, e.g: 
		//runner.runTest("/tests/myTest.aat");
	}
}