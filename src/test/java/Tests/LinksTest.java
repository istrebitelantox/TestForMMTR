package Tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;

public class Links {
    private static String baseUrl = "https://demoqa.com/";
    private SelenideElement window = $(By.xpath("//h5[.='Elements']"));
    private SelenideElement linksPage = $(By.xpath("//span[.='Links']"));
    private SelenideElement createButton = $(By.xpath("//a[@id='created']"));

    private SelenideElement noContentButton = $(By.xpath("//a[@id='no-content']"));
    private SelenideElement movedButton = $(By.xpath("//a[@id='moved']"));
    private SelenideElement badRequestButton = $(By.xpath("//a[@id='bad-request']"));
    private SelenideElement unauthorizedButton = $(By.xpath("//a[@id='unauthorized']"));
    private SelenideElement forbiddenButton = $(By.xpath("//a[@id='forbidden']"));
    private SelenideElement notFoundButton = $(By.xpath("//a[@id='invalid-url']"));
    private SelenideElement linkResponse = $(By.xpath("//p[@id='linkResponse']"));
    @Step("Переход к форме")
    public void openWindow(){
        open(baseUrl);
        window.should(Condition.visible).click();
        linksPage.should(Condition.visible).click();
    }
    @Step("Проверка create")
    public void createdCheck(){
        createButton.click();
        Assertions.assertEquals("Link has responded with staus 201 and status text Created",linkResponse.getText());
    }
    @Step("Проверка No Content")
    public void noContentCheck(){
        noContentButton.click();
        sleep(1000);
        Assertions.assertEquals("Link has responded with staus 204 and status text No Content",linkResponse.getText());
    }
    @Step("Проверка Moved")
    public void movedCheck(){
        movedButton.click();
        sleep(1000);
        Assertions.assertEquals("Link has responded with staus 301 and status text Moved Permanently",linkResponse.getText());
    }
    @Step("Проверка Bad Request")
    public void badRequestCheck(){
        badRequestButton.click();
        sleep(1000);
        Assertions.assertEquals("Link has responded with staus 400 and status text Bad Request",linkResponse.getText());
    }
    @Step("Проверка Unauthorized")
    public void unauthorizedCheck(){
        unauthorizedButton.click();
        sleep(1000);
        Assertions.assertEquals("Link has responded with staus 401 and status text Unauthorized",linkResponse.getText());
    }
    @Step("Проверка Forbidden")
    public void forbiddenCheck(){
        forbiddenButton.click();
        sleep(1000);
        Assertions.assertEquals("Link has responded with staus 403 and status text Forbidden",linkResponse.getText());
    }
    @Step("Проверка Not Found")
    public void notFoundCheck(){
        notFoundButton.click();
        sleep(1000);
        Assertions.assertEquals("Link has responded with staus 404 and status text Not Found",linkResponse.getText());
    }
}
