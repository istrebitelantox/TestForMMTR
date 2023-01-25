package pages.Elements;

import SelenideElementsTools.A;
import SelenideElementsTools.BasePage;
import SelenideElementsTools.Forms;
import SelenideElementsTools.P;
import io.qameta.allure.Step;

public class PageLinks {
    public final BasePage window = new BasePage("Elements");
    public final Forms linksPageForm = new Forms("Links");
    public final A createButton = new A("created");

    public final A noContentButton = new A("no-content");
    public final A movedButton = new A("moved");
    public final A badRequestButton = new A("bad-request");
    public final A unauthorizedButton = new A("unauthorized");
    public final A forbiddenButton = new A("forbidden");
    public final A notFoundButton = new A("invalid-url");
    public final P linkResponse = new P("linkResponse");
}