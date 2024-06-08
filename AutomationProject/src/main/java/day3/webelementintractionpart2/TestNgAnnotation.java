package day3.webelementintractionpart2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {
	
	
	@Test  // 5. this will execute at 5th number
	 public void testCase1() {
	   System.out.println("This is the A Normal Test Case"); 
	 }

	 @BeforeMethod  //4. this execute at 4th number
	 public void beforeMethod() {
	   System.out.println("This will execute before every Method");
	 }
	 
	 @AfterMethod  //6. this execute at 6th number
	 public void afterMethod() {
	   System.out.println("This will execute after every Method");
	 }
	 
	 @BeforeClass //3. this execute at 3rd number
	 public void beforeClass() {
	   System.out.println("This will execute before the Class");
	 }
	 
	 @AfterClass // 7. this execute at 7th number
	 public void afterClass() {
	   System.out.println("This will execute after the Class");
	 }
	 
	 @BeforeTest //2. second execute
	 public void beforeTest() {
	   System.out.println("This will execute before the Test");
	 }
	 
	 @AfterTest // 8. this will execute after the test
	 public void afterTest() {
	   System.out.println("This will execute after the Test");
	 }
	 
	 @BeforeSuite   // 1. first will execute
	 public void beforeSuite() {
	   System.out.println("This will execute before the Test Suite");
	 }
	 
	 @AfterSuite
	 public void afterSuite() {
	   System.out.println("This will execute after the Test Suite");
	 }

}
