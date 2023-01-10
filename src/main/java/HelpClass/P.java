package HelpClass;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
public class P {
    private SelenideElement p;
    public SelenideElement getP(String pID)
    {
        p=$(By.cssSelector("p#"+pID));
        return p;
    }
}
