package PageSteps;

import SelenideElementsTools.Button;
import SelenideElementsTools.Input;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WebTables {
    private ElementsCollection forms = $$(By.cssSelector("div.category-cards h5"));
            //$(By.xpath("//h5[.='Elements']"));
    //private SelenideElement webTablesFormOpen =$$(By.cssSelector("div.element-list")).findBy(text("Web Tables")).find("#item-3");
    private ElementsCollection webTablesFormOpen =$$(By.cssSelector("ul.menu-list li"));
    private Button addButton = new Button("addNewRecordButton");
    private Input firstNameInput = new Input("firstName");
    private Input lastNameInput = new Input("lastName");
    private Input userEmailInput = new Input("userEmail");
    private Input ageInput = new Input("age");
    private Input salaryInput = new Input("salary");
    private Input departmentInput = new Input("department");
    private Button submitButton =new Button("submit");

    @Step("Открытие формы для заполнения")
    public void openWindowAndForms(){
        forms.find(exactText("Elements")).click();
        webTablesFormOpen.find(exactText("Web Tables")).click();
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