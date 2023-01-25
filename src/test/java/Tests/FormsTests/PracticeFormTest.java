package Tests.FormsTests;

import Interfaces.IPerson;
import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("FormsTests")
public class PracticeFormTest extends BaseTest implements IPerson {
    @Link(name = "Ссылка на Practice Form", url = "https://demoqa.com/automation-practice-form")
    @DisplayName("Тестирование \"Practice Form\"")
    @Test
    public void practiceFormTest() {
        step_1();
        step_2(person.getFirstName());
        step_3(person.getLastName());
        step_4(person.getEmail());
        step_5(person.getGender());
        step_6(person.getMobile());
        step_7(person.getDateOfBirth());
        step_8(person.getSubject());
        step_9(person.getHobie());
        step_10();
        step_11(person.getCurrentAddress());
        step_12(person.getState());
        step_13(person.getCity());
        step_14();
        step_15();
    }

    @Step("Открытие формы для заполнения")
    public void step_1() {
        practiceForm.forms.openBasePage();
        practiceForm.practiceForm.openFormsPage();
    }

    @Step("Ввод имени студента")
    public void step_2(String first_name) {
        practiceForm.firstNameInput.setInputValue(first_name);
    }

    @Step("Ввод фамилии студента")
    public void step_3(String last_name) {
        practiceForm.lastNameInput.setInputValue(last_name);
    }

    @Step("Ввод почты студента")
    public void step_4(String user_Email) {
        practiceForm.userEmailInput.setInputValue(user_Email);
    }

    @Step("Ввод пола студента")
    public void step_5(String genderName) {
        practiceForm.genderLabel.setLabel(genderName);
        practiceForm.genderLabel.clickLabel();
    }

    @Step("Ввод номера телефона студента")
    public void step_6(String Mobile) {
        practiceForm.mobileInput.setInputValue(Mobile);
    }

    @Step("Ввод даты рождения студента")
    public void step_7(String date) {
        practiceForm.dateOfBirthInput.inputDate(date);
    }

    @Step("Ввод региона")
    public void step_8(String subjectName) {
        practiceForm.subjectInput.setInputValue(subjectName);
        practiceForm.subjectInput.sendKeyEnt();
    }

    @Step
    public void step_9(String hobbiesName) {
        practiceForm.hobieLabel.setLabel(hobbiesName);
        practiceForm.hobieLabel.clickLabel();
    }

    @Step("Добавление фотографии студента")
    public void step_10() {
        practiceForm.uploadInput.uploadFileInput(practiceForm.file);
    }

    @Step("Ввод адреса студента")
    public void step_11(String current_Address) {
        practiceForm.currentAddressTextArea.setTextAreaValue(current_Address);
    }

    @Step("Ввод региона")
    public void step_12(String stateName) {
        practiceForm.stateInput.setInputValue(stateName);
        practiceForm.stateInput.sendKeyEnt();
    }

    @Step("Ввод города")
    public void step_13(String cityName) {
        practiceForm.cityInput.setInputValue(cityName);
        practiceForm.cityInput.sendKeyEnt();
    }

    @Step("Подтверждение информации о новом студенте")
    public void step_14() {
        practiceForm.submitButton.setBtnClick();
    }

    @Step("Закрытие заполненой формы")
    public void step_15() {
        practiceForm.closeButton.setBtnClick();
    }
}