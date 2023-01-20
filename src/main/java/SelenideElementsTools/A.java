package SelenideElementsTools;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class A {
    private final SelenideElement a;
    public A(String aID){
        a=$(By.cssSelector("a#"+aID));
    }
    public void setA(String value){
        a.setValue(value);
    }
    public void clickA(){
        a.click();
    }

}
