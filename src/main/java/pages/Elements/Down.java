package pages.Elements;

import SelenideElementsTools.A;
import SelenideElementsTools.BasePage;
import SelenideElementsTools.Forms;
import SelenideElementsTools.Input;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class Down {
    public File file=new File("src/main/resources/avatar.jpg");
    public BasePage window = new BasePage("Elements");
    public Forms downloadanduploadform = new Forms("Upload and Download");
    public A downlaodButton = new A("downloadButton");
    public Input uploadInput = new Input("uploadFile");
    @SneakyThrows
    public void deleteFIle(){
        File directory = new File(new File(".") + "/data");
        FileUtils.cleanDirectory(directory);
    }
}