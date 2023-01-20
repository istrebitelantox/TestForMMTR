package PageSteps.Forms;

import SelenideElementsTools.*;
import io.qameta.allure.Step;

import java.io.File;

public class PracticeForm {
    File file=new File("src/main/resources/avatar.jpg");
    private final BasePage forms = new BasePage("Forms");
    private final Forms practiceForm = new Forms("Practice Form");
    private final Input firstNameInput = new Input("firstName");
    private final Input lastNameInput = new Input("lastName");
    private final Input userEmailInput =new Input("userEmail");
    private final Label genderLabel = new Label("genterWrapper");
    private final Label hobieLabel =new Label("hobbiesWrapper");
    private final Input mobileInput = new Input("userNumber");
    private final Input dateOfBirthInput =new Input("dateOfBirthInput");
    private final Input subjectInput =new Input("subjectsInput");
    private final Input uploadInput = new Input("uploadPicture");
    private final TextArea currentAddressTextArea = new TextArea("currentAddress");
    private final Input stateInput =new Input("react-select-3-input");
    private final Input cityInput =new Input("react-select-4-input");
    private final Button submitButton =new Button("submit");
    private final Button closeButton =new Button("closeLargeModal");


    @Step("Открытие формы для заполнения")
    public void openPracticeForm(){
        forms.openBasePage();
        practiceForm.openFormsPage();
    }
    @Step("Ввод имени студента")
    public void inputFirstName(String first_name) {
        firstNameInput.setInputValue(first_name);
    }
    @Step("Ввод фамилии студента")
    public void inputLastName(String last_name) {
        lastNameInput.setInputValue(last_name);
    }
    @Step("Ввод почты студента")
    public void inputEmail(String user_Email) {
        userEmailInput.setInputValue(user_Email);
    }
    @Step("Ввод пола студента")
    public void setGender(String genderName) {
        genderLabel.setLabel(genderName);
        genderLabel.clickLabel();
    }
    @Step("Ввод номера телефона студента")
    public void inputMobile(String Mobile) {
        mobileInput.setInputValue(Mobile);
    }
    @Step("Ввод даты рождения студента")
    public void inputDayOfBirth(String date) {
        dateOfBirthInput.inputDate(date);
    }
    @Step("Ввод региона")
    public void inputSubject(String subjectName){
        subjectInput.setInputValue(subjectName);
        subjectInput.sendKeyEnt();
    }
    @Step
    public void setHobbies(String hobbiesName){
        hobieLabel.setLabel(hobbiesName);
        hobieLabel.clickLabel();
    }
    @Step("Добавление фотографии студента")
    public void inputPicture(){
        uploadInput.uploadFileInput(file);
    }
    @Step("Ввод адреса студента")
    public void inputCurrentAddress(String current_Address){
        currentAddressTextArea.setTextAreaValue(current_Address);
    }
    @Step("Ввод региона")
    public void inputState(String stateName){
        stateInput.setInputValue(stateName);
        stateInput.sendKeyEnt();
    }
    @Step("Ввод города")
    public void inputCity(String cityName){
        cityInput.setInputValue(cityName);
        cityInput.sendKeyEnt();
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
