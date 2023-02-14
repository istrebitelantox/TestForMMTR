package Tests;

import Interfaces.IAllPageInformation;
import SelenideElementsTools.webDrivers.LocalWebDriver;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Dimension;


public class BaseTest implements IAllPageInformation {
    @BeforeAll
    static void beforeConfig() {
        Configuration.browser = LocalWebDriver.class.getName();
        Configuration.baseUrl="https://demoqa.com/";
        WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(1920,1080));
    }
}
