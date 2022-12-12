package Tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {
    private static String baseUrl = "https://demoqa.com/";
    private SelenideElement forms = $(By.xpath("//h5[.='Forms']"));
    private SelenideElement practiceform = $(By.xpath("//span[.='Practice Form']"));
    private SelenideElement firstName = $(By.xpath("//input[@id='firstName']"));
    private SelenideElement lastName = $(By.xpath("//input[@id='lastName']"));
    private SelenideElement userEmail = $(By.xpath("//input[@id='userEmail']"));
    private SelenideElement male = $(By.xpath("//label[@class='custom-control-label']"));
    private SelenideElement mobile = $(By.xpath("//input[@id='userNumber']"));
    private SelenideElement dateofbirth =$(By.xpath("//input[@id='dateOfBirthInput']"));
    private SelenideElement month =$(By.xpath("//select[@class='react-datepicker__month-select']"));
    private SelenideElement june =$(By.xpath("//option[@value='5']"));

    private SelenideElement year =$(By.xpath("//select[@class='react-datepicker__month-select']"));
    private SelenideElement year_2003 =$(By.xpath("//option[@value='2003']"));
    private SelenideElement dayofbirth =$(By.xpath("//div[@aria-label='Choose Monday, June 9th, 2003']"));
    private SelenideElement submit =$(By.xpath("//button[@id='submit']"));

    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000; // Умное ожидание появление элемента на странице
        Configuration.browserSize = "1620x1080"; // Умно
    }


/*    @BeforeEach
    public void before() {

        open(baseUrl);

        firstName.should(Condition.visible).val("demo");
        lastName.should(Condition.visible).val("demo");
        userEmail.should(Condition.visible).click();

        male.should(Condition.visible).val("0000");
        codeBtn.should(Condition.visible).click();
    }*/

    @Step
    public void authorisation() {
        open(baseUrl);
        forms.should(Condition.visible).click();
        practiceform.should(Condition.visible).click();
        firstName.should(Condition.visible).val("Yuriy");
        lastName.should(Condition.visible).val("Gruzdev");
        userEmail.should(Condition.visible).val("dareon@gmail.com");
        male.should(Condition.visible).click();
        mobile.should(Condition.visible).val("89502458776");
        dateofbirth.should(Condition.visible).click();
        month.click();
        june.click();
        year.click();
        year_2003.click();
        dayofbirth.click();
        submit.should(Condition.visible).click();

    }
}
