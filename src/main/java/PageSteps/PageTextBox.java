package PageSteps;

import Persons.Person;
import SelenideElementsTools.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageTextBox {
    private final SelenideElement window = $(By.cssSelector("div.category-cards>div:nth-child(1)"));
            //new CategoryCards(1).getCategory();
    private final SelenideElement linksPage = $(By.cssSelector("div.accordion > div:nth-child(1) li#item-0"));
            //new FormsPicker(1,0).getItem();
    private final Input userName = new Input("userName");
    private final Input userEmail = new Input("userEmail");
    private final TextArea userCurrentAddress =new TextArea("currentAddress");
    private final TextArea userPermanentAddress = new TextArea("permanentAddress");
    private final P name =new P("name");
    private final P email = new P("email");
    private final P currentAddress = new P("currentAddress");
    private final P permanentAddress = new P("permanentAddress");
    private final Button submitButton=new Button("submit");
    @Step("Переход к форме")
    public void openWindow(){
        window.should(Condition.visible).click();
        linksPage.should(Condition.visible).click();
    }
    @Step("Ввод \"name\"")
    public void setUserName(){
        userName.setInput("Yuriy");
    }
    @Step("Ввод \"email\"")
    public void setUserEmail(){
        userEmail.setInput("dareon@gmail.com");
    }
    @Step("Ввод \"current address\"")
    public void setUserCurrentAddress(){
        userCurrentAddress.setValue("ул. Советская 29");
    }
    @Step("Ввод \"permanent address\"")
    public void setUserPermanentAddress(){
        userPermanentAddress.setValue("ул. Кукушкина 19");
    }
    @Step("Принятие формы")
    public void setSubmitButton(){
        submitButton.setClick();
    }
    @Step("Проверка введённой информации")
    public void checkInfo(Person person){
        name.checkText(person.getName());
        email.checkText(person.getEmail());
        currentAddress.checkText(person.getCurrentAddress());
        permanentAddress.checkText(person.getPermanentAddress());
    }
}
