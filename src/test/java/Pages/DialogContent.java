package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@id='mat-input-0'])[1]")
    public WebElement username;

    @FindBy(xpath = "(//input[@id='mat-input-1'])[1]")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN'] span[class='mat-button-wrapper']")
    public WebElement loginButton;
}
