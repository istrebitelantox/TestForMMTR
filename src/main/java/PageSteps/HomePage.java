package PageSteps;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    private ElementsCollection page;
    public void inputText(String text){
        page.find(exactText("Alerts, Frame & Windows"));
    }
    public String getBaseUrl(){
        return "https://demoqa.com/";
    }
}
