package Tests.AlertsFrameAndWindowsTests;

import Tests.BaseTest;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Feature("AlertsFrameAndWindowsTests")
public class ModalTest extends BaseTest {
    @Link(name = "Ссылка на Modal Dialogs", url = "https://demoqa.com/modal-dialogs")
    @DisplayName("Тестирование \"Modal Dialogs\"")
    @Test
    public void modalTest() {
        step_1();
        step_2();
        step_3();
        step_4();
        step_5();
        step_6();
        step_7();
    }

    @Step("Переход к форме")
    public void step_1() {
        //checkText.checkTextOnPage(window,"Elements","Forms","Alerts, Frame & Windows","Widgets","Interactions","Book Store Application");
        pageModal.window.openBasePage();
        pageModal.modalForm.openFormsPage();
    }

    @Step("Открытие мальенького модального окна")
    public void step_2() {
        pageModal.smallModalButton.setBtnClick();
    }

    @Step("Проверка текста в маленьком модальном окне")
    public void step_3() {
        pageModal.textSmall.should(Condition.text("This is a small modal. It has very less content"));
    }

    @Step("Закрытие маленького модального окна")
    public void step_4() {
        pageModal.closeSmallModalButton.setBtnClick();
    }

    @Step("Открытие большого модального окна")
    public void step_5() {
        pageModal.largeModalButton.setBtnClick();
    }

    @Step("Проверка текста в большом модальном окне")
    public void step_6() {
        pageModal.textLarge.should(Condition.text("Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                " Lorem Ipsum has been the industry's "));
    }

    @Step("Закрытие большого модального окна")
    public void step_7() {
        pageModal.closeLargeModalButton.setBtnClick();
    }
}