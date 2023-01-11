package SelenideElementsTools;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Button {
    private SelenideElement button;
    public Button(String buttonID){
        button=$(By.cssSelector("button#"+buttonID));
    }
    public void setBtnClick(){
        button.click();
    }
}
