package org.example.Tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.example.HelpClass.Button;
import org.example.HelpClass.Input;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;

public class WebTables {
    private SelenideElement forms = $(By.xpath("//h5[.='Elements']"));
    private SelenideElement practiceform = $(By.xpath("//span[.='Web Tables']"));
    private SelenideElement add = new Button("addNewRecordButton").getButton();
    private SelenideElement firstName = new Input("firstName").getInput();
    private SelenideElement lastName = new Input("lastName").getInput();
    private SelenideElement userEmail = new Input("userEmail").getInput();
    private SelenideElement age = new Input("age").getInput();
    private SelenideElement salary = new Input("salary").getInput();
    private SelenideElement department = new Input("department").getInput();
    private SelenideElement submit =new Button("submit").getButton();

    @Step("Открытие формы для заполнения")
    public void openWindowAndForms(){
        forms.should(Condition.visible).click();
        practiceform.should(Condition.visible).click();
        add.should(Condition.visible).click();
    }
    @Step("Ввод информации о работнике")
    public void nameInformation(String first_name,String last_name){
        firstName.should(Condition.visible).val(first_name);
        lastName.should(Condition.visible).val(last_name);
    }
    @Step("Ввод почты работника")
    public void emailInformation(String user_Email) {
        userEmail.should(Condition.visible).val(user_Email);
    }
    @Step("Ввод возраста работника")
    public void ageInformation(String age) {
        this.age.should(Condition.visible).val(age);
    }
    @Step("Ввод зарплаты пользователя")
    public void salaryInformation(String Salary) {
        salary.should(Condition.visible).val(Salary);
    }
    @Step("Ввод подразделения работника")
    public void departmentInformation(String Department) {
        department.should(Condition.visible).val(Department);
    }
    @Step("Подтверждение информации о новом работнике")
    public void inputSubmit(){
        submit.click();
    }
}