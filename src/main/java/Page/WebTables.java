package Page;
import HelpClass.Button;
import HelpClass.Input;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WebTables {
    Input input=new Input();
    Button button=new Button();
    private SelenideElement forms =  $(By.xpath("//h5[.='Elements']"));
    private SelenideElement webTablesFormOpen = $(By.xpath("//span[.='Web Tables']"));
    private SelenideElement addButton = button.getButton("addNewRecordButton");
    private SelenideElement firstNameInput = input.getInput("firstName");
    private SelenideElement lastNameInput = input.getInput("lastName");
    private SelenideElement userEmailInput = input.getInput("userEmail");
    private SelenideElement ageInput = input.getInput("age");
    private SelenideElement salaryInput = input.getInput("salary");
    private SelenideElement departmentInput = input.getInput("department");
    private SelenideElement submitButton =button.getButton("submit");

    @Step("Открытие формы для заполнения")
    public void openWindowAndForms(){
        forms.should(Condition.visible).click();
        webTablesFormOpen.should(Condition.visible).click();
        addButton.should(Condition.visible).click();
    }
    @Step("Ввод информации о работнике")
    public void nameInformation(String first_name,String last_name){
        firstNameInput.should(Condition.visible).val(first_name);
        lastNameInput.should(Condition.visible).val(last_name);
    }
    @Step("Ввод почты работника")
    public void emailInformation(String user_Email) {
        userEmailInput.should(Condition.visible).val(user_Email);
    }
    @Step("Ввод возраста работника")
    public void ageInformation(String age) {
        this.ageInput.should(Condition.visible).val(age);
    }
    @Step("Ввод зарплаты пользователя")
    public void salaryInformation(String Salary) {
        salaryInput.should(Condition.visible).val(Salary);
    }
    @Step("Ввод подразделения работника")
    public void departmentInformation(String Department) {
        departmentInput.should(Condition.visible).val(Department);
    }
    @Step("Подтверждение информации о новом работнике")
    public void inputSubmit(){
        submitButton.click();
    }
}