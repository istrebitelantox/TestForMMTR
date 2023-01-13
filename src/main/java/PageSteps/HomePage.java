package PageSteps;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.open;

public class HomePage {
    private ElementsCollection page;
    public void getBaseUrl(){
        open("https://demoqa.com/");
    }
}
