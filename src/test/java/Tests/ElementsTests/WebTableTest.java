package Tests.ElementsTests;

import Interfaces.IEmployee;
import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@Feature("ElementsTests")
public class WebTableTest extends BaseTest implements IEmployee {
    @Link(name="Ссылка на Web Table",url = "https://demoqa.com/webtables")
    @DisplayName("Тестирование \"Web Tables\"")
    @Test
    public void webTableTest()
    {
        webTables.openWindowAndForms();
        webTables.openRegistrationForm();
        webTables.nameInformation(employee.getFirstName(),employee.getLastName());
        webTables.emailInformation(employee.getEmail());
        webTables.ageInformation(employee.getAge());
        webTables.salaryInformation(employee.getSalary());
        webTables.departmentInformation(employee.getDepartment());
        webTables.inputSubmit();
    }
}
