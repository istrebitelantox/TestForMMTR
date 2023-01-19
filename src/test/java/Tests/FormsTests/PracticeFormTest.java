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
        practiceForm.openWindowAndForms();
        practiceForm.nameInfo(person.getFirstName(), person.getLastName());
        practiceForm.emailInfo(person.getEmail());
        practiceForm.setGenderInfo();
        practiceForm.mobileInfo(person.getMobile());
        practiceForm.dayOfBirthInfo();
        practiceForm.setHobbies();
        practiceForm.inputPicture();
        practiceForm.currentAddressInfo(person.getCurrentAddress());
        practiceForm.clickSubmit();
        practiceForm.clickClose();

    }
}
