package SelenideElementsTools;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;

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
    public void uploadFileInput(File file){
        input.uploadFile(file);
    }
}
