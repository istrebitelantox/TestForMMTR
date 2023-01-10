package HelpClass;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Button {
    private SelenideElement button;
    public SelenideElement getButton(String buttonID){
        button=$(By.cssSelector("button#"+buttonID));
        return button;
    }
}
