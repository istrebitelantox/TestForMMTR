package Tests;

import Interfaces.IPracticeForm;
import org.junit.jupiter.api.Test;

public class PracticeFormTest extends BaseTest implements IPracticeForm {
    @Test
    public void practiceFormTest(){
        practiceForm.openWindowAndForms();

    }
}
