package Tests;

import Interfaces.IPerson;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class PracticeFormTest extends BaseTest implements IPerson {
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
        Selenide.sleep(9000);
        practiceForm.clickClose();

    }
}
