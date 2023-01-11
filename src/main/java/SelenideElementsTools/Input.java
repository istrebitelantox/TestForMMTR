package SelenideElementsTools;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
public class Input {
    private SelenideElement input;
    public Input(String inputID){
        input=$(By.cssSelector("input#"+inputID));
    }
    public void setInputValue(String value)
    {
        input.setValue(value);
    }
    public void setInputClick(){
        input.click();
    }
}
