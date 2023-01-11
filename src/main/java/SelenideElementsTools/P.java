package SelenideElementsTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
public class P {
    private final SelenideElement p;
    public P(String pID){
        p=$(By.cssSelector("p#"+pID));
    }
    public void checkText(String text)
    {
        p.should(Condition.text(text));
    }
}
