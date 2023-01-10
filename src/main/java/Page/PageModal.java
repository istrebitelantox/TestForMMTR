package Page;
import HelpClass.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageModal {
    Button button=new Button();
    private final SelenideElement window = $(By.cssSelector("div.category-cards>div:nth-child(3)"));
            //new CategoryCards(3).getCategory();
    private final SelenideElement modalForm =$(By.cssSelector("div.accordion > div:nth-child(3) li#item-4"));
                    //new FormsPicker(3,4).getItem();
    private final SelenideElement smallModalButton =button.getButton("showSmallModal");
    private final SelenideElement largeModalButton =button.getButton("showLargeModal");
    private final SelenideElement closeSmallModalButton =button.getButton("closeSmallModal");
    private final SelenideElement closeLargeModalButton =button.getButton("closeLargeModal");
    private final SelenideElement textSmall =$(By.cssSelector("div.modal-body"));
    private final SelenideElement textLarge =$(By.cssSelector("div.modal-body>p"));
    @Step("Переход к форме")
    public void openWindow(){
        window.should(Condition.visible).click();
        modalForm.should(Condition.visible).click();
    }
    @Step("Скачивание файла")
    public void setSmallModal()
    {
        smallModalButton.click();
    }
    @Step
    public void checkSmallModalClick(){
        Assertions.assertEquals("This is a small modal. It has very less content",textSmall.getText());
    }
    @Step
    public void clickCloseSmallModal(){
        closeSmallModalButton.should(Condition.visible).click();
    }
    @Step("Скачивание файла")
    public void setLargeModal()
    {
        largeModalButton.click();
    }
    @Step
    public void checkLargeModalClick(){
        Assertions.assertEquals("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's " +
                "standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a " +
                "type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining" +
                " essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                textLarge.getText());
    }
    @Step
    public void clickCloseLargeModal(){
        closeLargeModalButton.should(Condition.visible).click();
    }
}
