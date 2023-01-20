package Tests.FormsTests;

import Interfaces.IPerson;
import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@Feature("FormsTests")
public class PracticeFormTest extends BaseTest implements IPerson {
    @Link(name="Ссылка на Practice Form",url = "https://demoqa.com/automation-practice-form")
    @DisplayName("Тестирование \"Practice Form\"")
    @Test
    public void practiceFormTest(){
        practiceForm.openPracticeForm();
        practiceForm.inputFirstName(person.getFirstName());
        practiceForm.inputLastName(person.getLastName());
        practiceForm.inputEmail(person.getEmail());
        practiceForm.setGender(person.getGender());
        practiceForm.inputMobile(person.getMobile());
        practiceForm.inputDayOfBirth(person.getDateOfBirth());
        practiceForm.inputSubject(person.getSubject());
        practiceForm.setHobbies(person.getHobie());
        practiceForm.inputPicture();
        practiceForm.inputCurrentAddress(person.getCurrentAddress());
        practiceForm.inputState(person.getState());
        practiceForm.inputCity(person.getCity());
        practiceForm.clickSubmit();
        practiceForm.clickClose();

    }
}
