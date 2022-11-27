package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@id='mat-input-0'])[1]")
    private WebElement username;

    @FindBy(xpath = "(//input[@id='mat-input-1'])[1]")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN'] span[class='mat-button-wrapper']")
    private WebElement loginButton;

    @FindBy(css = ".mat-tooltip-trigger.logo-text")
    private WebElement txtTechnoStudy;

    WebElement myElement;
    public void findAndSend(String strlement, String value)
    {
        //ELEMENT GET !!
        switch (strlement)
        {
            case "username" : myElement=username;break;
            case "password" : myElement=password;break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strlement)
    {
        //ELEMENT GET !!
        switch (strlement)
        {
            case "loginButton" : myElement=loginButton;break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strlement, String text)
    {
        //ELEMENT GET !!
        switch (strlement)
        {
            case "txtTechnoStudy" : myElement=txtTechnoStudy;break;
        }
        verifyContainsTextFunction(myElement, text);
    }







}
