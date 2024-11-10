package org.example.helper;

import org.example.drivers.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {

    public Alert getAlert() {
        return Driver.getDriver().switchTo().alert();
    }

    public void acceptAlert() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        if (!isAlertPresent()){
            return; // stop
        }
        getAlert().accept();
    }

    public void dismissAlert() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        if (!isAlertPresent()){
            System.out.println("нету алерта");
        }
        getAlert().dismiss();
    }

    public void sendKeysAlert(String txt) {
        if (!isAlertPresent()){
            return;
        }
        getAlert().sendKeys(txt);
    }

    public boolean isAlertPresent(){
        try {
             getAlert();
        return true;
        }catch (NoAlertPresentException e){
            e.printStackTrace();
            return false;
        }
    }
    public String getTextAlert(){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        return getAlert().getText();
    }
}