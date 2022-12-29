package org.example.HelpClass;

import com.codeborne.selenide.SelenideElement;
import lombok.Generated;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
@Getter
public class Input {
    private final SelenideElement input;
    public Input(String inputID){
        this.input=$(By.xpath("//input[@id='"+inputID+"']"));
    }
}
