package PageSteps.Elements;

import SelenideElementsTools.Button;
import SelenideElementsTools.Input;
import SelenideElementsTools.BasePage;
import SelenideElementsTools.Forms;
import io.qameta.allure.Step;

public class WebTables {
    private final BasePage forms = new BasePage("Elements");
    private final Forms webTablesFormOpen =new Forms("Web Tables");
    private final Button addButton = new Button("addNewRecordButton");
    private final Input firstNameInput = new Input("firstName");
    private final Input lastNameInput = new Input("lastName");
    private final Input userEmailInput = new Input("userEmail");
    private final Input ageInput = new Input("age");
    private final Input salaryInput = new Input("salary");
    private final Input departmentInput = new Input("department");
    private final Button submitButton =new Button("submit");

    @Step("Открытие формы \"Web Table\"")
    public void openWebTableForm(){
        forms.openBasePage();
        webTablesFormOpen.openFormsPage();
    }
    @Step("Открытие \"Registration Form\"")
    public void openRegistrationForm(){
        addButton.setBtnClick();
    }
    @Step("Ввод имени работника")
    public void inputFirstName(String first_name){
        firstNameInput.setInputValue(first_name);
    }
    @Step("Ввод фамилии работника")
    public void inputLastName(String last_name){
        lastNameInput.setInputValue(last_name);
    }
    @Step("Ввод почты работника")
    public void inputEmail(String user_Email) {
        userEmailInput.setInputValue(user_Email);
    }
    @Step("Ввод возраста работника")
    public void inputAge(String age) {
        this.ageInput.setInputValue(age);
    }
    @Step("Ввод зарплаты пользователя")
    public void inputSalary(String Salary) {
        salaryInput.setInputValue(Salary);
    }
    @Step("Ввод подразделения работника")
    public void inputDepartment(String Department) {
        departmentInput.setInputValue(Department);
    }
    @Step("Подтверждение информации о новом работнике")
    public void clickSubmit(){
        submitButton.setBtnClick();
    }
}