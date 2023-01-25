package Tests.ElementsTests;

import Interfaces.IEmployee;
import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@Feature("ElementsTests")
public class WebTableTest extends BaseTest implements IEmployee {
    @Link(name="Ссылка на Web Table",url = "https://demoqa.com/webtables")
    @DisplayName("Тестирование \"Web Tables\"")
    @Test
    public void webTableTest()
    {
        step_1();
        step_2();
        step_3(employee.getFirstName());
        step_4(employee.getLastName());
        step_5(employee.getEmail());
        step_6(employee.getAge());
        step_7(employee.getSalary());
        step_8(employee.getDepartment());
        step_9();
    }
    @Step("Открытие формы \"Web Table\"")
    public void step_1(){
        webTables.forms.openBasePage();
        webTables.webTablesFormOpen.openFormsPage();
    }
    @Step("Открытие \"Registration Form\"")
    public void step_2(){
        webTables.addButton.setBtnClick();
    }
    @Step("Ввод имени работника")
    public void step_3(String first_name){
        webTables.firstNameInput.setInputValue(first_name);
    }
    @Step("Ввод фамилии работника")
    public void step_4(String last_name){
        webTables.lastNameInput.setInputValue(last_name);
    }
    @Step("Ввод почты работника")
    public void step_5(String user_Email) {
        webTables.userEmailInput.setInputValue(user_Email);
    }
    @Step("Ввод возраста работника")
    public void step_6(String age) {
        webTables.ageInput.setInputValue(age);
    }
    @Step("Ввод зарплаты пользователя")
    public void step_7(String Salary) {
        webTables.salaryInput.setInputValue(Salary);
    }
    @Step("Ввод подразделения работника")
    public void step_8(String Department) {
        webTables.departmentInput.setInputValue(Department);
    }
    @Step("Подтверждение информации о новом работнике")
    public void step_9(){
        webTables.submitButton.setBtnClick();
    }
}