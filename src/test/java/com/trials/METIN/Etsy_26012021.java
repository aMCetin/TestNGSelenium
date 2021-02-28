package com.trials.METIN;

import com.trials.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Etsy_26012021 {
    WebDriver driver;
    private Object Actions;

    @BeforeMethod
    public void setUp() {
      driver = WebDriverFactory.getDriver("chrome");
        //  driver = WebDriverFactory.getDriver("FireFOX");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.manage().deleteAllCookies();
      //  Thread.sleep(3000);
        driver.quit();
    }

    @Test   //ok
    public void ETSY1() throws InterruptedException {

//1. run the URL
        driver.get("http://etsy.me/2MqXaWA");

//2. overpass the pop up
        driver.findElement(By.xpath("//*[@id=\"gdpr-single-choice-overlay\"]/div/div[2]/div[2]/button")).click();
        //   Thread.sleep(1000);

//3.create Select object
        WebElement dropdownElement = driver.findElement(By.id("inventory-variation-select-0"));
        Select stateDropdown = new Select(dropdownElement);
        Thread.sleep(2000);
//4a.SELECT USING VISIBLE TEXT
        stateDropdown.selectByVisibleText("iPhone 11");
        Thread.sleep(2000);

//5. click to add basket          //*[@id="listing-page-cart"]/div/div[5]/div/form/button/div
        driver.findElement(By.xpath("//*[@id=\"listing-page-cart\"]/div/div[5]/div/form/button/div")).click();
        Thread.sleep(1500);


//6. click target country //*[@id="cart-region-list-select"]
        WebElement ddEl2 = driver.findElement(By.id("cart-region-list-select"));
        Select stateDropdown2 = new Select(ddEl2);
        Thread.sleep(2000);

//7a.SELECT USING VISIBLE TEXT
        stateDropdown2.selectByVisibleText("Canada");
        Thread.sleep(2000);


//8. click to remove selected item
        Actions actions = new Actions(driver);
        WebElement remove = driver.findElement(By.xpath("//button[contains(.,'Remove')]"));
        remove.click();

        Thread.sleep(1000);


//9. verify it's removed
        String text = driver.findElement(By.xpath("//h1[contains(.,'Your cart is empty.')]")).getText();
        Assert.assertEquals(text, "Your cart is empty.");
        Thread.sleep(1000);
    }

}
