package pages.Elements;

import Persons.Person;
import SelenideElementsTools.*;
import io.qameta.allure.Step;

public class PageTextBox {
    public final BasePage forms = new BasePage("Elements");
    public final Forms linksPage = new Forms("Text Box");
    public final Input userNameInput = new Input("userName");
    public final Input userEmailInput = new Input("userEmail");
    public final TextArea userCurrentAddressTextArea =new TextArea("currentAddress");
    public final TextArea userPermanentAddressTextArea = new TextArea("permanentAddress");
    public final P name =new P("name");
    public final P email = new P("email");
    public final P currentAddress = new P("currentAddress");
    public final P permanentAddress = new P("permanentAddress");
    public final Button submitButton=new Button("submit");

}