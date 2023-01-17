package Tests;

import Interfaces.IAllPageInformation;
import SelenideElementsTools.WebDriver;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest implements IAllPageInformation {
    @BeforeAll
    static void beforeConfig() {
        Configuration.browser = WebDriver.class.getName();
/*        Configuration.timeout = 3000;*/
    }
    @BeforeEach
    public void openHomePage(){
        homePage.getBaseUrl();
    }
}
