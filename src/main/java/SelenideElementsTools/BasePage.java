package SelenideElementsTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class BasePage {
    private final ElementsCollection first=$$(By.cssSelector("div.category-cards h5"));
    private final SelenideElement element;
    public BasePage(String text){
        element=first.find(Condition.exactText(text));
    }
    public void openBasePage(){
        element.click();
    }
}
