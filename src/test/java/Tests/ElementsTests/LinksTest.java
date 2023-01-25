package Tests.ElementsTests;

import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("ElementsTests")
public class LinksTest extends BaseTest {
    @Link(name = "Ссылка на Modal Dialogs", url = "https://demoqa.com/links")
    @DisplayName("Тестирование \"Links\"")
    @Test
    public void linksTest() {
        step_1();
        step_2();
        step_3();
        step_4();
        step_5();
        step_6();
        step_7();
        step_8();
    }

    @Step("Переход к форме")
    public void step_1() {
        pageLinks.window.openBasePage();
        pageLinks.linksPageForm.openFormsPage();
    }

    @Step("Проверка create")
    public void step_2() {
        pageLinks.createButton.clickA();
        pageLinks.linkResponse.pCheckText("201 and status text Created");
    }

    @Step("Проверка No Content")
    public void step_3() {
        pageLinks.noContentButton.clickA();
        pageLinks.linkResponse.pCheckText("204 and status text No Content");
    }

    @Step("Проверка Moved")
    public void step_4() {
        pageLinks.movedButton.clickA();
        pageLinks.linkResponse.pCheckText("301 and status text Moved Permanently");
    }

    @Step("Проверка Bad Request")
    public void step_5() {
        pageLinks.badRequestButton.clickA();
        pageLinks.linkResponse.pCheckText("400 and status text Bad Request");
    }

    @Step("Проверка Unauthorized")
    public void step_6() {
        pageLinks.unauthorizedButton.clickA();
        pageLinks.linkResponse.pCheckText("401 and status text Unauthorized");
    }

    @Step("Проверка Forbidden")
    public void step_7() {
        pageLinks.forbiddenButton.clickA();
        pageLinks.linkResponse.pCheckText("403 and status text Forbidden");
    }

    @Step("Проверка Not Found")
    public void step_8() {
        pageLinks.notFoundButton.clickA();
        pageLinks.linkResponse.pCheckText("404 and status text Not Found");
    }
}