package SelenideElementsTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import java.util.Arrays;

public class CheckText {
    public void checkTextOnPage(ElementsCollection elements, String... value){
        for(String ws:value) {
            System.out.println(elements.find(Condition.exactText(ws)));
        }
        System.out.println(Arrays.toString(value));
    }
}
