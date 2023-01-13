package PageSteps;

import static com.codeborne.selenide.Selenide.open;

public class HomePage {
    public void getBaseUrl(){
        open("https://demoqa.com/");
    }
}
