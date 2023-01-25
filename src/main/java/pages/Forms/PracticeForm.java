package pages.Forms;

import SelenideElementsTools.*;

import java.io.File;

public class PracticeForm {
    public File file=new File("src/main/resources/avatar.jpg");
    public final BasePage forms = new BasePage("Forms");
    public final Forms practiceForm = new Forms("Practice Form");
    public final Input firstNameInput = new Input("firstName");
    public final Input lastNameInput = new Input("lastName");
    public final Input userEmailInput =new Input("userEmail");
    public final Label genderLabel = new Label("genterWrapper");
    public final Label hobieLabel =new Label("hobbiesWrapper");
    public final Input mobileInput = new Input("userNumber");
    public final Input dateOfBirthInput =new Input("dateOfBirthInput");
    public final Input subjectInput =new Input("subjectsInput");
    public final Input uploadInput = new Input("uploadPicture");
    public final TextArea currentAddressTextArea = new TextArea("currentAddress");
    public final Input stateInput =new Input("react-select-3-input");
    public final Input cityInput =new Input("react-select-4-input");
    public final Button submitButton =new Button("submit");
    public final Button closeButton =new Button("closeLargeModal");
}
