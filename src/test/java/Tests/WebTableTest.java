package Tests;

import Interfaces.IEmployee;
import org.junit.jupiter.api.Test;

public class WebTableTest extends BaseTest implements IEmployee {
    @Test
    public void webTableTest()
    {
        webTables.openWindowAndForms();
        webTables.nameInformation(employee.getFirstName(),employee.getLastName());
        webTables.emailInformation(employee.getEmail());
        webTables.ageInformation(employee.getAge());
        webTables.salaryInformation(employee.getSalary());
        webTables.departmentInformation(employee.getDepartment());
        webTables.inputSubmit();
    }
}
