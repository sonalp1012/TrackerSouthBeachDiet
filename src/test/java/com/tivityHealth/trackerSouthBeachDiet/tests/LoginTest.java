package com.tivityHealth.trackerSouthBeachDiet.tests;

import com.tivityHealth.trackerSouthBeachDiet.base.TestBase;
import com.tivityHealth.trackerSouthBeachDiet.po.LoginPage;
import org.testng.annotations.Test;

@Test
public class LoginTest extends TestBase {

    public void login() {

        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.setEmail("sobestage100@sobe.com");
        LoginPage.setPassword("test1234");
        LoginPage.clickOnLoginBtn();

        String actualUrl = "https://tracker.stage.southbeachdiet.com/journal";
        String expectedUrl = driver.getCurrentUrl();
        if (actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Successfully logged in");
        } else {
            System.out.println("Login Failed");
        }
    }



}


