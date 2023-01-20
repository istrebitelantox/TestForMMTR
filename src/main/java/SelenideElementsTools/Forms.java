package SelenideElementsTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class Forms {

    private final ElementsCollection second=$$(By.cssSelector("ul.menu-list li"));
    private final SelenideElement element;
    public Forms(String text){
        element=second.find(Condition.exactText(text));
    }


    public void openFormsPage(){
        element.click();
    }
}
