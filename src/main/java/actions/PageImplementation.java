package actions;

import path.PagePath;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class PageImplementation extends CoreActions {
    public PageImplementation(WebDriver data) {
        super(data);
    }

    public void PressContact() {
        Click(PagePath.Contact);
    }

    public void ChooseHeading() {
        ChooseSubject(PagePath.SubjectHeading);
    }

    public void ValidEmail(String text) {
        VerifyEmail(PagePath.Email,text);
    }

    public void EnterMessage(String text) {
        WriteMessage(PagePath.Message,text);
    }

    public void PressClick() {
        Click(PagePath.Send);
    }
}
    
    
    