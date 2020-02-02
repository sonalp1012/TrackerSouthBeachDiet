package com.tivityHealth.trackerSouthBeachDiet.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {
    public WebDriver driver;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void sobeHomePage() {

        driver.get("https://tracker.stage.southbeachdiet.com/login");
        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "SOBE";
        System.out.println("Home page title " + actualTitle);
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),"Page title not matched or Problem in loading url page");

    }


    @AfterSuite
    public void tearDown() {
            driver.quit();
    }
}
