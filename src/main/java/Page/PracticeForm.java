package Page;

import HelpClass.Button;
import HelpClass.Input;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {
    Input input=new Input();
    Button button=new Button();
    File file=new File("2.jpg");
    private SelenideElement forms = $(By.xpath("//h5[.='Forms']"));
    private SelenideElement practiceform = $(By.xpath("//span[.='Practice Form']"));
    private SelenideElement firstNameInput = input.getInput("firstName");
    private SelenideElement lastNameInput = input.getInput("lastName");
    private SelenideElement userEmailInput =input.getInput("userEmail");
    private SelenideElement male = $(By.xpath("//label[@class='custom-control-label']"));
    private SelenideElement mobileInput = input.getInput("userNumber");
    private SelenideElement dateOfBirthInput =input.getInput("dateOfBirthInput");
    private SelenideElement month =$(By.xpath("//select[@class='react-datepicker__month-select']"));
    private SelenideElement june =$(By.xpath("//option[@value='5']"));
    private SelenideElement year =$(By.xpath("//select[@class='react-datepicker__month-select']"));
    private SelenideElement year_2003 =$(By.xpath("//option[@value='2003']"));
    private SelenideElement dayofbirth =$(By.xpath("//div[@aria-label='Choose Monday, June 9th, 2003']"));
    private SelenideElement uploadInput = input.getInput("uploadPicture");
    private SelenideElement currentAddressText = $(By.xpath("//textarea[@id='currentAddress']"));
    private SelenideElement submitButton =button.getButton("submit");
    private SelenideElement closeButton =button.getButton("closeLargeModal");


    @Step("Открытие формы для заполнения")
    public void openWindowAndForms(){
        forms.should(Condition.visible).click();
        practiceform.should(Condition.visible).click();
    }
    @Step("Ввод информации о студенте")
    public void nameInfo(String first_name, String last_name) {
        firstNameInput.should(Condition.visible).val(first_name);
        lastNameInput.should(Condition.visible).val(last_name);
    }
    @Step("Ввод почты студента")
    public void emailInfo(String user_Email) {
        userEmailInput.should(Condition.visible).val(user_Email);
    }
    @Step("Ввод пола студента")
    public void genderInfo() {
        male.should(Condition.visible).click();
    }
    @Step("Ввод номера телефона студента")
    public void mobileInfo(String Mobile) {
        mobileInput.should(Condition.visible).val(Mobile);
    }
    @Step("Ввод даты рождения студента")
    public void dayOfBirthInfo() {
        dateOfBirthInput.should(Condition.visible).click();
        month.click();
        june.click();
        year.click();
        year_2003.click();
        dayofbirth.click();
    }
    @Step("Добавление фотографии студента")
    public void inputPicture(String repos){
        uploadInput.val(repos);
    }
    @Step("Ввод адреса студента")
    public void currentAddressInfo(String current_Address){
        currentAddressText.val(current_Address);
    }
    @Step("Подтверждение информации о новом студенте")
    public void inputSubmit(){
        submitButton.click();
    }
    @Step("Закрытие заполненой формы")
    public void inputClose(){
        closeButton.click();
    }
}
