package com.trials.pages;


 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.FindBy;

    public class CreateVehicleCostPage extends BasePage {
        @FindBy(css = ".btn.back.icons-holder-text ")
        public WebElement cancel;
        @FindBy(css = ".btn.btn-success.action-button")
        public WebElement saveAndClose;

        @FindBy(css = ".select2-choice.select2-default")
        public WebElement valueDropdown;


@FindBy(xpath = "//div[contains(text(),'Roa')]") // Road Assistance
public WebElement roadAssistance;
@FindBy(xpath = "//div[contains(text(),'De')]") // Depreciation and Interests
public WebElement depreciationAndInterests;
@FindBy(xpath = "//div[contains(text(),'Rol')]") // Tax Roll
public WebElement taxRoll;
@FindBy(xpath = "//div[contains(text(),'Su')]") // Summer Tires
public WebElement summerTires;
@FindBy(xpath = "//div[contains(text(),'Sn')]") // Snow Tires
public WebElement snowTires;
@FindBy(xpath = "//div[contains(text(),'Re')]") // Repair and Maintenance
public WebElement repairAndMaintenance;
@FindBy(xpath = "//div[contains(text(),'Ins')]") // Vehicle Insurance
public WebElement vehicleInsurance;
@FindBy(xpath = "//div[contains(text(),'Del')]") // Vehicle Delivery
public WebElement vehicleDelivery;
@FindBy(xpath = "//div[contains(text(),'Reg')]") // Vehicle Registration
public WebElement vehicleRegistration;

//  id = "custom_entity_type_TotalPrice-uid-5f7a34c89f057"
    //    @FindBy(xpath = "//input[@id='custom_entity_type_TotalPrice-uid-5f86b14fb0d74']")
        // //*[@id="custom_entity_type_TotalPrice-uid-5f86bfc97f767"]
   /*     @FindBy(xpath = "//*[@id=\"custom_entity_type_TotalPrice-uid-5f86bfc97f767\"]")
        public WebElement totalPrice;

        @FindBy(css = ".ui-datepicker-current.ui-state-default.ui-priority-secondary.ui-corner-all")
        public WebElement dateTodayButton;

        @FindBy(css = "custom_entity_type_CostDescriptions-uid-5f7a34c89f22d")
        public WebElement costDescription;


*/
@FindBy(css = ".edit-button")  //a[class*="edit"]
public WebElement editButton;


        @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[2]")
        public WebElement deleteButton;


        @FindBy(xpath = "/html/body/div[7]/div[3]/a[2]") // css = "btn ok btn-danger
        public WebElement deleteConfirmButton;

        @FindBy(id = "custom_entity_type_TotalPrice-uid-5f7a34c89f057")
        public WebElement totalPrice;

        //*[@id="date_selector_custom_entity_type_Date-uid-5f86c26e7c5bb"]
        @FindBy(xpath = "//*[@id=\"date_selector_custom_entity_type_Date-uid-5f86c26e7c5bb\"]")
        public WebElement datePlaceHolder;

        @FindBy(css = ".ui-datepicker-current.ui-state-default.ui-priority-secondary.ui-corner-all")
        public WebElement dateTodayButton;

        @FindBy(id = "custom_entity_type_CostDescriptions-uid-5f7a34c89f22d")
        public WebElement costDescription;


    }

