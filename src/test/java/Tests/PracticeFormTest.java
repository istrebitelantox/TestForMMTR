package Tests;

import Interfaces.IPerson;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PracticeFormTest extends BaseTest implements IPerson {
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
