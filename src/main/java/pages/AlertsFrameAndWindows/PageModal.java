package pages.AlertsFrameAndWindows;

import SelenideElementsTools.BasePage;
import SelenideElementsTools.Button;
import SelenideElementsTools.CheckText;
import SelenideElementsTools.Forms;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageModal {
    CheckText checkText = new CheckText();
    public final BasePage window = new BasePage("Alerts, Frame & Windows");
    public final Forms modalForm = new Forms("Modal Dialogs");
    public final Button smallModalButton = new Button("showSmallModal");
    public final Button largeModalButton = new Button("showLargeModal");
    public final Button closeSmallModalButton = new Button("closeSmallModal");
    public final Button closeLargeModalButton = new Button("closeLargeModal");
    public final SelenideElement textSmall = $(By.cssSelector("div.modal-body"));
    public final SelenideElement textLarge = $(By.cssSelector("div.modal-body>p"));
}