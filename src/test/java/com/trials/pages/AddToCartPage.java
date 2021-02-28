package com.trials.pages;

import com.trials.AutomationPractice.SearchBuy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
        @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")
        WebElement itemImage;  //*[@id="homefeatured"]/li[2]/div/div[2]/div[2]/a[2]/span
        @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]/span")
        WebElement btnMore;
        @FindBy(xpath = "//*[@id=\"quantity_wanted\"]")  //*[@id="quantity_wanted"]
        WebElement txtQuantity;
        @FindBy(xpath = "//*[@id=\"group_1\"]")//*[@id="group_1"]
        WebElement selectSize;
        @FindBy(xpath = "//a[@title='White']")  // white  //a[@title='White']  //a[@name='White']
        WebElement selectClr;
        @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")  //*[@id="add_to_cart"]/button/span
        WebElement btnAddToCart;
        @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")   //  (css ="div#layer_cart a > span")
        WebElement btnCheckout;
        @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]")  //*[@id="header"]/div[3]/div/div/div[3]/div/a
        WebElement cartText;


        SearchBuy selenium;

        public AddToCartPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
            selenium = new SearchBuy();
        }

        public boolean validateAddToCart(WebDriver driver) {
            selenium.performMouseHover(itemImage, driver);
            selenium.click(btnMore);
            selenium.clear(txtQuantity);
            selenium.setText("3", txtQuantity);

            selenium.selectByVisibleText(selectSize, "S");
            // selenium.selectColor(selectClr,"White");
            selenium.slctCheckBox(selectClr);
            // selenium.slctCheckBox(selectClr,"White");
            // selenium.performMouseHover2(itemImage, driver);
            selenium.click(btnAddToCart);
            selenium.clickUsingJavaScriptExecutor(btnCheckout, driver);
            selenium.refresh(driver);
            //  selenium.validateText(driver,cartText,"3");

            return selenium.validateText(driver, cartText, "3");
        }

    }