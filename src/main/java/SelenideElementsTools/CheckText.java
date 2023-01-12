package SelenideElementsTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class CheckText {
    private ElementsCollection window;
    public void ssda(ElementsCollection elements, String... value){
        for(String ws:value) {
            System.out.println(elements.find(Condition.exactText(ws)));

        }
        System.out.println(Arrays.toString(value));
    }
}
