package com.trials.pages;

import com.trials.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage{

    //since we are extending BasePage we do not need explicit constructor for this class

//    @FindBy(xpath = "//td[contains(text(),'mbrackstone9@example.com')][@data-column-label='Email']")
//    public WebElement email;

    public WebElement getContactEmail(String email){
        String xpath ="//td[contains(text(),'"+email+"')][@data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }
   /* public void viewPerPage(int num){
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.waitUntilLoaderScreenDisappear();
        Driver.get().findElement(By.xpath("(//button[@data-toggle])[1]")).click();
        WebElement page=Driver.get().findElement(By.xpath("//a[@data-size='"+num+"']"));
        page.click();
    } */

    /////////////// Caglar"s addition


    @FindBy(css = "div.page-size.pull-right.form-horizontal button")
    public WebElement viewPerPage;

    @FindBy(css = "[title='Filters']")
    public WebElement filters;

    @FindBy(css = "[title='Refresh']")
    public WebElement refresh;

    @FindBy(css = "[title='Reset']")
    public WebElement reset;

    @FindBy (xpath = "//table//tbody//tr/td")
    public WebElement table;

    //before click button
    @FindBy (xpath = "//ul[@class='icons-holder']/li[1]/a")
    public WebElement beforePage;

    //page number input box
    @FindBy (xpath = "//input[@type='number']")
    public WebElement pageNumberInputBox;

    //next page button
    @FindBy (xpath = "//ul[@class='icons-holder']/li[3]/a")
    public WebElement afterPage;

    //number of page
    @FindBy (xpath = "//label[contains(text(),'of ')]")
    public WebElement numberOfPage;

    public void goToPage(int page){
        pageNumberInputBox.sendKeys(Keys.CONTROL + "a");
        pageNumberInputBox.sendKeys(Keys.DELETE);
        pageNumberInputBox.sendKeys(String.valueOf(page) + Keys.ENTER);
    }

    public int getNumberOfPage(){
        String pageNumber = numberOfPage.getText();
        String[] regex = pageNumber.split(" ");
        return Integer.parseInt(regex[1]);

    }

}
