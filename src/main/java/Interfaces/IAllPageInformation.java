package Interfaces;

import PageSteps.*;
import PageSteps.AlertsFrameAndWindows.PageModal;
import PageSteps.Elements.PageTextBox;
import PageSteps.Elements.WebTables;
import PageSteps.Forms.PracticeForm;
import SelenideElementsTools.LocalWebDriver;

public interface IAllPageInformation {
    HomePage homePage=new HomePage();
    WebTables webTables=new WebTables();
    PageTextBox pageTextBox =new PageTextBox();
    PageModal pageModal =new PageModal();
    PracticeForm practiceForm=new PracticeForm();

    LocalWebDriver driver=new LocalWebDriver();
}
