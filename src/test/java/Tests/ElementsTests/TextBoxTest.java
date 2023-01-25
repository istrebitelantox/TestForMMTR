package Tests.ElementsTests;

import Interfaces.IPerson;
import Persons.Person;
import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@Feature("ElementsTests")
public class TextBoxTest extends BaseTest implements IPerson{
    @DisplayName("Тестирование \"Text Box\"")
    @Link(name="Ссылка на Text Box",url = "https://demoqa.com/text-box")
    @Test
    public void textBoxTest()
    {
        step_1();
        step_2(person.getFirstName());
        step_3(person.getEmail());
        step_4(person.getCurrentAddress());
        step_5(person.getPermanentAddress());
        step_6();
        step_7(person);
    }
    @Step("Переход к форме")
    public void step_1(){
        pageTextBox.forms.openBasePage();
        pageTextBox.linksPage.openFormsPage();
    }
    @Step("Ввод \"name\"")
    public void step_2(String firstName){
        pageTextBox.userNameInput.setInputValue(firstName);
    }
    @Step("Ввод \"email\"")
    public void step_3(String email){
        pageTextBox.userEmailInput.setInputValue(email);
    }
    @Step("Ввод \"current address\"")
    public void step_4(String currentAddress){
        pageTextBox.userCurrentAddressTextArea.setTextAreaValue(currentAddress);
    }
    @Step("Ввод \"permanent address\"")
    public void step_5(String permanentAddress){
        pageTextBox.userPermanentAddressTextArea.setTextAreaValue(permanentAddress);
    }
    @Step("Принятие формы")
    public void step_6(){
        pageTextBox.submitButton.setBtnClick();
    }
    @Step("Проверка введённой информации")
    public void step_7(Person person){
        pageTextBox.name.pCheckText(person.getFirstName());
        pageTextBox.email.pCheckText(person.getEmail());
        pageTextBox.currentAddress.pCheckText(person.getCurrentAddress());
        pageTextBox.permanentAddress.pCheckText(person.getPermanentAddress());
    }
}