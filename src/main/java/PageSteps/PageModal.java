package PageSteps;

import SelenideElementsTools.Button;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageModal {
    private final SelenideElement window = $(By.cssSelector("div.category-cards>div:nth-child(3)"));
            //new CategoryCards(3).getCategory();
    private final SelenideElement modalForm =$(By.cssSelector("div.accordion > div:nth-child(3) li#item-4"));
                    //new FormsPicker(3,4).getItem();
    private final Button smallModalButton =new Button("showSmallModal");
    private final Button largeModalButton =new Button("showLargeModal");
    private final Button closeSmallModalButton =new Button("closeSmallModal");
    private final Button closeLargeModalButton =new Button("closeLargeModal");
    private final SelenideElement textSmall =$(By.cssSelector("div.modal-body"));
    private final SelenideElement textLarge =$(By.cssSelector("div.modal-body>p"));
    @Step("Переход к форме")
    public void openWindow(){
        window.should(Condition.visible).click();
        modalForm.should(Condition.visible).click();
    }
    @Step("Открытие мальенького модального окна")
    public void setSmallModal()
    {
        smallModalButton.setClick();
    }
    @Step("Проверка текста в маленьком модальном окне")
    public void checkSmallModalClick(){
        textSmall.should(Condition.text("This is a small modal. It has very less content"));
    }
    @Step("Закрытие маленького модального окна")
    public void clickCloseSmallModal(){
        closeSmallModalButton.setClick();
    }
    @Step("Открытие большого модального окна")
    public void setLargeModal()
    {
        largeModalButton.setClick();
    }
    @Step("Проверка текста в большом модальном окне")
    public void checkLargeModalClick(){
        textLarge.should(Condition.text("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's "));
    }
    @Step("Закрытие большоного модального окна")
    public void clickCloseLargeModal(){
        closeLargeModalButton.setClick();
    }
}
