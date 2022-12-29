package org.example.Tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.example.HelpClass.A;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;


import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class Links {
    private final SelenideElement window = $(By.xpath("//h5[.='Elements']"));
    private final SelenideElement linksPage = $(By.xpath("//span[.='Links']"));
    private final SelenideElement createButton = new A("created").getA();
    private final SelenideElement noContentButton = new A("no-content").getA();
    private final SelenideElement movedButton = new A("moved").getA();
    private final SelenideElement badRequestButton = new A("bad-request").getA();
    private final SelenideElement unauthorizedButton = new A("unauthorized").getA();
    private final SelenideElement forbiddenButton = new A("forbidden").getA();
    private final SelenideElement notFoundButton = new A("invalid-url").getA();
    private final SelenideElement linkResponse = $(By.xpath("//p[@id='linkResponse']"));
    @Step("Переход к форме")
    public void openWindow(){
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
        Assertions.assertEquals("Link has responded with staus 204 and status text No Content",linkResponse.getText());
    }
    @Step("Проверка Moved")
    public void movedCheck(){
        movedButton.click();
        Assertions.assertEquals("Link has responded with staus 301 and status text Moved Permanently",linkResponse.should().getText());
    }
    @Step("Проверка Bad Request")
    public void badRequestCheck(){
        badRequestButton.click();
        Assertions.assertEquals("Link has responded with staus 400 and status text Bad Request",linkResponse.should(Condition.visible).getText());
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
