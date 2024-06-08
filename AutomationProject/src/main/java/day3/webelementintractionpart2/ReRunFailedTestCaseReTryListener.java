package day3.webelementintractionpart2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class ReRunFailedTestCaseReTryListener implements IAnnotationTransformer{

	//this is listener used to execute test cases at runntime to modify the test cases
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(ReTryAnalyser.class);
		
	}
	
	

}
