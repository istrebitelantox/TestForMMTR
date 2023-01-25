package pages.Elements;

import SelenideElementsTools.Button;
import SelenideElementsTools.Input;
import SelenideElementsTools.BasePage;
import SelenideElementsTools.Forms;
import io.qameta.allure.Step;

public class WebTables {
    public final BasePage forms = new BasePage("Elements");
    public final Forms webTablesFormOpen =new Forms("Web Tables");
    public final Button addButton = new Button("addNewRecordButton");
    public final Input firstNameInput = new Input("firstName");
    public final Input lastNameInput = new Input("lastName");
    public final Input userEmailInput = new Input("userEmail");
    public final Input ageInput = new Input("age");
    public final Input salaryInput = new Input("salary");
    public final Input departmentInput = new Input("department");
    public final Button submitButton =new Button("submit");
}