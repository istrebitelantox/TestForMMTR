package SelenideElementsTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class Label {
    private final ElementsCollection elements;
    private SelenideElement label;
    public Label(String text){
        elements=$$(By.cssSelector("div#"+text+" "+ "label"));
    }
    public void setLabel(String text){
        label=elements.find(Condition.exactText(text));
    }
    public void clickLabel(){
        label.click();
    }
}
