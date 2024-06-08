package day3.webelementintractionpart2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	@Test
	public static void webTabltTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,550)");

		// click on 1 row check box
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table//tr[2]//td[1]//input"))).click();

		// click on 2nd row checkbox

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//table//tr[3]//td[1]//input"))).click();

		// click on 3rd row checkbox

		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//table//tr[4]//td[1]//input"))).click();

		// total row
		List<WebElement> totalRow = driver.findElements(By.xpath("//table[@id='countries']//tr"));
		boolean visitedStatus = false;
		for (WebElement eachRow : totalRow) {

			String rowData = eachRow.getText();

			if (rowData.contains("Visited")) {
				visitedStatus = true;
				System.out.println(rowData);
				break;
			}

		}
		// verify the table header data
		Assert.assertTrue(visitedStatus, "could not find Table header data");

		// total data of a table

		List<WebElement> totalData = driver.findElements(By.xpath("//table[@id='countries']//tr//td"));
		boolean tableDataStatus = false;
		for (WebElement data : totalData) {

			String dataTable = data.getText();
			if (dataTable.contains("Angola")) {
				tableDataStatus = true;
				System.out.println(dataTable);
				break;
			}

		}

	}

}
