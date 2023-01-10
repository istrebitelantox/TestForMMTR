package Tests;

import HelpClass.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageTextBox {
    private final SelenideElement window = new CategoryCards(1).getCategory();
    private final SelenideElement linksPage = new FormsPicker(1,0).getItem();
    private final SelenideElement userName = new Input("userName").getInput();
    private final SelenideElement userEmail = new Input("userEmail").getInput();
    private final SelenideElement userCurrentAddress =$(By.cssSelector("textarea#currentAddress"));
    private final SelenideElement userPermanentAddress = $(By.cssSelector("textarea#permanentAddress"));
    private final SelenideElement name = new P("name").getP();
    private final SelenideElement email = new P("email").getP();
    private final SelenideElement currentAddress = new P("currentAddress").getP();
    private final SelenideElement permanentAddress = new P("permanentAddress").getP();
    private final SelenideElement submitButton=new Button("submit").getButton();
    @Step("Переход к форме")
    public void openWindow(){
        window.should(Condition.visible).click();
        linksPage.should(Condition.visible).click();
    }
    @Step("Ввод name")
    public void setUserName(){
        userName.val("Yuriy");
    }
    @Step("Ввод email")
    public void setUserEmail(){
        userEmail.val("dareon@gmail.com");
    }
    @Step("Ввод current address")
    public void setUserCurrentAddress(){
        userCurrentAddress.val("ул. Советская 29");
    }
    @Step("Ввод permanent address")
    public void setUserPermanentAddress(){
        userPermanentAddress.val("ул. Кукушкина 19");
    }
    @Step("Принятие формы")
    public void setSubmitButton(){
        submitButton.should(Condition.visible).click();
    }
    @Step("Проверка введённой информации")
    public void checkInfo(){
        Assertions.assertEquals("Name:Yuriy",name.should(Condition.visible).getText());
        Assertions.assertEquals("Email:dareon@gmail.com",email.should(Condition.visible).getText());
        Assertions.assertEquals("Current Address :ул. Советская 29",currentAddress.should(Condition.visible).getText());
        Assertions.assertEquals("Permananet Address :ул. Кукушкина 19",permanentAddress.should(Condition.visible).getText());
    }
}
