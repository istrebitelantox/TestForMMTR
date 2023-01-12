package Interfaces;

import PageSteps.HomePage;
import PageSteps.PageModal;
import PageSteps.PageTextBox;
import PageSteps.WebTables;

public interface IAllPageInformation {
    HomePage homePage=new HomePage();
    WebTables webTables=new WebTables();
    PageTextBox pageTextBox =new PageTextBox();
    PageModal pageModal =new PageModal();
}
