package PageSteps.Elements;

import SelenideElementsTools.A;
import SelenideElementsTools.BasePage;
import SelenideElementsTools.Forms;
import SelenideElementsTools.P;
import io.qameta.allure.Step;

public class PageLinks {
    private final BasePage window = new BasePage("Elements");
    private final Forms linksPageForm = new Forms("Links");
    private final A createButton = new A("created");

    private final A noContentButton = new A("no-content");
    private final A movedButton = new A("moved");
    private final A badRequestButton = new A("bad-request");
    private final A unauthorizedButton = new A("unauthorized");
    private final A forbiddenButton = new A("forbidden");
    private final A notFoundButton = new A("invalid-url");
    private final P linkResponse = new P("linkResponse");
    @Step("Переход к форме")
    public void openLinksForm(){
        window.openBasePage();
        linksPageForm.openFormsPage();
    }
    @Step("Проверка create")
    public void checkCreated(){
        createButton.clickA();
        linkResponse.pCheckText("201 and status text Created");
    }
    @Step("Проверка No Content")
    public void checkNoContent(){
        noContentButton.clickA();
        linkResponse.pCheckText("204 and status text No Content");
    }
    @Step("Проверка Moved")
    public void checkMoved(){
        movedButton.clickA();
        linkResponse.pCheckText("301 and status text Moved Permanently");
    }
    @Step("Проверка Bad Request")
    public void checkBadRequest(){
        badRequestButton.clickA();
        linkResponse.pCheckText("400 and status text Bad Request");
    }
    @Step("Проверка Unauthorized")
    public void checkUnauthorized(){
        unauthorizedButton.clickA();
        linkResponse.pCheckText("401 and status text Unauthorized");
    }
    @Step("Проверка Forbidden")
    public void checkForbidden(){
        forbiddenButton.clickA();
        linkResponse.pCheckText("403 and status text Forbidden");
    }
    @Step("Проверка Not Found")
    public void checkNotFound(){
        notFoundButton.clickA();
        linkResponse.pCheckText("404 and status text Not Found");
    }
}
