package PageSteps;

import Persons.Person;
import SelenideElementsTools.*;
import io.qameta.allure.Step;

public class PageTextBox {
    private final OpenBasePage forms = new OpenBasePage("Elements");
    private final OpenForms linksPage = new OpenForms("Text Box");
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
        forms.openBasePage();
        linksPage.openFormsPage();
    }
    @Step("Ввод \"name\"")
    public void setUserName(){
        userName.setInputValue("Yuriy");
    }
    @Step("Ввод \"email\"")
    public void setUserEmail(){
        userEmail.setInputValue("dareon@gmail.com");
    }
    @Step("Ввод \"current address\"")
    public void setUserCurrentAddress(){
        userCurrentAddress.setTextAreaValue("ул. Советская 29");
    }
    @Step("Ввод \"permanent address\"")
    public void setUserPermanentAddress(){
        userPermanentAddress.setTextAreaValue("ул. Кукушкина 19");
    }
    @Step("Принятие формы")
    public void setSubmitButton(){
        submitButton.setBtnClick();
    }
    @Step("Проверка введённой информации")
    public void checkInfo(Person person){
        name.pCheckText(person.getFirstName());
        email.pCheckText(person.getEmail());
        currentAddress.pCheckText(person.getCurrentAddress());
        permanentAddress.pCheckText(person.getPermanentAddress());
    }
}
