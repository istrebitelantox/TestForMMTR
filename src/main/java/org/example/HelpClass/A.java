package org.example.HelpClass;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class A {
    private SelenideElement a;
    public A(String aID){
        this.a=$(By.xpath("//a[@id='"+aID+"']"));
    }
}
