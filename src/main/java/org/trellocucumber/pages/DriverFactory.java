package org.trellocucumber.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    public static WebDriver driver = null;
    public static WebDriverWait waitVar = null;

    public void createDriver()throws MalformedURLException, InterruptedException{
        final DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","Redmi Note 4");
        capabilities.setCapability("platformVersion","7.0");
        capabilities.setCapability("appPackage","com.trello");
        capabilities.setCapability("appActivity","com.trello.home.HomeActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
                capabilities);

        waitVar = new WebDriverWait(driver, 90);
    }

    public void teardown(){
        driver.close();
    }
}
