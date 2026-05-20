package pages;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FlightSearchPage {

	WebDriver driver;
	WebDriverWait wait;

	public FlightSearchPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	public void flightHandle() throws Exception {

		// From City
		driver.findElement(By.xpath("//input[contains(@id,'stationFrom')]")).sendKeys("Hyd");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Hyderabad')]")).click();

		// To City
		driver.findElement(By.xpath("//input[contains(@id,'stationTo')]")).sendKeys("Pune");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Pune')]")).click();

		// Date Selection - Today
		driver.findElement(By.id("originDate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(@class,'active-red')]")).click();

		// Class Selection - Business
		driver.findElement(By.id("noOfpaxEtc")).click();
		driver.findElement(By.xpath("//select[contains(@id,'travelClass')]")).sendKeys("Business");
		
		//Submit Button
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		System.out.println("Search button clicked");

	}
}

