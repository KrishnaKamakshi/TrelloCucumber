package org.trellocucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends DriverFactory{

    public static final String LOGIN_BTN = "loginBtn";


    public void login(){
        driver.findElement(By.xpath(LoginPage.LOGIN_BTN)).click();
    }
}
