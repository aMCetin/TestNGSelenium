package com.trials.pages;

import com.trials.utilities.ConfigurationReader;
import com.trials.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    //driver.findElement(By.id("prependedInput"));
    @FindAll({  // find all one must be correct findby 1 must be correct
            @FindBy(id = "prependedInput"),
            @FindBy(name = "_username")
    })
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

   /* @FindBy(css = ".btn.btn-primary")
    public List<WebElement> buttons; */

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }



    public void loginAsStoreManager(){

        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
    public void loginAsDriver(){

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
    public void loginAsSalesManager(){

        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
//////////////////////////////////////////////////////




    public static void loginAsUser(String userType){
        LoginPage login = new LoginPage();

        String username = "";
        String password = "";

        switch (userType){
            case "driver":
                username = ConfigurationReader.get("driver_username");
                password = ConfigurationReader.get("driver_password");
                break;
            case "salesmanager":
                username = ConfigurationReader.get("salesmanager_username");
                password = ConfigurationReader.get("salesmanager_password");
                break;
            case "storemanager":
                username = ConfigurationReader.get("storemanager_username");
                password = ConfigurationReader.get("storemanager_password");
                break;



        }
        login.usernameInput.sendKeys(username);
        login.passwordInput.sendKeys(password);
        login.loginBtn.click();





    }

}