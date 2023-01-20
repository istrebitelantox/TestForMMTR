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
        webTables.openWebTableForm();
        webTables.openRegistrationForm();
        webTables.inputFirstName(employee.getFirstName());
        webTables.inputLastName(employee.getLastName());
        webTables.inputEmail(employee.getEmail());
        webTables.inputAge(employee.getAge());
        webTables.inputSalary(employee.getSalary());
        webTables.inputDepartment(employee.getDepartment());
        webTables.clickSubmit();
    }
}
