package com.trials.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    /* task: write a static methods that takes a string parameters name : browserType
     based on the value of the parameter
     it sets up the browser and
     the method will return chromedriver or firefoxdriver object
     name of the driver : getDriver  */

   /* public static WebDriver getDriver(String browserType){
        if(browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver(); */

   public static WebDriver getDriver(String browserType){
    WebDriver driver =null;
    switch (browserType.toLowerCase()) {
        case "chrome":
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;
        case "firefox":
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            break;
    }
    return driver;

    }
}

