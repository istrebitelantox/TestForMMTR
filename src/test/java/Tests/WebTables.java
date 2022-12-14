package Tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;

public class WebTables {
    private static String baseUrl = "https://demoqa.com/";
    private SelenideElement forms = $(By.xpath("//h5[.='Elements']"));
    private SelenideElement practiceform = $(By.xpath("//span[.='Web Tables']"));
    private SelenideElement add = $(By.xpath("//button[@id='addNewRecordButton']"));
    private SelenideElement firstName = $(By.xpath("//input[@id='firstName']"));
    private SelenideElement lastName = $(By.xpath("//input[@id='lastName']"));
    private SelenideElement userEmail = $(By.xpath("//input[@id='userEmail']"));
    private SelenideElement age = $(By.xpath("//input[@id='age']"));
    private SelenideElement salary = $(By.xpath("//input[@id='salary']"));
    private SelenideElement department = $(By.xpath("//input[@id='department']"));
    private SelenideElement submit =$(By.xpath("//button[@id='submit']"));

    @Step("Открытие формы для заполнения")
    public void openWindowAndForms(){
        open(baseUrl);
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