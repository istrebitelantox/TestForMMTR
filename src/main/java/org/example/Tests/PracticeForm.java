package org.example.Tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import org.example.HelpClass.Button;
import org.example.HelpClass.Input;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {
    File file=new File("2.jpg");
    private SelenideElement forms = $(By.xpath("//h5[.='Forms']"));
    private SelenideElement practiceform = $(By.xpath("//span[.='Practice Form']"));
    private SelenideElement firstName = new Input("firstName").getInput();
    private SelenideElement lastName = new Input("lastName").getInput();
    private SelenideElement userEmail =new Input("userEmail").getInput();
    private SelenideElement male = $(By.xpath("//label[@class='custom-control-label']"));
    private SelenideElement mobile = new Input("userNumber").getInput();
    private SelenideElement dateofbirth =new Input("dateOfBirthInput").getInput();
    private SelenideElement month =$(By.xpath("//select[@class='react-datepicker__month-select']"));
    private SelenideElement june =$(By.xpath("//option[@value='5']"));
    private SelenideElement year =$(By.xpath("//select[@class='react-datepicker__month-select']"));
    private SelenideElement year_2003 =$(By.xpath("//option[@value='2003']"));
    private SelenideElement dayofbirth =$(By.xpath("//div[@aria-label='Choose Monday, June 9th, 2003']"));
    private SelenideElement uploadInput = new Input("uploadPicture").getInput();
    private SelenideElement currentAddress = $(By.xpath("//textarea[@id='currentAddress']"));
    private SelenideElement submitButton =new Button("submit").getButton();
    private SelenideElement closeButton =new Button("closeLargeModal").getButton();


    @Step("Открытие формы для заполнения")
    public void openWindowAndForms(){
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
