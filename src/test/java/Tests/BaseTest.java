package Tests;

import Interfaces.IAllPageInformation;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
public class BaseTest implements IAllPageInformation {
    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000;
        Configuration.browserSize = "1920x1080";
    }
    @BeforeEach
    public void openHomePage(){
        homePage.getBaseUrl();
    }
}
