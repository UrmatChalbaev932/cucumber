package org.example.pages;

import org.example.drivers.Driver;
import org.example.helper.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {
    WebElementHelper webElementHelper = new WebElementHelper();

    public TextBoxPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "userName-label")
    public WebElement fullNameInput;
    @FindBy(id = "userEmail-label")
    public WebElement emailInput;
    @FindBy(id = "currentAddress-label")
    public WebElement currentAddredsInput;
    @FindBy(id = "permanentAddress-label")
    public WebElement permanentAddressInput;
    @FindBy(id = "submit")
    public WebElement submitClick;
//
//
//    public TextBoxPage fillUpFullName(String fullName){
//        webElementHelper.sendKey(fullNameInput,fullName);
//        return this;
//    }
//    public TextBoxPage fillUpEmail(String email){
//        webElementHelper.sendKey(emailInput,email);
//        return this;
//    }
//    public TextBoxPage fillUpCurrentAddress(String currentAddress){
//        webElementHelper.sendKey(currentAddredsInput,currentAddress);
//        return this;
//    }
//    public TextBoxPage fillUpPermanentAddress(String permanentAddress){
//        webElementHelper.sendKey(permanentAddressInput,permanentAddress);
//        return this;
//    }
//    public TextBoxPage clickSubmitBtn(){
//        webElementHelper.click(submitClick);
//        return this;
//    }
}


