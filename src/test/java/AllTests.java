import Persons.Employee;
import Persons.Person;
import SelenideElementsTools.HomePage;
import PageSteps.*;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;
public class AllTests {
    PageModal pageModal =new PageModal();
    PageTextBox pageTextBox =new PageTextBox();
    HomePage homePage=new HomePage();
    WebTables webTables=new WebTables();
    Person person=new Person("Yuriy","dareon@gmail.com","ул. Советская 29","ул. Кукушкина 19");
    Employee employee=new Employee("Yuriy","Gruzdev","dareon@gmail.com","19","20000","QA");

    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000;
        Configuration.browserSize = "1920x1080";
    }
    @BeforeEach
    public void Url(){
        open(homePage.getBaseUrl());
    }

    @Test
    public void modalTest()
    {
        pageModal.openWindow();
        pageModal.setSmallModal();
        pageModal.checkSmallModalClick();
        pageModal.clickCloseSmallModal();
        pageModal.setLargeModal();
        pageModal.checkLargeModalClick();
        pageModal.clickCloseLargeModal();
    }
    @Test
    public void textBoxTest()
    {
        pageTextBox.openWindow();
        pageTextBox.setUserName();
        pageTextBox.setUserEmail();
        pageTextBox.setUserCurrentAddress();
        pageTextBox.setUserPermanentAddress();
        pageTextBox.setSubmitButton();
        pageTextBox.checkInfo(person);
    }
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
