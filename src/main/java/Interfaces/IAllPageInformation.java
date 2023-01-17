package Interfaces;

import PageSteps.*;
import SelenideElementsTools.WebDriver;

public interface IAllPageInformation {
    HomePage homePage=new HomePage();
    WebTables webTables=new WebTables();
    PageTextBox pageTextBox =new PageTextBox();
    PageModal pageModal =new PageModal();
    PracticeForm practiceForm=new PracticeForm();

    WebDriver driver=new WebDriver();
}
