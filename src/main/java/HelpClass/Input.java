package HelpClass;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
public class Input {
    private SelenideElement input;
    public SelenideElement getInput(String inputID)
    {
        input=$(By.cssSelector("input#"+inputID));
        return input;
    }

}
