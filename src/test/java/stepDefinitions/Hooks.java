package stepDefinitions;

import org.example.drivers.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class Hooks {

    @Before
    public void setUp(){}

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){ // Проверяет, завершился ли сценарий неудачно
            try {
                byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES); // Делает снимок экрана с помощью WebDriver
                scenario.attach(screenshot, "image/png", "screenshot"); // Прикрепляет снимок экрана к сценарию
            } catch (WebDriverException noSupportScreenshot) {
                // Если WebDriver не поддерживает снятие снимка экрана, выводится сообщение об ошибке
                System.err.println(noSupportScreenshot.getMessage());
            }
        }
        Driver.closeDriver(); // Закрывает экземпляр WebDriver
    }
}
