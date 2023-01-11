package PageSteps;

import SelenideElementsTools.Button;
import SelenideElementsTools.Input;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {
    File file=new File("2.jpg");
    private SelenideElement forms = $(By.xpath("//h5[.='Forms']"));
    private SelenideElement practiceform = $(By.xpath("//span[.='Practice Form']"));
    private Input firstNameInput = new Input("firstName");
    private Input lastNameInput = new Input("lastName");
    private Input userEmailInput =new Input("userEmail");
    private SelenideElement male = $(By.xpath("//label[@class='custom-control-label']"));
    private Input mobileInput = new Input("userNumber");
    private Input dateOfBirthInput =new Input("dateOfBirthInput");
    private SelenideElement month =$(By.xpath("//select[@class='react-datepicker__month-select']"));
    private SelenideElement june =$(By.xpath("//option[@value='5']"));
    private SelenideElement year =$(By.xpath("//select[@class='react-datepicker__month-select']"));
    private SelenideElement year_2003 =$(By.xpath("//option[@value='2003']"));
    private SelenideElement dayofbirth =$(By.xpath("//div[@aria-label='Choose Monday, June 9th, 2003']"));
    private Input uploadInput = new Input("uploadPicture");
    private SelenideElement currentAddressText = $(By.xpath("//textarea[@id='currentAddress']"));
    private Button submitButton =new Button("submit");
    private Button closeButton =new Button("closeLargeModal");


    @Step("Открытие формы для заполнения")
    public void openWindowAndForms(){
        forms.should(Condition.visible).click();
        practiceform.should(Condition.visible).click();
    }
    @Step("Ввод информации о студенте")
    public void nameInfo(String first_name, String last_name) {
        firstNameInput.setInputValue(first_name);
        lastNameInput.setInputValue(last_name);
    }
    @Step("Ввод почты студента")
    public void emailInfo(String user_Email) {
        userEmailInput.setInputValue(user_Email);
    }
    @Step("Ввод пола студента")
    public void genderInfo() {
        male.should(Condition.visible).click();
    }
    @Step("Ввод номера телефона студента")
    public void mobileInfo(String Mobile) {
        mobileInput.setInputValue(Mobile);
    }
    @Step("Ввод даты рождения студента")
    public void dayOfBirthInfo() {
        dateOfBirthInput.setInputClick();
        month.click();
        june.click();
        year.click();
        year_2003.click();
        dayofbirth.click();
    }
    @Step("Добавление фотографии студента")
    public void inputPicture(String repos){
        uploadInput.setInputValue(repos);
    }
    @Step("Ввод адреса студента")
    public void currentAddressInfo(String current_Address){
        currentAddressText.val(current_Address);
    }
    @Step("Подтверждение информации о новом студенте")
    public void inputSubmit(){
        submitButton.setBtnClick();
    }
    @Step("Закрытие заполненой формы")
    public void inputClose(){
        closeButton.setBtnClick();
    }
}
