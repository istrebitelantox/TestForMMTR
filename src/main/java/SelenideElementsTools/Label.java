package SelenideElementsTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class Label {
    private SelenideElement label;
    public Label(String text1,String text2){
        label=$$(By.cssSelector("div#"+text1+" "+ "label")).find(Condition.exactText(text2));
    }
    public void clickLabel(){
        label.click();
    }
}
