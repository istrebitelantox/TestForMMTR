package SelenideElementsTools;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TextArea {
    private final SelenideElement textArea;
    public TextArea(String textAreaID){
        textArea=$(By.cssSelector("textarea#"+textAreaID));
    }
    public void setTextAreaValue(String value){
        textArea.setValue(value);
    }
}
