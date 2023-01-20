package Tests.AlertsFrameAndWindowsTests;

import Tests.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Feature("AlertsFrameAndWindowsTests")
public class ModalTest extends BaseTest {
    @Link(name="Ссылка на Modal Dialogs",url = "https://demoqa.com/modal-dialogs")
    @DisplayName("Тестирование \"Modal Dialogs\"")
    @Test
    public void modalTest()
    {
        pageModal.openModalForm();
        pageModal.setSmallModal();
        pageModal.checkSmallModalClick();
        pageModal.clickCloseSmallModal();
        pageModal.setLargeModal();
        pageModal.checkLargeModalClick();
        pageModal.clickCloseLargeModal();
    }
}
