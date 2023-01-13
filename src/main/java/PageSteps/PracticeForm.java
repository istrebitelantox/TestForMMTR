package PageSteps;

import SelenideElementsTools.*;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class PracticeForm {
    File file=new File("avatar.jpg");
    private final OpenBasePage forms = new OpenBasePage("Forms");
    private final OpenForms practiceform = new OpenForms("Practice Form");
    private final Input firstNameInput = new Input("firstName");
    private final Input lastNameInput = new Input("lastName");
    private final Input userEmailInput =new Input("userEmail");
    private final Label male = new Label("genterWrapper","Male");
    private final Label sport=new Label("hobbiesWrapper","Sports");
    private final Input mobileInput = new Input("userNumber");
    private final Input dateOfBirthInput =new Input("dateOfBirthInput");
    private final Input uploadInput = new Input("uploadPicture");
    private final TextArea currentAddressText = new TextArea("currentAddress");
    private final Button submitButton =new Button("submit");
    private final Button closeButton =new Button("closeLargeModal");


    @Step("Открытие формы для заполнения")
    public void openWindowAndForms(){
        forms.openBasePage();
        practiceform.openFormsPage();
    }
    @Step("Ввод информации о студенте")
    public void nameInfo(String first_name, String last_name) {
        firstNameInput.sadsda();
        firstNameInput.setInputValue(first_name);
        lastNameInput.setInputValue(last_name);
    }
    @Step("Ввод почты студента")
    public void emailInfo(String user_Email) {
        userEmailInput.setInputValue(user_Email);
    }
    @Step("Ввод пола студента")
    public void setGenderInfo() {
        male.clickLabel();
    }
    @Step("Ввод номера телефона студента")
    public void mobileInfo(String Mobile) {
        mobileInput.setInputValue(Mobile);
    }
    @Step("Ввод даты рождения студента")
    public void dayOfBirthInfo() {
        dateOfBirthInput.inputDate("06.09.2003");
/*        dateOfBirthInput.setInputValue("06.09.2003");
        for (int i = 0; i < 3; i++) {
            dateOfBirthInput.sendKeysCtrlAndLeft();
        }
        while (dateOfBirthInput.getInputValue().length()>10){
            dateOfBirthInput.sendKeyDel();
        }
        dateOfBirthInput.sendKeyEnt();*/
    }
    @Step
    public void setHobbies(){
        sport.clickLabel();
    }
    @Step("Добавление фотографии студента")
    public void inputPicture(){
        uploadInput.uploadFileInput(file);
    }
    @Step("Ввод адреса студента")
    public void currentAddressInfo(String current_Address){
        currentAddressText.setTextAreaValue(current_Address);
    }
    @Step("Подтверждение информации о новом студенте")
    public void clickSubmit(){
        submitButton.setBtnClick();
    }
    @Step("Закрытие заполненой формы")
    public void clickClose(){
        closeButton.setBtnClick();
    }
}
