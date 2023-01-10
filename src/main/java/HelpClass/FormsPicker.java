package HelpClass;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
@Getter
public class FormsPicker {
    private SelenideElement item;
    public FormsPicker(Integer childNum,Integer itemNum){
        item=$(By.cssSelector("div.accordion > div:nth-child("+childNum+") li#item-"+itemNum));
    }
}
