import Tests.DownloadAndUpload;
import Tests.Links;
import Tests.PracticeForm;
import Tests.WebTables;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Flaky;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AllTests {

    PracticeForm practiceFormTest=new PracticeForm();
    WebTables webTables =new WebTables();
    DownloadAndUpload downloadAndUpload =new DownloadAndUpload();
    Links links =new Links();
    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000;
        Configuration.browserSize = "1620x1080";
    }
    @Test()
    public void WebTableTest()
    {
        webTables.openWindowAndForms();
        webTables.nameInformation("Yuriy","Gruzdev");
        webTables.emailInformation("dareon@gmail.com");
        webTables.ageInformation("19");
        webTables.salaryInformation("10000");
        webTables.departmentInformation("Test");
        webTables.inputSubmit();
    }
    @Test
    public void PracticeFormTest()
    {
        practiceFormTest.openWindowAndForms();
        practiceFormTest.nameInfo("Yuriy","Gruzdev");
        practiceFormTest.emailInfo("dareon@gmail.com");
        practiceFormTest.genderInfo();
        practiceFormTest.mobileInfo("89502458776");
        practiceFormTest.dayOfBirthInfo();
        practiceFormTest.inputPicture("C:\\Users\\инет\\IdeaProjects\\TestForMMTR\\2.jpg");
        practiceFormTest.currentAddressInfo("ул. Советска, 19");
        practiceFormTest.inputSubmit();
    }
    @Test
    @Flaky
    public void downlaodAndUploadTest()
    {
        downloadAndUpload.openWindow();
        downloadAndUpload.downloadFile();
        downloadAndUpload.uploadFile();
    }
    @Test
    public void linksTest()
    {
        links.openWindow();
        links.createdCheck();
        links.noContentCheck();
        links.movedCheck();
        links.badRequestCheck();
        links.unauthorizedCheck();
        links.forbiddenCheck();
        links.notFoundCheck();
    }
}