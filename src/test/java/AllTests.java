import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Tests.*;

public class AllTests {
    PracticeForm practiceFormTest=new PracticeForm();
    WebTablesTest webTablesTest=new WebTablesTest();
    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000; // Умное ожидание появление элемента на странице
        Configuration.browserSize = "1620x1080"; // Умно
    }
    @Test
    public void PracticeFormTest()
    {
        webTablesTest.test();
    }
    @Test
    public void base()
    {
        practiceFormTest.authorisation();
    }
}