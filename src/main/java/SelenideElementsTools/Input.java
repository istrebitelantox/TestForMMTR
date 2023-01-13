package SelenideElementsTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.File;
import java.time.Duration;

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
    public String getInputValue(){
        return input.getValue();
    }
    public void setInputClick(){
        input.click();
    }
    public void uploadFileInput(File file){
        input.uploadFile(file);
    }
    public void sendKeysCtrlAndLeft(){
        input.sendKeys(Keys.CONTROL,Keys.ARROW_LEFT);
    }
    public void sendKeyEnt(){
        input.sendKeys(Keys.ENTER);
    }
    public void sendKeyDel(){
        input.sendKeys(Keys.DELETE);
    }
    public void inputDate(String date){
        setInputValue(date);
        for (int i = 0; i < 3; i++) {
            sendKeysCtrlAndLeft();
        }
        while (getInputValue().length()>10){
            sendKeyDel();
        }
        sendKeyEnt();
    }

}
