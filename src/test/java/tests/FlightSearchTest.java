package tests;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.FlightSearchPage;

public class FlightSearchTest extends BaseTest {

    @Test
    public void verifyIRCTCFlightSearch() throws Exception {

        FlightSearchPage page = new FlightSearchPage(driver);

        // Perform flight search
        page.flightHandle();

        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-details"));
        System.out.println("Flights Available");

        if (flights.isEmpty()) {
            System.out.println("No flights displayed OR automation blocked by IRCTC");
        } else {
            for (WebElement flight : flights) {
                System.out.println(flight.getText());
            }
        }
        
        captureScreenshot(driver, "Flight_Search_Result");
    }
    
    // Screenshot method
    public void captureScreenshot(WebDriver driver, String fileName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            File destination = new File("./screenshots/" + fileName + ".png");
            destination.getParentFile().mkdirs();

            FileHandler.copy(source, destination);
            System.out.println("Screenshot captured: " + destination.getPath());

        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
    }
}

