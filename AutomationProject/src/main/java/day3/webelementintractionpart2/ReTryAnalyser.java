package day3.webelementintractionpart2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryAnalyser implements IRetryAnalyzer {

	int countForRetryAttempts=0;
	int setMaxLimitForRetry=3;

	
	//method to retry failed test cases 
	public boolean retry(ITestResult result) {
		
		if(countForRetryAttempts < setMaxLimitForRetry) {
			countForRetryAttempts++;
			return true;
		}
		
		/*if(!result.isSuccess()) {
			
			if(countForRetryAttempts < setMaxLimitForRetry) {
				countForRetryAttempts++;
				return true;
			}
		}*/

		return false;
	}

}
