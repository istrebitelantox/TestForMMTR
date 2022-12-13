import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Tests.*;
import io.qameta.allure.*;
import org.testng.ITestResult;


public class AllTests {

    PracticeForm practiceFormTest=new PracticeForm();
    WebTablesTest webTablesTest=new WebTablesTest();
    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000; // Умное ожидание появление элемента на странице
        Configuration.browserSize = "1620x1080"; // Умно
    }
    @Test()
    public void WebTableTest()
    {
        webTablesTest.openWindowAndForms();
        webTablesTest.nameInformation("Yuriy","Gruzdev");
        webTablesTest.emailInformation("dareon@gmail.com");
        webTablesTest.ageInformation("19");
        webTablesTest.salaryInformation("10000");
        webTablesTest.departmentInformation("Test");
        webTablesTest.inputSubmit();
    }
    @Test()
    public void PracticeFormTest()
    {
        practiceFormTest.openWindowAndForms();
        practiceFormTest.nameInformation("Yuriy","Gruzdev");
        practiceFormTest.emailInformation("dareon@gmail.com");
        practiceFormTest.genderInformation();
        practiceFormTest.mobileInformation("89502458776");
        practiceFormTest.dayOfBirthInformation();
        practiceFormTest.inputSubmit();
    }
}