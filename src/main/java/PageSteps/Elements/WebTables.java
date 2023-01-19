package PageSteps.Elements;

import SelenideElementsTools.Button;
import SelenideElementsTools.Input;
import SelenideElementsTools.OpenBasePage;
import SelenideElementsTools.OpenForms;
import io.qameta.allure.Step;

public class WebTables {
    private OpenBasePage forms = new OpenBasePage("Elements");
    private OpenForms webTablesFormOpen =new OpenForms("Web Tables");
    private Button addButton = new Button("addNewRecordButton");
    private Input firstNameInput = new Input("firstName");
    private Input lastNameInput = new Input("lastName");
    private Input userEmailInput = new Input("userEmail");
    private Input ageInput = new Input("age");
    private Input salaryInput = new Input("salary");
    private Input departmentInput = new Input("department");
    private Button submitButton =new Button("submit");

    @Step("Открытие формы \"Web Table\"")
    public void openWindowAndForms(){
        forms.openBasePage();
        webTablesFormOpen.openFormsPage();
    }
    @Step("Открытие \"Registration Form\"")
    public void openRegistrationForm(){
        addButton.setBtnClick();
    }
    @Step("Ввод информации о работнике")
    public void nameInformation(String first_name,String last_name){
        firstNameInput.setInputValue(first_name);
        lastNameInput.setInputValue(last_name);
    }
    @Step("Ввод почты работника")
    public void emailInformation(String user_Email) {
        userEmailInput.setInputValue(user_Email);
    }
    @Step("Ввод возраста работника")
    public void ageInformation(String age) {
        this.ageInput.setInputValue(age);
    }
    @Step("Ввод зарплаты пользователя")
    public void salaryInformation(String Salary) {
        salaryInput.setInputValue(Salary);
    }
    @Step("Ввод подразделения работника")
    public void departmentInformation(String Department) {
        departmentInput.setInputValue(Department);
    }
    @Step("Подтверждение информации о новом работнике")
    public void inputSubmit(){
        submitButton.setBtnClick();
    }
}