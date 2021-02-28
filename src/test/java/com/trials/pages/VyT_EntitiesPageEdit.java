package com.trials.pages;

import com.trials.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyT_EntitiesPageEdit {
    public VyT_EntitiesPageEdit() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[title='Item #441 - Entities - System - Car - Entities - System']")
    public WebElement createCalendarEvent;

    @FindBy (css ="#select2-drop-mask")
    public WebElement serviceDDown;

    @FindBy (xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[1]") // Road Assistance
    public WebElement roadAssistance;
    @FindBy (xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[2]") // Depreciation and Interests
    public WebElement depreciationAndInterests;
    @FindBy (xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[3]") // Tax Roll
    public WebElement taxRoll;
    @FindBy (xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[4]") // Summer Tires
    public WebElement summerTires;
    @FindBy (xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[5]") // Snow Tires
    public WebElement snowTires;
    @FindBy (xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[6]") // Repair and Maintenance
    public WebElement repairAndMaintenance;
    @FindBy (xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[7]") // Vehicle Insurance
    public WebElement vehicleInsurance;
    @FindBy (xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[8]") // Vehicle Delivery
    public WebElement vehicleDelivery;
    @FindBy (xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[9]") // Vehicle Registration
    public WebElement vehicleRegistration;

    @FindBy (xpath = "//*[@id=\"custom_entity_type_TotalPrice-uid-5f86d8fabc3f6\"]")
    public WebElement totalPrice;

@FindBy(xpath = "//*[@id=\"date_selector_custom_entity_type_Date-uid-5f86d8fabc4e4\"]")
public WebElement datePlaceHolder;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div[2]/button[1]")
    public WebElement dateTodayButton;

    @FindBy(xpath = "//*[@id=\"custom_entity_type_CostDescriptions-uid-5f86d8fabc5cc\"]")
    public WebElement costDescription;
    //*[@id="custom_entity_type-uid-5f86e4d6d9c0a"]/div[1]/div/div/div[2]/div[1]/div[4]/div/button
    @FindBy(xpath= "//*[@id=\'custom_entity_type-uid-5f86e4d6d9c0a\']/div[1]/div/div/div[2]/div[1]/div[4]/div/button")
    public WebElement saveNExit;




}
