package SelenideElementsTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class OpenBasePage {
    private ElementsCollection first=$$(By.cssSelector("div.category-cards h5"));
    private SelenideElement element;
    public OpenBasePage(String text){
        element=first.find(Condition.exactText(text));
    }
    public void openBasePage(){
        element.click();
    }
}
