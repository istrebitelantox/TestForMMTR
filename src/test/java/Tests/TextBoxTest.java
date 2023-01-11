package Tests;

import Interfaces.IPageTextBox;
import Interfaces.IPerson;
import org.junit.jupiter.api.Test;

public class TextBoxTest extends BaseTest implements IPerson, IPageTextBox {
    @Test
    public void textBoxTest()
    {
        pageTextBox.openWindow();
        pageTextBox.setUserName();
        pageTextBox.setUserEmail();
        pageTextBox.setUserCurrentAddress();
        pageTextBox.setUserPermanentAddress();
        pageTextBox.setSubmitButton();
        pageTextBox.checkInfo(person);
    }
}
