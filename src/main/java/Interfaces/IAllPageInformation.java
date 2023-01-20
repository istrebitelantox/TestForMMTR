package Interfaces;

import PageSteps.AlertsFrameAndWindows.PageModal;
import PageSteps.Elements.PageTextBox;
import PageSteps.Elements.WebTables;
import PageSteps.Forms.PracticeForm;
import PageSteps.HomePage;
import PageSteps.Elements.PageLinks;

public interface IAllPageInformation {
    HomePage homePage=new HomePage();
    WebTables webTables=new WebTables();
    PageTextBox pageTextBox =new PageTextBox();
    PageModal pageModal =new PageModal();
    PracticeForm practiceForm=new PracticeForm();
    PageLinks pageLinks=new PageLinks();
}
