package Tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
public class DownloadAndUpload {
    private static String baseUrl = "https://demoqa.com/";
    private SelenideElement window = $(By.xpath("//h5[.='Elements']"));
    private SelenideElement downloadanduploadform = $(By.xpath("//span[.='Upload and Download']"));
    private SelenideElement downlaodButton = $(By.xpath("//a[@id='downloadButton']"));
    private SelenideElement uploadInput = $(By.xpath("//input[@id='uploadFile']"));
    @Step("Переход к форме")
    public void openWindow(){
        open(baseUrl);
        window.should(Condition.visible).click();
        downloadanduploadform.should(Condition.visible).click();
    }
    @Step("Скачивание файла")
    public void downloadFile()
    {
        downlaodButton.click();
    }
    @Step("Загрузка своего файла")
    public void uploadFile()
    {
        uploadInput.val("/home/yuriy/IdeaProjects/TestForMMTR/2.jpg");
    }
    //C:\\Users\\инет\\IdeaProjects\\TestForMMTR\\2.jpg"

}
