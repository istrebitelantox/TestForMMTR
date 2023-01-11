package SelenideElementsTools;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class A {
    private SelenideElement a;
    public A(String aID){
        this.a=$(By.cssSelector("a#"+aID));
    }
    public void setA(String value){
        a.setValue(value);
    }
}
