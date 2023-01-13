package PageSteps;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {
    private ElementsCollection page;
    public void getBaseUrl(){
        open("https://demoqa.com/");
    }
}
