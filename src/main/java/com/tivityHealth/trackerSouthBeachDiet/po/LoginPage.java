package com.tivityHealth.trackerSouthBeachDiet.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    public WebElement txtEmail;

    @FindBy(id = "password")
    public WebElement txtPassword;

    @FindBy(name = "commit")
    public WebElement btnCommit;

    public void setEmail(String email){
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }
    public void setPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void clickOnLoginBtn() {
        btnCommit.click();
    }

}
