package org.example.Tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import io.qameta.allure.Step;
import org.example.HelpClass.A;
import org.example.HelpClass.HomePage;
import org.example.HelpClass.Input;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;
public class  DownloadAndUpload {
    File file=new File("avatar.jpg");
    private final SelenideElement window = $(By.xpath("//h5[.='Elements']"));
    private final SelenideElement downloadanduploadform = $(By.xpath("//span[.='Upload and Download']"));
    private final SelenideElement downlaodButton = new A("downloadButton").getA();
    private final SelenideElement uploadInput = new Input("uploadFile").getInput();
    @Step("Переход к форме")
    public void openWindow(){
        window.should(Condition.visible).click();
        downloadanduploadform.should(Condition.visible).click();
    }
    @Step("Скачивание файла")
    public void downloadFile()
    {
        downlaodButton.click();}
    @Step("Загрузка своего файла")
    public void uploadFile()
    {
        uploadInput.uploadFile(file);
    }
}
