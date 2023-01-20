package PageSteps.Elements;

import Persons.Person;
import SelenideElementsTools.*;
import io.qameta.allure.Step;

public class PageTextBox {
    private final BasePage forms = new BasePage("Elements");
    private final Forms linksPage = new Forms("Text Box");
    private final Input userNameInput = new Input("userName");
    private final Input userEmailInput = new Input("userEmail");
    private final TextArea userCurrentAddressTextArea =new TextArea("currentAddress");
    private final TextArea userPermanentAddressTextArea = new TextArea("permanentAddress");
    private final P name =new P("name");
    private final P email = new P("email");
    private final P currentAddress = new P("currentAddress");
    private final P permanentAddress = new P("permanentAddress");
    private final Button submitButton=new Button("submit");
    @Step("Переход к форме")
    public void openTextBoxForm(){
        forms.openBasePage();
        linksPage.openFormsPage();
    }
    @Step("Ввод \"name\"")
    public void inputUserName(String firstName){
        userNameInput.setInputValue(firstName);
    }
    @Step("Ввод \"email\"")
    public void inputUserEmail(String email){
        userEmailInput.setInputValue(email);
    }
    @Step("Ввод \"current address\"")
    public void inputUserCurrentAddress(String currentAddress){
        userCurrentAddressTextArea.setTextAreaValue(currentAddress);
    }
    @Step("Ввод \"permanent address\"")
    public void inputUserPermanentAddress(String permanentAddress){
        userPermanentAddressTextArea.setTextAreaValue(permanentAddress);
    }
    @Step("Принятие формы")
    public void clickSubmitButton(){
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
