package SelenideElementsTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.net.ServerSocket;

import static com.codeborne.selenide.Selenide.$$;

public class OpenForms {

    private ElementsCollection second=$$(By.cssSelector("ul.menu-list li"));
    private SelenideElement element;
    public OpenForms(String text){
        element=second.find(Condition.exactText(text));
    }


    public void openFormsPage(){
        element.click();
    }
}
