package day3.webelementintractionpart2;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class ReRunFailedTestCases {

	// now we do not need for-(retryAnalyzer = TestReTryAnalyser.class)-annotation
	// because we are using (ReRunFailedTestCaseReTryListener class) and IAnnotationTrnsferInterface

	@Test
	public void firstTestCase() {

		Assert.assertTrue(false);
	}

	@Test
	public void secondTestCase() {

		Assert.assertTrue(false);
	}
	
	
	@Test
	public void thirdTestCase() {

		Assert.assertTrue(true);
	}
}
