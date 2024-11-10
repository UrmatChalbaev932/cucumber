package org.example.drivers;

import org.example.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {
    private static WebDriver driver;

    private Driver() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getValue("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
//                case "firefox":
//                    driver = FirefoxWebDriver.loadFirefoxDriver();
//                    break;
//                case "safari":
//                    driver = SafariWebDriver.loadSafariDriver();

            }
        }
        return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            System.out.println("Error while closing driver");
        }
    }
}
