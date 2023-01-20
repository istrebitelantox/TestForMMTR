package Tests.ElementsTests;

import Interfaces.IPerson;
import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@Feature("ElementsTests")
public class TextBoxTest extends BaseTest implements IPerson{
    @DisplayName("Тестирование \"Text Box\"")
    @Link(name="Ссылка на Text Box",url = "https://demoqa.com/text-box")
    @Test
    public void textBoxTest()
    {
        pageTextBox.openTextBoxForm();
        pageTextBox.inputUserName(person.getFirstName());
        pageTextBox.inputUserEmail(person.getEmail());
        pageTextBox.inputUserCurrentAddress(person.getCurrentAddress());
        pageTextBox.inputUserPermanentAddress(person.getPermanentAddress());
        pageTextBox.clickSubmitButton();
        pageTextBox.checkInfo(person);
    }
}
