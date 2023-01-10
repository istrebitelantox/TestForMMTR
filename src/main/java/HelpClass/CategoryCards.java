package HelpClass;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class CategoryCards {
    private SelenideElement category;
    public CategoryCards(Integer category){
        this.category=$(By.cssSelector("div.category-cards>div:nth-child("+category+")"));
    }
}
