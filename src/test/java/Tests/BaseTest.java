package Tests;

import Interfaces.IAllPageInformation;
import SelenideElementsTools.webDrivers.LocalWebDriver;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Dimension;


public class BaseTest implements IAllPageInformation {
    @BeforeAll
    static void beforeConfig() {
        Configuration.browser = LocalWebDriver.class.getName();
        homePage.getBaseUrl();
        WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(1920,1080));
    }
    @AfterAll
    public void sdasda(){
        WebDriverRunner.getWebDriver().quit();
    }
}
