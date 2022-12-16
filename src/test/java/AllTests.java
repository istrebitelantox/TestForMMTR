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
        //Открывается окно, а затем форма для заполнения
        webTables.openWindow();
        //Заполняется имя и фамилия работника
        webTables.nameInformation("Yuriy","Gruzdev");
        //Заполняется e-mail работника
        webTables.emailInformation("dareon@gmail.com");
        //Заполняется возраст работника
        webTables.ageInformation("19");
        //Заполняется зарплата работника
        webTables.salaryInformation("10000");
        //Заполняется подразделение работника
        webTables.departmentInformation("Test");
        //Принимается информация о работнике и добавляется в таблицу
        webTables.inputSubmit();
    }
    @Test
    public void PracticeFormTest()
    {
        //Открывается окно, а затем форма для заполнения
        practiceFormTest.openWindow();
        //Заполняется имя и фамилия студента
        practiceFormTest.nameInfo("Yuriy","Gruzdev");
        //Заполняется e-mail студента
        practiceFormTest.emailInfo("dareon@gmail.com");
        //Заполняется пол студента
        practiceFormTest.genderInfo();
        //Заполняется мобильный телефон студента
        practiceFormTest.mobileInfo("89502458776");
        //Заполняется дата рождения студента
        practiceFormTest.dayOfBirthInfo();
        //Вставляется фотография студента
        practiceFormTest.inputPicture("C:\\Users\\инет\\IdeaProjects\\TestForMMTR\\2.jpg");
        //Заполняется адресс студента
        practiceFormTest.currentAddressInfo("ул. Советска, 19");
        //Принимается информация о студенте
        practiceFormTest.inputSubmit();
        //Закрывается форма
        practiceFormTest.inputClose();
    }
    @Test
    @Flaky
    public void downlaodAndUploadTest()
    {
        //Открывается окно, а затем форма для заполнения
        downloadAndUpload.openWindow();
        //Скачивается файл с сайта
        downloadAndUpload.downloadFile();
        //Загружается своя фотография
        downloadAndUpload.uploadFile();
    }
    @Test
    public void linksTest()
    {
        //Открывается окно, а затем форма
        links.openWindow();
        //Открывается ссылка и проверятеся ответ
        links.createdCheck();
        //Открывается ссылка и проверятеся ответ
        links.noContentCheck();
        //Открывается ссылка и проверятеся ответ
        links.movedCheck();
        //Открывается ссылка и проверятеся ответ
        links.badRequestCheck();
        //Открывается ссылка и проверятеся ответ
        links.unauthorizedCheck();
        //Открывается ссылка и проверятеся ответ
        links.forbiddenCheck();
        //Открывается ссылка и проверятеся ответ
        links.notFoundCheck();
    }
}
