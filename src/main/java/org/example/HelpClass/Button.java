package org.example.HelpClass;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class Button {
    private SelenideElement button;
    public Button(String buttonID){
        button=$(By.xpath("//button[@id='"+buttonID+"']"));
    }
}
