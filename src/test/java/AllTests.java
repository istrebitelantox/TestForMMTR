import HelpClass.HomePage;
import Page.*;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;
public class AllTests {

    PracticeForm practiceFormTest=new PracticeForm();
    WebTables webTables =new WebTables();
    PageModal pageModal =new PageModal();
    PageTextBox pageTextBox =new PageTextBox();

    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000;
        Configuration.browserSize = "1920x1080";
    }
    @BeforeEach
    public void Url(){
        open(new HomePage().getBaseUrl());
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
        pageTextBox.checkInfo();
    }
}
