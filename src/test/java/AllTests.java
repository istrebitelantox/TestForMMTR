import HelpClass.HomePage;
import Tests.DownloadAndUpload;
import Tests.PageTextBox;
import Tests.PracticeForm;
import Tests.WebTables;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AllTests {

    PracticeForm practiceFormTest=new PracticeForm();
    WebTables webTables =new WebTables();
    DownloadAndUpload downloadAndUpload =new DownloadAndUpload();
    PageTextBox links =new PageTextBox();

    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000;
        Configuration.browserSize = "1920x1080";
    }
    @BeforeEach
    public void Url(){
        open(new HomePage().getBaseUrl());
    }
    @Order(2)
    @Test
    public void webTableTest()
    {
        webTables.openWindowAndForms();
        webTables.nameInformation("Yuriy","Gruzdev");
        webTables.emailInformation("dareon@gmail.com");
        webTables.ageInformation("19");
        webTables.salaryInformation("10000");
        webTables.departmentInformation("Test");
        webTables.inputSubmit();
    }
    @Order(1)
    @Test
    public void practiceFormTest()
    {
        practiceFormTest.openWindowAndForms();
        practiceFormTest.nameInfo("Yuriy","Gruzdev");
        practiceFormTest.emailInfo("dareon@gmail.com");
        practiceFormTest.genderInfo();
        practiceFormTest.mobileInfo("89502458776");
        practiceFormTest.dayOfBirthInfo();
        practiceFormTest.inputPicture("/home/yuriy/IdeaProjects/TestForMMTR/avatar.jpg");
        practiceFormTest.currentAddressInfo("ул. Советска, 19");
        practiceFormTest.inputSubmit();
        practiceFormTest.inputClose();
    }
    @Order(3)
    @Test
    public void downlaodAndUploadTest()
    {
        downloadAndUpload.openWindow();
        downloadAndUpload.downloadFile();
        downloadAndUpload.uploadFile();
    }
    @Order(4)
    @Test
    public void textBoxTest()
    {
        links.openWindow();
        links.setUserName();
        links.setUserEmail();
        links.setUserCurrentAddress();
        links.setUserPermanentAddress();
        links.setSubmitButton();
        links.checkInfo();
    }
}
