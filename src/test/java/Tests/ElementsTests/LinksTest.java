package Tests.ElementsTests;

import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("ElementsTests")
public class LinksTest extends BaseTest {
    @Link(name="Ссылка на Modal Dialogs",url = "https://demoqa.com/links")
    @DisplayName("Тестирование \"Links\"")
    @Test
    public void linksTest(){
        pageLinks.openLinksForm();
        pageLinks.checkCreated();
        pageLinks.checkNoContent();
        pageLinks.checkMoved();
        pageLinks.checkBadRequest();
        pageLinks.checkUnauthorized();
        pageLinks.checkForbidden();
        pageLinks.checkNotFound();
    }
}
