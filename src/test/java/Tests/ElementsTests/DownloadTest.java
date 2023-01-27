package Tests.ElementsTests;

import Tests.BaseTest;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@Feature("ElementsTests")
public class DownloadTest extends BaseTest {
    @Test
    @DisplayName("Тестирование скачивания и загрузки файла")
    public void downAndUplTest(){
        step_1();
        step_2();
        step_3();
        step_4();
    }
    @Step("Переход к форме")
    public void step_1(){
        down.window.openBasePage();
        down.downloadanduploadform.openFormsPage();
    }
    @Step("Скачивание файла")
    public void step_2()
    {
        down.downlaodButton.clickA();
    }
    @Step("Загрузка своего файла")
    public void step_3()
    {
        Selenide.sleep(30);
        down.uploadInput.uploadFileInput(down.file);
    }
    @Step("Удалить файлы")
    public void step_4() {
        down.deleteFIle();
    }
}