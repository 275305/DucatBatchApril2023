package data.drive.framwork;

import org.openqa.selenium.WebDriver;

public class Compare {

	public static boolean validatePageURL(WebDriver driver, String exptedURL) {

		boolean flag = false;
		if (driver.getCurrentUrl().equalsIgnoreCase(exptedURL)) {
			flag = true;
		}
		return flag;
	}

	public static boolean validateTitle(WebDriver driver, String exptedTitle) {

		boolean flag = false;
		if (driver.getCurrentUrl().equalsIgnoreCase(exptedTitle)) {
			flag = true;
		}
		return flag;
	}
}
