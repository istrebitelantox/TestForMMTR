package Page;

import HelpClass.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageTextBox {
    Input input=new Input();
    P p=new P();
    Button button=new Button();
    private final SelenideElement window = $(By.cssSelector("div.category-cards>div:nth-child(1)"));
            //new CategoryCards(1).getCategory();
    private final SelenideElement linksPage = $(By.cssSelector("div.accordion > div:nth-child(1) li#item-0"));
            //new FormsPicker(1,0).getItem();
    private final SelenideElement userName = input.getInput("userName");
    private final SelenideElement userEmail = input.getInput("userEmail");
    private final SelenideElement userCurrentAddress =$(By.cssSelector("textarea#currentAddress"));
    private final SelenideElement userPermanentAddress = $(By.cssSelector("textarea#permanentAddress"));
    private final SelenideElement name =p.getP("name");
    private final SelenideElement email = p.getP("email");
    private final SelenideElement currentAddress = p.getP("currentAddress");
    private final SelenideElement permanentAddress = p.getP("permanentAddress");
    private final SelenideElement submitButton=button.getButton("submit");
    @Step("Переход к форме")
    public void openWindow(){
        window.should(Condition.visible).click();
        linksPage.should(Condition.visible).click();
    }
    @Step("Ввод \"name\"")
    public void setUserName(){
        userName.val("Yuriy");
    }
    @Step("Ввод \"email\"")
    public void setUserEmail(){
        userEmail.val("dareon@gmail.com");
    }
    @Step("Ввод \"current address\"")
    public void setUserCurrentAddress(){
        userCurrentAddress.val("ул. Советская 29");
    }
    @Step("Ввод \"permanent address\"")
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
