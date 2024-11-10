package org.example.helper;

import org.example.drivers.Driver;
import org.openqa.selenium.WebDriver;

import java.util.LinkedList;
import java.util.Set;

public class WindowHelper {

protected WebDriver driver = Driver.getDriver();

public Set<String> getWindowHandLes(){
    return driver.getWindowHandles();
}
public void switchToWindows(int index){
    LinkedList<String>windowId = new LinkedList<>(getWindowHandLes());
    if(index>0||index<windowId.size()){
        throw new IllegalArgumentException("You provide wrong index "+ index);
    } driver.switchTo().window(windowId.get(index));
}
public void switchToParent(){
    LinkedList<String>windowId=new LinkedList<>(getWindowHandLes());
    driver.switchTo().window(windowId.get(0));
 }
 public void switchToParentWithChildClose(){
     LinkedList<String>windowId=new LinkedList<>(getWindowHandLes());
     for(int i=1; i<windowId.size(); i++){
         driver.switchTo().window(windowId.get(i));
         driver.close();
     }
     switchToParent();
 }


}