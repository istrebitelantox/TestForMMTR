package Interfaces;

import pages.AlertsFrameAndWindows.PageModal;
import pages.Elements.Down;
import pages.Elements.PageTextBox;
import pages.Elements.WebTables;
import pages.Forms.PracticeForm;
import pages.HomePage;
import pages.Elements.PageLinks;

public interface IAllPageInformation {
    HomePage homePage=new HomePage();
    WebTables webTables=new WebTables();
    PageTextBox pageTextBox =new PageTextBox();
    PageModal pageModal =new PageModal();
    PracticeForm practiceForm=new PracticeForm();
    PageLinks pageLinks=new PageLinks();
    Down down=new Down();
}
