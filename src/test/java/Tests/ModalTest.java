package Tests;

import Interfaces.IPageModal;
import org.junit.jupiter.api.Test;

public class ModalTest extends BaseTest implements IPageModal {
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
