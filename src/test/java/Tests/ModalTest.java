package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

public class ModalTest extends BaseTest{
    @DisplayName("Тестирование \"Modal Dialogs\"")
    @Test
    public void modalTest()
    {
        pageModal.openWindow();
        pageModal.setSmallModal();
        pageModal.checkSmallModalClick();
        pageModal.clickCloseSmallModal();
        pageModal.setLargeModal();
        pageModal.checkLargeModalClick();
        pageModal.clickCloseLargeModal();
    }
}
