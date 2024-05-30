package radiobutton.cookies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckRadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/radio-button");

		// add cookies

		Cookie addCookie = new Cookie("Google", "Pradeep");

		driver.manage().addCookie(addCookie);

		// to get all cookies

		Set<Cookie> cookie = driver.manage().getCookies();

		for (Cookie cooki : cookie) {

			System.out.println(cooki);
		}

		// to delete the specified cookie

		driver.manage().deleteCookie(addCookie);

		Set<Cookie> cookie2 = driver.manage().getCookies();

		for (Cookie cooki : cookie2) {

			System.out.println(cooki);
		}

		/*
		 * WebElement radioEle = driver.findElement(By.id("yesRadio"));
		 * 
		 * //boolean select = radioEle.isSelected(); boolean select =
		 * radioEle.isDisplayed(); //boolean select = radioEle.isEnabled();
		 * System.out.print(select);
		 */

		driver.close();

		/*
		 * if (select == false) { radioEle.click(); }
		 */

	}

}
