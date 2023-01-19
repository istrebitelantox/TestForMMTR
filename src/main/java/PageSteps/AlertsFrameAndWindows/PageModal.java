package PageSteps.AlertsFrameAndWindows;

import SelenideElementsTools.Button;
import SelenideElementsTools.CheckText;
import SelenideElementsTools.OpenBasePage;
import SelenideElementsTools.OpenForms;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageModal {
    CheckText checkText=new CheckText();
    private final OpenBasePage window = new OpenBasePage("Alerts, Frame & Windows");
    private final OpenForms modalForm =new OpenForms("Modal Dialogs");
    private final Button smallModalButton =new Button("showSmallModal");
    private final Button largeModalButton =new Button("showLargeModal");
    private final Button closeSmallModalButton =new Button("closeSmallModal");
    private final Button closeLargeModalButton =new Button("closeLargeModal");
    private final SelenideElement textSmall =$(By.cssSelector("div.modal-body"));
    private final SelenideElement textLarge =$(By.cssSelector("div.modal-body>p"));
    @Step("Переход к форме")

    public void openWindow(){
        //checkText.checkTextOnPage(window,"Elements","Forms","Alerts, Frame & Windows","Widgets","Interactions","Book Store Application");
        window.openBasePage();
        modalForm.openFormsPage();
    }
    @Step("Открытие мальенького модального окна")
    public void setSmallModal()
    {
        smallModalButton.setBtnClick();
    }
    @Step("Проверка текста в маленьком модальном окне")
    public void checkSmallModalClick(){
        textSmall.should(Condition.text("This is a small modal. It has very less content"));
    }
    @Step("Закрытие маленького модального окна")
    public void clickCloseSmallModal(){
        closeSmallModalButton.setBtnClick();
    }
    @Step("Открытие большого модального окна")
    public void setLargeModal()
    {
        largeModalButton.setBtnClick();
    }
    @Step("Проверка текста в большом модальном окне")
    public void checkLargeModalClick(){
        textLarge.should(Condition.text("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's "));
    }
    @Step("Закрытие большого модального окна")
    public void clickCloseLargeModal(){
        closeLargeModalButton.setBtnClick();
    }
}
