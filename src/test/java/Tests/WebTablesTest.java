package Tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;

public class WebTablesTest {
    private static String baseUrl = "https://demoqa.com/";
    private SelenideElement forms = $(By.xpath("//h5[.='Elements']"));
    private SelenideElement practiceform = $(By.xpath("//span[.='Web Tables']"));
    private SelenideElement add = $(By.xpath("//button[@id='addNewRecordButton']"));
    private SelenideElement firstName = $(By.xpath("//input[@id='firstName']"));
    private SelenideElement lastName = $(By.xpath("//input[@id='lastName']"));
    private SelenideElement userEmail = $(By.xpath("//input[@id='userEmail']"));
    private SelenideElement age = $(By.xpath("//input[@id='age']"));
    private SelenideElement salary = $(By.xpath("//input[@id='salary']"));
    private SelenideElement department = $(By.xpath("//input[@id='department']"));
    private SelenideElement submit =$(By.xpath("//button[@id='submit']"));
    PracticeForm practiceFormTest=new PracticeForm();
    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000; // Умное ожидание появление элемента на странице
        Configuration.browserSize = "1620x1080"; // Умно
    }


/*    @Step
    public void test() {
        open(baseUrl);
        forms.should(Condition.visible).click();
        practiceform.should(Condition.visible).click();
        add.should(Condition.visible).click();
        firstName.should(Condition.visible).val("Yuriy");
        lastName.should(Condition.visible).val("Gruzdev");
        userEmail.should(Condition.visible).val("dareon@gmail.com");
        age.should(Condition.visible).val("19");
        salary.should(Condition.visible).val("10000");
        department.should(Condition.visible).val("Test");
        submit.click();
    }*/
    @Step("Открытие формы для заполнения")
    public void OpenWindowAndForms(){
        open(baseUrl);
        forms.should(Condition.visible).click();
        practiceform.should(Condition.visible).click();
        add.should(Condition.visible).click();
    }
    @Step("Ввод информации о работнике")
    public void inputFormsInformation(String first_name,String last_name, String user_Email,String Age, String Salary, String Department){
        firstName.should(Condition.visible).val(first_name);
        lastName.should(Condition.visible).val(last_name);
        userEmail.should(Condition.visible).val(user_Email);
        age.should(Condition.visible).val(Age);
        salary.should(Condition.visible).val(Salary);
        department.should(Condition.visible).val(Department);

/*        firstName.should(Condition.visible).val("Yuriy");
        lastName.should(Condition.visible).val("Gruzdev");
        userEmail.should(Condition.visible).val("dareon@gmail.com");
        age.should(Condition.visible).val("19");
        salary.should(Condition.visible).val("10000");
        department.should(Condition.visible).val("Test");*/
    }
    @Step("Подтверждение информации о новом работнике")
    public void inputSubmit(){
        submit.click();
    }
}