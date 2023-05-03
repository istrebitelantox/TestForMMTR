package Tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {
    private static String baseUrl = "https://demoqa.com/";
    private SelenideElement forms = $(By.xpath("//h5[.='Forms']"));
    private SelenideElement practiceform = $(By.xpath("//span[.='Practice Form']"));
    private SelenideElement firstName = $(By.xpath("//input[@id='firstName']"));
    private SelenideElement lastName = $(By.xpath("//input[@id='lastName']"));
    private SelenideElement userEmail = $(By.xpath("//input[@id='userEmail']"));
    private SelenideElement male = $(By.xpath("//label[@class='custom-control-label']"));
    private SelenideElement mobile = $(By.xpath("//input[@id='userNumber']"));
    private SelenideElement dateofbirth =$(By.xpath("//input[@id='dateOfBirthInput']"));
    private SelenideElement month =$(By.xpath("//select[@class='react-datepicker__month-select']"));
    private SelenideElement june =$(By.xpath("//option[@value='5']"));

    private SelenideElement year =$(By.xpath("//select[@class='react-datepicker__month-select']"));
    private SelenideElement year_2003 =$(By.xpath("//option[@value='2003']"));
    private SelenideElement dayofbirth =$(By.xpath("//div[@aria-label='Choose Monday, June 9th, 2003']"));
    private SelenideElement uploadInput = $(By.xpath("//input[@id='uploadPicture']"));
    private SelenideElement currentAddress = $(By.xpath("//textarea[@id='currentAddress']"));
    private SelenideElement submitButton =$(By.xpath("//button[@id='submit']"));
    private SelenideElement closeButton =$(By.xpath("//button[@id='closeLargeModal']"));


    @Step("Открытие формы для заполнения")
    public void openWindowAndForms(){
        open(baseUrl);
        forms.should(Condition.visible).click();
        practiceform.should(Condition.visible).click();
    }
    @Step("Ввод информации о студенте")
    public void nameInfo(String first_name, String last_name) {
        firstName.should(Condition.visible).val(first_name);
        lastName.should(Condition.visible).val(last_name);
    }
    @Step("Ввод почты студента")
    public void emailInfo(String user_Email) {
        userEmail.should(Condition.visible).val(user_Email);
    }
    @Step("Ввод пола студента")
    public void genderInfo() {
        male.should(Condition.visible).click();
    }
    @Step("Ввод номера телефона студента")
    public void mobileInfo(String Mobile) {
        mobile.should(Condition.visible).val(Mobile);
    }
    @Step("Ввод даты рождения студента")
    public void dayOfBirthInfo() {
        dateofbirth.should(Condition.visible).click();
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
        currentAddress.val(current_Address);
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
