package Tests;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$;

public class Elements extends BaseTest {
    private final ElementsCollection window = $$(By.cssSelector("div.category-cards h5"));
    private final ElementsCollection elements=$$(By.cssSelector("ul.menu-list li"));
    @Step("Переход к форме")
    public void openWindow() {
        window.find(exactText("Alerts, Frame & Windows")).click();
        elements.forEach(e-> System.out.println(e.getText()));
    }
    @Test
    public void asdsda(){
        openWindow();
    }
}
