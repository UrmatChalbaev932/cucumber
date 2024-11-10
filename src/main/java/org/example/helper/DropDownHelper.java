package org.example.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.LinkedList;
import java.util.List;

public class DropDownHelper {
    Select select;
    public DropDownHelper selectByText(WebElement element, String text) {
        select = new Select(element);
        select.selectByVisibleText(text);
        return this;
    }

    public DropDownHelper selectByIndex(WebElement element, int index) {
        select = new Select(element);
        select.selectByIndex(index);
        return this;
    }

    public DropDownHelper selectByValue(WebElement element, String text) {
        select = new Select(element);
        select.selectByValue(text);
        return this;
    }

    public List<String> getAllDropDownValues(WebElement element) {
        select = new Select(element);
        List<WebElement> elementList = select.getOptions();
        List<String> valuelist = new LinkedList<>();
        for(WebElement element1: elementList){
            valuelist.add(element1.getText());
        }
        return valuelist;
    }

}
