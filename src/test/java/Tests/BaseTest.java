package Tests;

import Interfaces.IAllPageInformation;
import SelenideElementsTools.WebDriver;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Capabilities;


public class BaseTest implements IAllPageInformation {
    @BeforeAll
    static void beforeConfig() {
        Configuration.browser = WebDriver.class.getName();
    }
    @BeforeEach
    public void openHomePage(){
        homePage.getBaseUrl();
    }
}
