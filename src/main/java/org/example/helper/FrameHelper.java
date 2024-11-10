package org.example.helper;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FrameHelper {
    private WebDriver driver;
    private WebDriverWait wait;
    public FrameHelper(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(7));
//        когда будет создавать обьект этого класса он попросит передать ему управление драйвером
//                под капотом автоматически иницализируем обьект wait и укажем время ожидания
    }
    public FrameHelper switchToFrame(WebElement element){
        try{
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
            //эта строка кода указывает
            // Selenium подождать, пока указанный фрейм (представленный параметром element) станет доступным,
            // и затем переключить фокус драйвера на этот фрейм. Обычно это используется в сценариях,
            // где необходимо взаимодействовать с элементами внутри встроенного фрейма на веб-странице.
        } catch (TimeoutException e){
            e.printStackTrace();
        }
        return this;
    }
    public FrameHelper switchToParentFrame(){
        driver.switchTo().parentFrame();//.defaultContent()
        return this;
    }
}
