package com.trials.pages;

import com.trials.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyT_EntitiesPage extends BasePage{

        public VyT_EntitiesPage() {
            PageFactory.initElements(Driver.get(), this);
        }

        @FindBy(css = "[title='Item #439 - Vehicle Costs - Entities - System - Car - Entities - System']")
        public WebElement createCalendarEvent;

    @FindBy(css = ".edit-button")  //a[class*="edit"]
    public WebElement editButton;


    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[2]")
    public WebElement deleteButton;


    @FindBy(xpath = "/html/body/div[7]/div[3]/a[2]") // css = "btn ok btn-danger
    public WebElement deleteConfirmButton;




}

